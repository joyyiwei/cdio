package bookcrossing.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookcrossing.dao.impl.UserInfoDaoDBImpl;
import bookcrossing.domain.UserInfo;
import bookcrossing.service.impl.FloatingFriendImpl;

/**
 * 一个用户注册的servlet类，实现了用户的注册
 * @author 周艺伟 2014-11-28
 *
 */
public class UserRegisterMgrServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserRegisterMgrServlet() {
		super();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("usernameRegister");
		String passwd = request.getParameter("passwdRegister");
		UserInfo user = new UserInfo(username, passwd);
		
		//UserInfoDaoDBImpl userDao = new UserInfoDaoDBImpl();
		UserInfoDaoDBImpl userDao = new UserInfoDaoDBImpl();
		FloatingFriendImpl check = new FloatingFriendImpl();
		if (check.register(username) == true) { //注册过了
			request.setAttribute("err", "用户已经注册过了");
		//	System.out.println("用户存在了");
			request.getRequestDispatcher("jsps/Register.jsp").forward(request, response);;
		} else {
			userDao.addUserInfo(user);
			request.getRequestDispatcher("jsps/Login.jsp").forward(request, response);	
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);	
	}

}
