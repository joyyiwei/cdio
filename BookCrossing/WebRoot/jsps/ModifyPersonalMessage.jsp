<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ModifyPersonMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/ModifyPersonalMessage.css">

  </head>
  
  <body>
  <div class="bottom">
    <div class="messageleft">
		<img alt="图片" src="<%=request.getContextPath()%>/img/messagebackground.jpg" />
		<input class ="chooseimg" type='file' name='myimg' />
        <input class="submitImg" type='submit' value='提交'/>
		</div>
		<div class="messageright">
			<div>
			<span>用户名：</span>
			<input class="usernameInput" type="text" name="username" />
			</div>
			<div>
			<span>性别：</span>
			<input class= "sexChoose"  type="radio" name="username" value="male"/>男
			<input class= "sexChoose"  type="radio" name="username" value="female"/>女
			</div>
		    <div>
			<span>地址：</span>
			<input class="address" type="text" name="address" />
			</div>
		    <div class="hobby">
			    <span>兴趣：</span>
			    <input type="checkbox" name="hobby"/>艺术
			    <input type="checkbox" name="hobby"/>计算机
			    <input type="checkbox" name="hobby"/>文学
			    <input type="checkbox" name="hobby"/>生活</br>
			    &nbsp;<input type="checkbox" name="hobby"/>科技
			    <input type="checkbox" name="hobby"/>管理
			    <input type="checkbox" name="hobby"/>励志
			    <input type="checkbox" name="hobby"/>教育
			    <input type="checkbox" name="hobby"/>其他
			</div>
			<div>
				<input class="okBotton" type="submit" value="确认" />
			</div>
		</div>
	</div>
  </body>
</html>
