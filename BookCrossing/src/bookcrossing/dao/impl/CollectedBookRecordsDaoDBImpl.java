/**
 * 
 */
package bookcrossing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookcrossing.dao.CollectedBookRecordsDao;
import bookcrossing.domain.CollectedBookRecords;
import bookcrossing.utils.DBUtils;


/**用户收藏书籍的Dao层实现
 * @author 周艺伟 2014-11-25
 *
 */
public class CollectedBookRecordsDaoDBImpl implements CollectedBookRecordsDao {

	private static final String SQL_ADD="insert into T_CollectedBook_Records(bookid, username) values(?,?)";
	private static final String SQL_LOADALL="select * from T_CollectedBook_Records order by bookid desc";
	private static final String SQL_REMOVE="delete from T_CollectedBook_Records where username=? AND bookid=?";
	
	@Override
	public void addCollectedBookRecords(CollectedBookRecords book) {
		
		Connection connection = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = connection.prepareStatement(SQL_ADD);
			pstmt.setString(1, book.getBookId());
			pstmt.setString(2, book.getUserName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加记录出错");
		} finally {
			DBUtils.getInstance().realseRes(connection, pstmt, null);
		} 
	}

	@Override
	public List<CollectedBookRecords> loadall() {
		
		Connection connection = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<CollectedBookRecords> list = new ArrayList<CollectedBookRecords>();
		
		try {
			pstmt = connection.prepareStatement(SQL_LOADALL);
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				CollectedBookRecords book = new CollectedBookRecords();
				book.setBookId(rset.getString("bookid"));
				book.setUserName(rset.getString("username"));
				list.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.getInstance().realseRes(connection, pstmt, rset);
		}
		
		return list;
	}

	@Override
	public void removeCollectedBookRecords(CollectedBookRecords book) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_REMOVE);
			pstmt.setString(1, book.getUserName());
			pstmt.setString(2, book.getBookId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
	}

}
