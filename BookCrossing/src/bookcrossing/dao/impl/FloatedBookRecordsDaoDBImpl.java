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

import bookcrossing.dao.FloatedBookRecordsDao;
import bookcrossing.domain.FloatedBookRecords;
import bookcrossing.utils.DBUtils;

/**
/**
 * 对数据库中FloatedBookRecords表的CRUD操作接口的实现类
 * @author 李源杰  2014-11-26
 *
 */
 
public class FloatedBookRecordsDaoDBImpl implements FloatedBookRecordsDao {

	private static final String SQL_ADD="insert into T_FloatedBook_Records values(?,?)";
	private static final String SQL_LOADALL="select * from T_FloatedBook_Records order by bookid desc";
	private static final String SQL_REMOVE="delete from T_FloatedBook_Records where bookid=?";
	private static final String SQL_GETBYNO="select * from T_FloatedBook_Records where bookid=?";
	private static final String SQL_UPDATE="update T_FloatedBook_Records set username=?,bookid=?";


	public void addFloatedBookRecords(FloatedBookRecords fbr) {

		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(SQL_ADD);
			pstmt.setString(1, fbr.getUserName());
			pstmt.setInt(2, fbr.getBookId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("漂书记录增加失败！");
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}

	}




	public List<FloatedBookRecords> loadall() {

		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		List<FloatedBookRecords> stuList=new ArrayList<FloatedBookRecords>();

		try {
			pstmt=conn.prepareStatement(SQL_LOADALL);
			rset=pstmt.executeQuery();

			while(rset.next()){
				FloatedBookRecords fbr=new FloatedBookRecords();
				fbr.setUserName(rset.getString("username"));
				fbr.setBookId(rset.getInt("bookid"));
				stuList.add(fbr);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}		
		return stuList;
	}


	public void removeFloatedBookRecords(int bookid) {
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_REMOVE);
			pstmt.setInt(1, bookid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}		

	}


	public FloatedBookRecords getFloatedBookRecordsByBookid(int bookid) {

		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		FloatedBookRecords fbr=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_GETBYNO);
			pstmt.setInt(1, bookid);
			rset=pstmt.executeQuery();
			
			if(rset.next()){
				fbr=new FloatedBookRecords();
				fbr.setUserName(rset.getString("username"));
				fbr.setBookId(rset.getInt("bookid"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}	
		return fbr;
		
	}


	public void updateFloatedBookRecords(FloatedBookRecords fbr) {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, fbr.getUserName());
			pstmt.setInt(2, fbr.getBookId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}

	}


}
