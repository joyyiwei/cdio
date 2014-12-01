package bookcrossing.service;

import bookcrossing.domain.UserInfo;

/**
 * 定义了漂友管理可能的接口
 * 
 *
 */
public interface FloatingFriend {

	/**注册*/
	boolean register(String username);
	/**完善信息*/
	void perfectInfo(UserInfo user);
	/**登录*/
	boolean login(String username, String password);
	/**修改密码*/
	void modifyPassword(String currentUsername, String password);
	/**修改个人信息*/
	void modifyUserInfo(UserInfo user);
	/**判断是不是第一次登陆*/
	boolean judegNotFirst(String username);
}
