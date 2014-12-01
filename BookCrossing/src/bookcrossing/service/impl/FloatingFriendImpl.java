/**
 * 
 */
package bookcrossing.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bookcrossing.domain.UserInfo;
import bookcrossing.dao.impl.UserInfoDaoDBImpl;
import bookcrossing.exception.ApplicationException;
import bookcrossing.service.FloatingFriend;
import bookcrossing.utils.DBUtils;
/** 实现了FloatingFriend
 * @author 周艺伟 2014-11-29
 *
 */
public class FloatingFriendImpl implements FloatingFriend {

	private static final String SQL_UPDATE = "update T_User_Info set password = ? where username = ?";
    private static final String SQL_ISEXIST = "select * from T_User_Info where username = ?";
   // private static final String SQL_PERFECT1 = "update T_User_Info set iconurl = ?, sex= ?, address= ?, integral= ?, hobbies = ? where username = ?";
    private static final String SQL_PERFECT = "update T_User_Info set sex= ?, address= ?, integral= ?, hobbies = ? where username = ?";
  //  private static final String SQL_JUDGE = "select * from T_User_Info where username = ?";
	/* (non-Javadoc)
	 * @see bookcrossing.service.FloatingFriend#register(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean register(String username) {
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		int flag = 0;
		
		try {
			pstmt = conn.prepareStatement(SQL_ISEXIST);
			pstmt.setString(1, username);
			rSet = pstmt.executeQuery();
			
			if (rSet.next()) {
				flag = 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询异常！");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}
		
		if (flag == 1) 
			return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see bookcrossing.service.FloatingFriend#perfectInfo(bookcrossing.domain.UserInfo)
	 */
	@Override
	public void perfectInfo(UserInfo user) {
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_PERFECT);
			pstmt.setString(1, user.getSex());
			pstmt.setString(2, user.getAddress());
			pstmt.setInt(3, user.getIntegral());
			pstmt.setString(4, user.getHobbies());
			pstmt.setString(5, user.getUserName());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("更新异常！");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
	
	}

	/* (non-Javadoc)
	 * @see bookcrossing.service.FloatingFriend#login(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String username, String password) {
		UserInfoDaoDBImpl userDao = new UserInfoDaoDBImpl();
		int flag = 0;
		
		try {
			userDao.isUserInfoExist(username, password);
		} catch(ApplicationException e) {
			e.printStackTrace();
			flag = 1;
		}
		
		if (flag == 0)
			return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see bookcrossing.service.FloatingFriend#modifyPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public void modifyPassword(String currentUsername, String password) {
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, password);
			pstmt.setString(2, currentUsername);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("密码修改错误!");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, null);
		}
	}

	/* (non-Javadoc)
	 * @see bookcrossing.service.FloatingFriend#modifyUserInfo(bookcrossing.domain.UserInfo)
	 */
	@Override
	public void modifyUserInfo(UserInfo user) {
		UserInfoDaoDBImpl useDaoDBImpl = new UserInfoDaoDBImpl();
		useDaoDBImpl.updateUserInfo(user);
	}

	@Override
	public boolean judegNotFirst(String username) {
		Connection conn = DBUtils.getInstance().getConn();
		PreparedStatement pstmt = null;
		ResultSet rSet = null;
		int flag = 1;
		
		try {
			pstmt = conn.prepareStatement(SQL_ISEXIST);
			pstmt.setString(1, username);
			rSet = pstmt.executeQuery();
			
			if (rSet.next()) {
				if (rSet.getString("sex") == null || rSet.getString("sex").equals("")) {
					flag = 0;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("查询异常！");
		} finally{
			DBUtils.getInstance().realseRes(conn, pstmt, rSet);
		}
		
		if (flag == 1) 
			return true;
		return false;
	}

}
