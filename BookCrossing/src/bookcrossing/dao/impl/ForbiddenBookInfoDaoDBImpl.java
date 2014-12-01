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

import bookcrossing.dao.ForbiddenBookInfoDao;
import bookcrossing.domain.ForbiddenBookInfo;
import bookcrossing.utils.DBUtils;

/**
 * 对数据库中表T_ForbiddenBook_Info进行增删改查操作的实现类
 * @author 王鈃润  2014-11-28
 *
 */
public class ForbiddenBookInfoDaoDBImpl implements ForbiddenBookInfoDao {
	
	private static final String SQL_ADD="insert into T_ForbiddenBook_Info values(?,?,?,?,?,?,?,?,?)";
	private static final String SQL_REMOVE="delete from T_ForbiddenBook_Info where bookid=?";
	private static final String SQL_UPDATE="update T_ForbiddenBook_Info set bookname=?,author=?,imageurl=?,publisher=?,holder=?,introduction=?,floatednum=?,category=? where bookid=?";
	private static final String SQL_LOADALL="select * from T_ForbiddenBook_Info";
	private static final String SQL_GETBYBOOKNAME="select * from T_ForbiddenBook_Info where bookname=?";
	/* (non-Javadoc)
	 * @see bookcrossing.dao.ForbiddenBookInfoDao#addForbiddenBookInfo(bookcrossing.domain.ForbiddenBookInfo)
	 */
	
	@Override
	public void addForbiddenBookInfo(ForbiddenBookInfo forbiddenBookInfo) {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_ADD);
			pstmt.setInt(1, forbiddenBookInfo.getBookId());
			pstmt.setString(2, forbiddenBookInfo.getBookName());
			pstmt.setString(3, forbiddenBookInfo.getAuthor());
			pstmt.setString(4, forbiddenBookInfo.getImageUrl());
			pstmt.setString(5, forbiddenBookInfo.getPublisher());
			pstmt.setString(6, forbiddenBookInfo.getHolder());
			pstmt.setString(7, forbiddenBookInfo.getIntroduction());
			pstmt.setInt(8, forbiddenBookInfo.getFloatedNum());
			pstmt.setString(9, forbiddenBookInfo.getCategory());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}

	}

	
	@Override
	public void removeForbiddenBookInfo(int bookId) {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_REMOVE);                
			pstmt.setInt(1, bookId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
	}
	
	
	@Override
	public void removeForbiddenBookInfo(ForbiddenBookInfo forbiddenBookInfo) {
		removeForbiddenBookInfo(forbiddenBookInfo.getBookId());
		
	}

	
	@Override
	public void updateForbiddenBookInfo(ForbiddenBookInfo forbiddenBookInfo) {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_UPDATE);
			
			pstmt.setString(1, forbiddenBookInfo.getBookName());
			pstmt.setString(2, forbiddenBookInfo.getAuthor());
			pstmt.setString(3, forbiddenBookInfo.getImageUrl());
			pstmt.setString(4, forbiddenBookInfo.getPublisher());
			pstmt.setString(5, forbiddenBookInfo.getHolder());
			pstmt.setString(6, forbiddenBookInfo.getIntroduction());
			pstmt.setInt(7, forbiddenBookInfo.getFloatedNum());
			pstmt.setString(8, forbiddenBookInfo.getCategory());
			pstmt.setInt(9, forbiddenBookInfo.getBookId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
	}

	
	@Override
	public List<ForbiddenBookInfo> loadall() {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rSet=null;
		List<ForbiddenBookInfo> forbiddenBookInfosList=new ArrayList<ForbiddenBookInfo>();
		
		try {
			pstmt=conn.prepareStatement(SQL_LOADALL);
			rSet=pstmt.executeQuery();
			
			while(rSet.next()){
				
				ForbiddenBookInfo forbiddenBookInfo=new ForbiddenBookInfo();
				
				forbiddenBookInfo.setBookId(rSet.getInt("bookid"));
				forbiddenBookInfo.setBookName(rSet.getString("bookname"));
				forbiddenBookInfo.setAuthor(rSet.getString("author"));
				forbiddenBookInfo.setImageUrl(rSet.getString("imageurl"));
				forbiddenBookInfo.setPublisher(rSet.getString("publisher"));
				forbiddenBookInfo.setHolder(rSet.getString("holder"));
				forbiddenBookInfo.setIntroduction(rSet.getString("introduction"));
				forbiddenBookInfo.setFloatedNum(rSet.getInt("floatednum"));
				forbiddenBookInfo.setCategory(rSet.getString("category"));
				
				forbiddenBookInfosList.add(forbiddenBookInfo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}
		return forbiddenBookInfosList;
	}

	
	@Override
	public ForbiddenBookInfo getForbiddenBookInfoByBookName(String bookName) {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rSet=null;
		ForbiddenBookInfo forbiddenBookInfo=new ForbiddenBookInfo();
		
		try {
			pstmt=conn.prepareStatement(SQL_GETBYBOOKNAME);
			pstmt.setString(1, bookName);
			rSet=pstmt.executeQuery();
			
			while(rSet.next()){
				
				forbiddenBookInfo.setBookId(rSet.getInt(1));
				forbiddenBookInfo.setBookName(rSet.getString(2));
				forbiddenBookInfo.setAuthor(rSet.getString(3));
				forbiddenBookInfo.setImageUrl(rSet.getString(4));
				forbiddenBookInfo.setPublisher(rSet.getString(5));
				forbiddenBookInfo.setHolder(rSet.getString(6));
				forbiddenBookInfo.setIntroduction(rSet.getString(7));
				forbiddenBookInfo.setFloatedNum(rSet.getInt(8));
				forbiddenBookInfo.setCategory(rSet.getString(9));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}
		return forbiddenBookInfo;
	}

	

}
