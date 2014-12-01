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

import bookcrossing.dao.ReadyBookInfoDao;
import bookcrossing.domain.ReadyBookInfo;
import bookcrossing.utils.DBUtils;

/**
 * 对数据库中T_ReadyBook_Info表的CRUD操作接口的实现类
 * @author 林燕  2014-11-27
 *
 */
public class ReadyBookInfoDaoDBImpl implements ReadyBookInfoDao {

	private static final String SQL_ADD = "insert into T_ReadyBook_Info values(?,?,?,?,?,?,?,?,?)";
	private static final String SQL_REMOVE = "delete from T_ReadyBook_Info where bookid = ?";
	private static final String SQL_UPDATE = "update T_ReadyBook_Info set bookname = ?, author = ?, imageurl ?, publisher = ?, holder = ?, introduction = ?, floatednum = ?, category = ? where bookid =?";
	private static final String SQL_GETBYNAME = "select * from T_ReadyBook_Info where bookname = ?";
	private static final String SQL_LOADALL = "select * from T_ReadyBook_Info order by bookid desc";
	
	@Override
	public void addReadyBookInfo(ReadyBookInfo rbi) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_ADD);
			pstmt.setInt(1, rbi.getBookId());
			pstmt.setString(2, rbi.getBookName());
			pstmt.setString(3, rbi.getAuthor());
			pstmt.setString(4, rbi.getImageUrl());
			pstmt.setString(5, rbi.getPublisher());
			pstmt.setString(6, rbi.getHolder());
			pstmt.setString(7, rbi.getIntroduction());
			pstmt.setInt(8, rbi.getFloatedNum());
			pstmt.setString(9, rbi.getCategory());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加待漂书籍失败！");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
	}

	@Override
	public void removeReadyBookInfo(int bookId) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_REMOVE);
			pstmt.setInt(1, bookId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);	
		}
	}

	@Override
	public void updateReadyBookInfo(ReadyBookInfo rbi) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, rbi.getBookName());
			pstmt.setString(2, rbi.getAuthor());
			pstmt.setString(3, rbi.getImageUrl());
			pstmt.setString(4, rbi.getPublisher());
			pstmt.setString(5, rbi.getHolder());
			pstmt.setString(6, rbi.getIntroduction());
			pstmt.setInt(7, rbi.getFloatedNum());
			pstmt.setInt(8, rbi.getBookId());
			pstmt.setString(9, rbi.getCategory());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);	
		}
	}

	@Override
	public ReadyBookInfo getReadyBookInfoByBookName(String bookName) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		ReadyBookInfo rbi = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_GETBYNAME);
			pstmt.setString(1, bookName);
			rSet = pstmt.executeQuery();
			
			if(rSet.next()){
				rbi = new ReadyBookInfo();
				rbi.setBookId(rSet.getInt("bookid"));
				rbi.setBookName(rSet.getString("bookname"));
				rbi.setAuthor(rSet.getString("author"));
				rbi.setImageUrl(rSet.getString("imageurl"));
				rbi.setPublisher(rSet.getString("publisher"));
				rbi.setIntroduction(rSet.getString("introduction"));
				rbi.setHolder(rSet.getString("holder"));
				rbi.setFloatedNum(rSet.getInt("floatednum"));	
				rbi.setCategory(rSet.getString("category"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}
		
		return rbi;
	}

	@Override
	public List<ReadyBookInfo> loadall() {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		ReadyBookInfo rbi = null;
		List<ReadyBookInfo> rbiList = new ArrayList<ReadyBookInfo>();
		
		try {
			pstmt = conn.prepareStatement(SQL_LOADALL);
			rSet = pstmt.executeQuery();
			rbi = new ReadyBookInfo();
			
			while(rSet.next()){
				rbi.setBookId(rSet.getInt("bookid"));
				rbi.setBookName(rSet.getString("bookname"));
				rbi.setAuthor(rSet.getString("author"));
				rbi.setImageUrl(rSet.getString("imageurl"));
				rbi.setPublisher(rSet.getString("publisher"));
				rbi.setIntroduction(rSet.getString("introduction"));
				rbi.setHolder(rSet.getString("holder"));
				rbi.setFloatedNum(rSet.getInt("floatednum"));	
				rbi.setCategory(rSet.getString("category"));
			    rbiList.add(rbi);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}

		return rbiList;
	}



}
