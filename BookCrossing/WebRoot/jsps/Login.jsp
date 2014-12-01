<%@page import="bookcrossing.domain.UserInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	//UserInfo user = (UserInfo) request.getAttribute("user");
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/title.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/LoginRegister.css">
</head>


</head>
<div class="top">
	<div class="top1">
		<div class="top1a">
			<a href="#"> <img
				src="<%=request.getContextPath()%>/img/tushupiaoliu.jpg" alt="图书漂流"
				weight="200px" height="54px" /> </a>
		</div>
		<div class="top1b">
			<ul>
				<li><a href="#">首页</a>
				</li>
				<li><a href="#">我的漂书</a>
				</li>
				<li><a href="#">我的积分</a>
				</li>
				<li><a href="#">我的收藏</a>
				</li>
				<li><a href="#">[登录/注册]</a>
				</li>
			</ul>
		</div>
	</div>

	<div class="top2">
		<div class="top2a">
			<a href="#"> <img
				src="<%=request.getContextPath()%>/img/bookcrossing.jpg" alt="图书漂流"
				weight="230px" height="45px" /> </a>
		</div>
		<div class="top2b">
			<input class="text" type="text" name="reserch" value=""
				style="height:43px; width:385px"> <input class="reserch"
				type="submit" value="搜索">
		</div>
	</div>
</div>

<div class="bottom">
	<div class="loginleft">
		<img src="<%=request.getContextPath()%>/img/loginLeft.jpg" alt="图书漂流"
			weight="440px" height="400px" />
	</div>
	<div class="loginright">
		<form action="userlogin" method="post">
		<input type="hidden" name="act" value="login">
			<div class="loginMessage">
				<div class="loginItem">
					<span>用户名：</span> <br /> <input type="text" name="usernameLogin" id="usernameLogin" value="<%=request.getParameter("usernameLogin")==null?"":request.getParameter("usernameLogin")%>"/>
				</div>
				<div class="loginItem">
					<span>密码：</span> <br /> <input type="password" name="passwdLogin" id="passwdLogin" value="<%=request.getParameter("passwdLogin")==null?"":request.getParameter("passwdLogin")%>"/>
				</div>

				<div>
					<input class="autoLogin" type="checkbox" name="autoLogin" />自动登录
					&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">忘记密码</a>
				</div>
				<div>
					<input class="loginBotton" type="submit" value="登录" />
				</div>
				<div class="changeToRegister">
					<a href="jsps/Register.jsp">免费注册</a>
				</div>
			</div>
		</form>
	</div>
</div>
<%if(request.getAttribute("err")!=null){%>
	<script type="text/javascript">
	   alert('<%=request.getAttribute("err")%>');
	   request.removeAttribute("err");
	</script>
<%}%>
</body>
</html>
