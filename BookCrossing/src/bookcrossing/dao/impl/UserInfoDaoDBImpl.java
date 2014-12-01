/**
 * 
 */
package bookcrossing.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




import bookcrossing.dao.UserInfoDao;
import bookcrossing.domain.UserInfo;
import bookcrossing.exception.ApplicationException;
import bookcrossing.utils.DBUtils;

/**
 * 对数据库中T_User_Info表的CRUD操作接口的实现类
 * @author 林燕  2014-11-26
 *  
 */
public class UserInfoDaoDBImpl implements UserInfoDao {
	
	private static final String SQL_ADD = "insert into T_User_Info values(?,?,?,?,?,?,?)";
    private static final String SQL_REMOVE = "delete from T_User_Info where username = ?";
    private static final String SQL_UPDATE = "update T_User_Info set password = ?, iconurl = ?, sex= ?, address= ?, integral= ?, hobbies = ? where username = ?";
    private static final String SQL_GETBYNAME = "select * from T_User_Info where username = ?";
    private static final String SQL_ISEXIST = "select * from T_User_Info where username = ? and password = ?";
	private static final String SQL_UPDATEUSRNAME = "update T_User_Info set username = ? where username = ?";
    
    @Override
	public void addUserInfo(UserInfo user) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_ADD);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getIconUrl());
			pstmt.setString(4, user.getSex());
			pstmt.setString(5, user.getAddress());
			pstmt.setInt(6, user.getIntegral());
			pstmt.setString(7, user.getHobbies());
			pstmt.executeUpdate();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("添加用户失败！");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
			
	}

	@Override
	public void removeUserInfo(String username) {
		
		Connection conn = DBUtils.getInstance().getConn();
	    PreparedStatement pstmt = null;
	    
	    try {
			pstmt = conn.prepareStatement(SQL_REMOVE);
			pstmt.setString(1, username);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("删除用户失败！");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
	    
	    		
	}

	@Override
	public void updateUserInfo(UserInfo user) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getIconUrl());
			pstmt.setString(3, user.getSex());
			pstmt .setString(4, user.getAddress());
			pstmt.setInt(5, user.getIntegral());
			pstmt.setString(6, user.getHobbies());
			pstmt.setString(7, user.getUserName());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);	
			
		}	
		
	}


	@Override
	public UserInfo getUserInfoByUserame(String username) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		UserInfo user = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_GETBYNAME);
			pstmt.setString(1, username);
			rSet = pstmt.executeQuery();
			
			if(rSet.next()){
				user = new UserInfo();
				user.setUserName(rSet.getString("username"));
				user.setPassword(rSet.getString("password"));
				user.setIconUrl(rSet.getString("iconurl"));
				user.setSex(rSet.getString("sex"));
				user.setAddress(rSet.getString("address"));
				user.setIntegral(rSet.getInt("integral"));
				user.setHobbies(rSet.getString("hobbies"));
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}
		
		return user;
	
	}

	/**
	 * 增加了一个抛出异常
	 *  @author 周艺伟 2014-11-28
	 */
	@Override
	public void isUserInfoExist(String username, String password) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(SQL_ISEXIST);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rSet = pstmt.executeQuery();
			
			if(rSet.next()) {
				flag = 1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (flag == 0)
			throw new ApplicationException("用户不存在或者密码错误");
	}

	@Override
	public void updateUsername(String oldUsername, String newUsername) {
		
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_UPDATEUSRNAME);
			pstmt.setString(1, newUsername);
			pstmt.setString(2, oldUsername);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
		
		
	}
	

}
