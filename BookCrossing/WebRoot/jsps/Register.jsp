<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'Register.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/title.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/LoginRegister.css">
</head>

<!-- 确定两次密码是否相同 -->>
<script type="text/javascript">
	function validate() {
		var firstPass = document.getElementById("passwdRegister").value
		var secondPass = document.getElementById("ensurePasswdRegister").value
		if (firstPass != secondPass) {
			alert("您输入的两次密码不相同")
			document.getElementById("passwdRegister").select()
			return false;
		}
		return true;
	}
</script>

<body>
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
		<div class="registerleft">
			<img src="<%=request.getContextPath()%>/img/loginLeft.jpg" alt="图书漂流"
				weight="440px" height="400px" />
		</div>
		<div class="registerright">
			<div class="prompt">
				<a href="#">已有账号，直接登录</a>
			</div>
			<form action="register" method="post" onsubmit="return validate()">
				<div class="registerMessage">
					<div class="registerItem">
						<span>用户名：</span> <br /> <input type="text" name="usernameRegister" id="usernameRegister" value="<%=request.getParameter("usernameRegister")==null?"":request.getParameter("usernameRegister")%>"/>
					</div>
					<div class="registerItem">
						<span>密码：</span> <br /> <input type=password name="passwdRegister" id="passwdRegister" value="<%=request.getParameter("passwdRegister")==null?"":request.getParameter("passwdRegister")%>"/>
					</div>
					<div class="registerItem">
						<span>确认密码：</span> <br /> <input type="password" name="ensurePasswdRegister" id="ensurePasswdRegister" value="<%=request.getParameter("ensurePasswdRegister")==null?"":request.getParameter("ensurePasswdRegister")%>"/>
					</div>
					<div>
						<input class="appoint" type="checkbox" name="appoint" />我同意使用条例
					</div>
					<div>
						<input class="registerBotton" type="submit" value="注册" />
					</div>
				</div>
			</form>
			<%if(request.getAttribute("err") != null) {%>
				<script type="text/javascript">
	   				alert('<%=request.getAttribute("err")%>');
	   				request.removeAttribute("err");
				</script>
			<%}%>
		</div>
	</div>
</body>
</html>
