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
    public static void main(String[] args) {
        //todo yaptigimiz metodu cagirdigimiz ve calistirdigimiz kisim
        List<List< String >> tablo = getListData("select * from actor");

        for (List<String>satir:tablo)
            System.out.println("satir =" + satir);
    }
    public static List<List<String>>getListData(String query){
        //todo bütün satirlari ve sutunlari bu liste at
        List<List<String>>tablo=new ArrayList<>();

        //todo database baglantisini ac
        DBConnectionOpen();

       try {
           //todo sorguyu calistir.
           ResultSet rs = statement.executeQuery("select * from language");

          //todo bütün satirlari ve o satirlardaki sütunlari oku ve tabloya ekle
           int columnSayisi=rs.getMetaData().getColumnCount();
           while (rs.next())
           {
               List<String>satir=new ArrayList<>();
               for (int i = 0; i < columnSayisi; i++) {
                  satir.add(rs.getString(i));

               }
               tablo.add(satir);
           }}
        catch (Exception ex){
            System.out.println("ex.getMessage"+ex.getMessage());
        }
       //todo database baglantisini kapat
        DBConnectionClose();
        return tablo;
    }
}
