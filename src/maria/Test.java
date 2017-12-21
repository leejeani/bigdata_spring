package maria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) throws Exception {
		String id = "stest";
		String pwd = "111111";
		String url 
	    = "jdbc:mysql://192.168.111.200:3306/shopping_db";
		String url2 
	    = "jdbc:oracle:thin:@192.168.111.101:1521:XE";
		
		String driver = "org.mariadb.jdbc.Driver";
		String driver2 = 
			"oracle.jdbc.driver.OracleDriver";
		Class.forName(driver2);
		String sql = "SELECT * FROM TB_USER";
		Connection con = 
		DriverManager.getConnection(url2, id, pwd);
		PreparedStatement pstmt = 
				con.prepareStatement(sql);
		ResultSet rset = pstmt.executeQuery();
		while(rset.next()) {
			String uid = rset.getString("ID");
			String upwd = rset.getString("PWD");
			String uname = rset.getString("NAME");
			System.out.println(uid+" "+upwd+" "+uname);
		}
		rset.close();
		pstmt.close();
		con.close();
	}

}








