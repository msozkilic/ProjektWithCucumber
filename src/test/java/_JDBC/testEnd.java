package _JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class testEnd {


    @Test
            public  void test1() throws SQLException {
        String url = "";
        String username = "";
        String password = "";

        Connection  connection = DriverManager.getConnection(url, username, password);
        Statement  statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from actor");

        rs.next();
        ResultSetMetaData rsmd=rs.getMetaData();

        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.println("%-20s"+rsmd.getColumnName(i));

            while (rs.next()){}
            for (int j = 1; j < rsmd.getColumnCount(); j++) {
                System.out.println("%-20s"+rs.getString(i));
                System.out.println();

            }

        }
        connection.close();

            }

        }







