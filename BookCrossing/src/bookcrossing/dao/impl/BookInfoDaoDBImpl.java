package bookcrossing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookcrossing.dao.BookInfoDao;
import bookcrossing.domain.BookInfo;
import bookcrossing.utils.DBUtils;
/**
 *  对数据库中T_Book_Info表的CRUD操作接口的实现类
 * @author 林佳怡  2014-11-26
 *
 */
public class BookInfoDaoDBImpl implements BookInfoDao {

	private static final String SQL_ADD="insert into T_Book_Info(bookName,author,imageUrl,publisher,introduction,holder,floatedNum,category) values(?,?,?,?,?,?,?,?)";
	private static final String SQL_LOADALL="select * from T_Book_Info order by floatedNum desc";
	private static final String SQL_REMOVE="delete from T_Book_Info where bookid=?";
	private static final String SQL_GETBYNO="select * from T_Book_Info where bookid=?";
	private static final String SQL_GETBYNAME="select * from T_Book_Info where bookname=?";
	private static final String SQL_UPDATEMESSAGE="update T_Book_Info set bookName=?,author=?,imageUrl=?,publisher=?,introduction=?,holder=?,floatedNum=?,category=?  where bookid=?";
	private static final String SQL_UPDATEHOLDER="update T_Book_Info set holder=?  where bookid=?";
	private static final String SQL_ADDFLOATEDNUM="update T_Book_Info set floatedNum=(floatedNum+1)  where bookid=?";
	
	public void addBook(BookInfo book) {	
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt =null;
		
		try {
			pstmt=conn.prepareStatement(SQL_ADD);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2,book.getAuthor());
			pstmt.setString(3,book.getImageUrl());
			pstmt.setString(4,book.getPublisher());
			pstmt.setString(5,book.getIntroduction());
			pstmt.setString(6,book.getHolder());
			pstmt.setInt(7,book.getFloatedNum());
			pstmt.setString(8, book.getCategory());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt,null);
		}
	}

	public List<BookInfo> loadall() {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		List<BookInfo> bookList=new ArrayList<BookInfo>();
		
		try {
			pstmt=conn.prepareStatement(SQL_LOADALL);
			rset=pstmt.executeQuery();
			
			while(rset.next()){
				BookInfo book=new BookInfo();
				book.setBookId(rset.getInt("bookid"));
				book.setBookName(rset.getString("bookName"));
				book.setAuthor(rset.getString("author"));
				book.setImageUrl(rset.getString("imageUrl"));
				book.setPublisher(rset.getString("publisher"));
				book.setIntroduction(rset.getString("introduction"));
				book.setHolder(rset.getString("holder"));
				book.setFloatedNum(rset.getInt("floatedNum"));
				book.setCategory(rset.getString("category"));
				bookList.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rset);
		}		
		return bookList;
	}

	public void removeBook(Integer bookid) {

		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_REMOVE);
			pstmt.setInt(1, bookid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}		
		
	}

	public BookInfo getBookByNo(Integer bookid) {
		
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		BookInfo book=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_GETBYNO);
			pstmt.setInt(1, bookid);
			rset=pstmt.executeQuery();
			
			if(rset.next()){				
			    book =new BookInfo();
			    book.setBookId(rset.getInt("bookid"));
				book.setBookName(rset.getString("bookName"));
				book.setAuthor(rset.getString("author"));
				book.setImageUrl(rset.getString("imageUrl"));
				book.setPublisher(rset.getString("publisher"));
				book.setIntroduction(rset.getString("introduction"));
				book.setIntroduction(rset.getString("holder"));
				book.setFloatedNum(rset.getInt("floatedNum"));
				book.setCategory(rset.getString("category"));
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rset);
		}	
		return book;
	}

	public List<BookInfo> getBookByName(String bookname) {
		
		List<BookInfo> bookList=new ArrayList<BookInfo>();
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		ResultSet rset=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_GETBYNAME);
			pstmt.setString(1, bookname);
			rset=pstmt.executeQuery();
			
			while(rset.next()){				
				BookInfo book =new BookInfo();
			    book.setBookId(rset.getInt("bookid"));
				book.setBookName(rset.getString("bookName"));
				book.setAuthor(rset.getString("author"));
				book.setImageUrl(rset.getString("imageUrl"));
				book.setPublisher(rset.getString("publisher"));
				book.setIntroduction(rset.getString("introduction"));
				book.setIntroduction(rset.getString("holder"));
				book.setFloatedNum(rset.getInt("floatedNum"));
				book.setCategory(rset.getString("category"));
				bookList.add(book);
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rset);
		}	
		return bookList;
	}

	public void updateBook(BookInfo book) {

		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_UPDATEMESSAGE);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2,book.getAuthor());
			pstmt.setString(3,book.getImageUrl());
			pstmt.setString(4,book.getPublisher());
			pstmt.setString(5,book.getIntroduction());
			pstmt.setString(6,book.getHolder());
			pstmt.setInt(7,book.getFloatedNum());
			pstmt.setString(8,book.getCategory());
			pstmt.setInt(9,book.getBookId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
	}

	public void updateBookHolder(Integer bookid,String holder) {

		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_UPDATEHOLDER);
			pstmt.setString(1, holder);
			pstmt.setInt(2,bookid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
	}

	public void AddBookfloatedNum(Integer bookid) {
	
		Connection conn=DBUtils.getInstance().getConn();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(SQL_ADDFLOATEDNUM);
			pstmt.setInt(1,bookid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
		
	}

}
