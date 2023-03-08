package _JDBC.Gün2;

import org.testng.annotations.Test;

import java.sql.*;

public class test4 extends JDBCParent {
    //todo actor tablosundaki tüm satirlari ve sütunlari yazdiriniz,msqldeki gibi
    //todo fakat metod jullaniniz,metoda sorgu göndeririniz ve orada yaziniz
    @Test
    public void test4() throws SQLException {

        getRowAndColumn("select * from actor");

    }

    public void getRowAndColumn(String resultSet) throws SQLException {

        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i < rsmd.getColumnCount(); i++) {
            System.out.println("%-20s" + "rsmd =" + rsmd.getColumnName(i));

            System.out.println();

            while (rs.next()) { //todo otomatik hep bir sonrakine gidiyor.
                for (int j = 1; j < rsmd.getColumnCount(); j++) {
                    System.out.println("%-20s" + rs.getString(i) + " ");

                    System.out.println();

                }
            }


        }
    }
}




