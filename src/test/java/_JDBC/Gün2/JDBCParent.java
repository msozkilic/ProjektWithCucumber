package _JDBC.Gün2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    private  static Connection connection;
    protected    static Statement statement;

    @BeforeTest
    public void DBConnectionOpen(){
        //todo baglanti islemleri yapilacak

        String url="jdbc:mysql://db_technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";  // todo hostname ,port,db,adini ver(user db)
        String username="root";
        String password="'\"-LhCB'.%k[4s]z";

        try {
            connection = DriverManager.getConnection(url,username,password);
            statement=connection.createStatement(); // sorgulari calistirmak icin page acildi
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterTest
    public void DBConnectionClose(){
        // todo kapatma islemleri yapilacak
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
