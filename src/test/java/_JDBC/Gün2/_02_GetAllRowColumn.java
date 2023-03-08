package _JDBC.Gün2;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent{

    @Test
    public void test1() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");

        ResultSetMetaData rsmd=rs.getMetaData();

        int columnCount= rsmd.getColumnCount();
        System.out.println("ColumnCount ="+columnCount);

        for (int i = 0; i <=columnCount ; i++) {
            String columnName=rsmd.getColumnName(i);
            String columnType=rsmd.getColumnTypeName(i);

            System.out.println(columnType+ " "+columnName);


        }
    }
}
