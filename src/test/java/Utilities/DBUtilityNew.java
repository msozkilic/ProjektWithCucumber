package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtilityNew {
    public static Statement statement;
    public static Connection connection;
    public static ArrayList<ArrayList<String>> getListData(String url,String username,String password,String query) {

        ArrayList< ArrayList<String> > tablo=new ArrayList<>();

        Connection connection=null;
        Statement statement= null;

        try {
            connection=DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            ResultSet rs = statement.executeQuery(query);
            int columnCount = rs.getMetaData().getColumnCount();

            for (int i = 0; i < columnCount; i++) {
                System.out.println(rs.getMetaData().getColumnName(i));
            }

            while (rs.next()) {

                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++)
                    satir.add(rs.getString(i));

                tablo.add(satir);
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return tablo;
    }
}

