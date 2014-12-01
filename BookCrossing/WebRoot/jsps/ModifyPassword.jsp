<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ModifyPassword.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
	<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/ModifyPassword.css">
	
  </head>
  
  <body>
  <div class="total">
    <h3>修改密码</h3>
    <div class="total1">
    	<div>
	    	<span>旧密码:</span>
	    	<input type="password" id="oldpassword" name="oldpassword"></input>
	    </div>
	    
	    <div>
	    	<span>新密码:</span>
	    	<input type="password" id="newpassword" name="newpassword"></input>
	    </div>
	    
	    <div>
	    	<span>确认密码:</span>
	    	<input type="password" id="confirmpassword" name="confirmpassword"></input>
	    </div>
	    
	    <div>
	    	<button type="submit" name="submit" value="确定">确定</button>
	    </div>
    </div>
 </div>   
  </body>
</html>
