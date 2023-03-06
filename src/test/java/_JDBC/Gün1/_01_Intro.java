package _JDBC.Gün1;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test1() throws SQLException {
        String url="jdbc:mysql://db_technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";  // todo hostname ,port,db,adini ver(user db)
        String username="root";
        String password="'\"-LhCB'.%k[4s]z";

        Connection connection= DriverManager.getConnection(url,username,password); // connection

        Statement statement=connection.createStatement(); // sorgulari calistirmak icin page acildi

        ResultSet rs= statement.executeQuery("select * from actor");

        rs.next();

        String firstName=rs.getString("first_name");
        String lastName=rs.getString("last_name");

        System.out.println("first_name"+ firstName);
        System.out.println("last_name"+lastName);







    }
}
