package bookcrossing.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookcrossing.domain.UserInfo;
import bookcrossing.service.impl.FloatingFriendImpl;

/**
 * 一个完善用户信息的servlet
 * @author 周艺伟 2014-11-29
 *
 */

public class UserInfoPerfect extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserInfoPerfect() {
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
		
		// 用户名就不改了吧,头像还没修改，积分初始为5（借一本书的积分）
		// 还有密码是没改的，这里随便写一个，是不会修改的,第一次强迫性别必须填，用于是不是第一次登陆的判断
		Map map = request.getParameterMap();
		String username = request.getParameter("username");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		String[] items = (String[])map.get("hobby");	
		String hobby = "";
		for (int i = 0; i < items.length; i++) {
			if (i != items.length-1)
				hobby += items[i] + ";";
			else hobby += items[i];
		}
		//System.out.println(hobby + " " + sex + " " + address);
		
		UserInfo user = new UserInfo(username, "0", "", sex, address, 5, hobby);
		FloatingFriendImpl update = new FloatingFriendImpl();
		update.perfectInfo(user);
		//我们只是需要名字，所以密码随便填
		request.setAttribute("userMain", new UserInfo(username, "0"));
		request.getRequestDispatcher("jsps/Main.jsp").forward(request, response);
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
