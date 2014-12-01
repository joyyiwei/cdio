package bookcrossing.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ReportAsSingleViolation;

import bookcrossing.dao.impl.UserInfoDaoDBImpl;
import bookcrossing.domain.UserInfo;
import bookcrossing.exception.ApplicationException;
import bookcrossing.service.impl.FloatingFriendImpl;

/**
 * 登录的servlet类，实现了用户的登录以及判断
 * @author 周艺伟 2014-11-28
 *
 */
public class UserLoginMgrServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserLoginMgrServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
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
		String action = request.getParameter("act");
		
		String username = request.getParameter("usernameLogin");
		String passwd = request.getParameter("passwdLogin");
		//System.out.println(username + " "  + passwd);
		
		UserInfoDaoDBImpl userDao = new UserInfoDaoDBImpl();
		//判断用户是否存在
		try {
			userDao.isUserInfoExist(username, passwd);
			request.setAttribute("userMain", new UserInfo(username, passwd));
			FloatingFriendImpl check = new FloatingFriendImpl();
			if (check.judegNotFirst(username) == true)
				request.getRequestDispatcher("jsps/Main.jsp").forward(request, response);
			else request.getRequestDispatcher("jsps/specificMessage.jsp").forward(request, response);;
		} catch (ApplicationException e) {
			e.printStackTrace();
			request.setAttribute("err", e.getMessage());
			request.getRequestDispatcher("jsps/Login.jsp").forward(request, response);
			request.removeAttribute("err");
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

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
