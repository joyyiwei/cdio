/**
 * 
 */
package bookcrossing.dao;

import bookcrossing.domain.UserInfo;

/** 
 * 对数据库中T_User_Info表的CRUD操作的接口
 * @author 林燕  2014-11-26
 *
 */
public interface UserInfoDao {
	
	/**
	 * 增加用户信息
	 * @param user 用户信息
	 */
	void addUserInfo(UserInfo user);
	
	/**
	 * 根据用户名删除用户信息
	 * @param username 用户名
	 */
	void removeUserInfo(String username);
	
	/**
	 * 修改除了用户名以外的用户信息
	 * @param user 用户信息
	 */
	void updateUserInfo(UserInfo user);
	
	/**
	 * 根据用户名获得用户信息
	 * @param username
	 * @return
	 */
	UserInfo getUserInfoByUserame(String username);
	
	/**
	 * 判断该用户名和密码在T_User_Info表中是否存在
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	void isUserInfoExist(String username, String password);  
	
	/**
	 * 修改用户名
	 * @param oldUsername 旧用户名
	 * @param newUsername 新用户名
	 */
	void updateUsername(String oldUsername, String newUsername); 


}
