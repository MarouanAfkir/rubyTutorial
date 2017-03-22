import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Simple Java Program to connect Oracle database by using Oracle JDBC thin driver
 * Make sure you have Oracle JDBC thin driver in your classpath before running this program
 * @author
 */
public class prj_ConnectDatabaseOracleWithJava {

    public static void main(String args[]) throws SQLException {
        //URL of Oracle database server
        String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
      
        //properties for creating connection to Oracle database

      
        //creating connection to Oracle database using JDBC
        Connection conn = DriverManager.getConnection(url,"SYSTEM","oracle");

        String sql ="select * from TESTINGTABLE where name like '%A%' ";

        //creating PreparedStatement object to execute query
        PreparedStatement preStatement = conn.prepareStatement(sql);
    
        ResultSet result = preStatement.executeQuery();
      
        while(result.next()){
            System.out.println(result.getInt("no")+", "+result.getString("name"));
        }
        System.out.println("done");

}
}