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

        String firstName=rs.getString("first_name");
        System.out.println(firstName);

        String idName=rs.getString(2);
        System.out.println(idName);

        ResultSetMetaData rsmd= rs.getMetaData();

        String sütünAd=rsmd.getColumnName(1);
        System.out.println(sütünAd);

        int sütunNo=rsmd.getColumnCount();
        System.out.println(sütunNo);



    }
}



