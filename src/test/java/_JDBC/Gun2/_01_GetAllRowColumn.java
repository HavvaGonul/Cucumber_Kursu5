package _JDBC.Gun2;

import _JDBC.JDBCParent;
import com.mysql.cj.protocol.x.ResultMessageListener;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _01_GetAllRowColumn extends JDBCParent {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select*from language");
        ResultSetMetaData rsmd = rs.getMetaData(); //kolon sayisi, isimleri, tipleri


        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");


        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i < rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }

    }
}