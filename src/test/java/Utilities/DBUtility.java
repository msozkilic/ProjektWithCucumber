package Utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    protected static Connection connection;
    protected    static Statement statement;

    public static void DBConnectionOpen(){
        //todo baglanti islemleri yapilacak

        String url="jdbc:mysql://db_technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";  // todo hostname ,port,db,adini ver(user db)
        String username="root";
        String password="'\"-LhCB'.%k[4s]z";

        try {
            connection = DriverManager.getConnection(url,username,password);
            statement=connection.createStatement(); // sorgulari calistirmak icin page acildi
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }}

    public static void DBConnectionClose(){
        // todo kapatma islemleri yapilacak
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
