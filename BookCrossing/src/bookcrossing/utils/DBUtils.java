/**
 * 
 */
package bookcrossing.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 实现了数据库的连接和关闭
 * @author 林燕  2014-11-25
 *
 */
public class DBUtils {

	private static final String URL = "jdbc:mysql://121.41.51.176/cdio_2_10_DB?user=cdio_2_10&password=cdio"; 
	private static final DBUtils DBUTILS = new DBUtils();
	
	private DBUtils(){
		
	}
	
	public static DBUtils getInstance(){
		return DBUTILS;
	}
	
	/**
	 * 连接数据库
	 * @return
	 */
	public Connection getConn(){
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	/***
	 * 关闭数据库的连接
	 * @param conn
	 * @param pstmt
	 * @param rSet
	 */
	public void realseRes(Connection conn, PreparedStatement pstmt, ResultSet rSet){
		
		try {
			if (rSet != null)  rSet.close();
			if (pstmt != null) pstmt.close();
			if (conn != null)  conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
