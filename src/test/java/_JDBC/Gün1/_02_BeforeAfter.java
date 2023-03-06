package _JDBC.Gün1;

import _JDBC.Gün2.JDBCParent;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter extends JDBCParent {



    @Test
    public  void test1() throws SQLException {
        //todo sorgu calisacak
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString("name");
        System.out.println("dilAdi ="+ dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi ="+ dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi ="+ dilAdi);

    }
    @Test
    public  void  test2() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi ="+ dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi ="+ dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi ="+ dilAdi);

    }
    @Test
    public  void  test3() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi ="+ dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi ="+ dilAdi);

        rs.previous();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi ="+ dilAdi);


    }
}
