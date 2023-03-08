package _JDBC.Gün2;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends JDBCParent {
    // todo last,first,getRow,getInd,getDouble
    @Test
    public void test1() throws SQLException {

        ResultSet rs=statement.executeQuery("select city_id,city,country_id from city");

        rs.last(); //todo sonuncu row a gider
        String id=rs.getString(1); //todo burda kolon yani sütunu seciyoruz
        System.out.println("id ="+id);

        int idInt=rs.getInt(1);
        System.out.println("idInt ="+ idInt);

        String name=rs.getString(2);
        System.out.println("name ="+name);




    }
}
