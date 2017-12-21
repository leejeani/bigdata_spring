package com.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"test2",
					"test2",
					"jdbc:oracle:thin:@127.0.0.1:1521:XE");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public void close(ResultSet rset) {
		if(rset != null) {
			try {
				rset.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void close(Connection con) {
		if(con != null) {
			try {
				con.close();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}






