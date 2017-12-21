package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HiveTest {

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		Connection conn = 
	    DriverManager.getConnection("jdbc:hive2://192.168.111.200:10000","root","111111");
		Statement stmt = conn.createStatement();
		String sql = "select origin from airline_delay where origin like '%A%' order by origin limit 110";
		ResultSet rs = stmt.executeQuery(sql);
		   while(rs.next()) {
		     System.out.println(rs.getString(1));
		   }
		conn.close();
		System.out.println("Success....");

	}

}
