package _JDBC.Gün2;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        System.out.println("ColumnCount =" + columnCount);

        for (int i = 0; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            String columnType = rsmd.getColumnTypeName(i);

            System.out.println(columnType + " " + columnName);
        }
    }

    @Test
    public void test2() throws SQLException {
        // todo language tablosundaki tüm satirlari ve sütunlari yazdiriniz yani tüm tabloyu basliklarla

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

