<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'AddBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/AddBook.css">

  </head>
  <body>
            <div>漂书基本信息</div>
			<div id="bookName">书名:&nbsp;&nbsp;<input type="text" name="bookName"/></div>
			<div>作者:&nbsp;&nbsp;<input type="text" name="author"></input></div>
			<div>出版社:&nbsp;<input type="text" name="publishing"></input></div>
			<div id="photo">照片:</br></br>
			<img src="img/bookphoto.jpg"><button value="上传照片" id="addPhoto">上传照片</button></div>
			<div id="introduction">简介:</br>
			<textarea type="text" name="introduction"></textarea></div>
			<div>
				漂书状态:
				<input type="radio" name="isCrossing" value="待漂">待漂</input>
				<input type="radio" name="isCrossing" value="不可漂">不可漂</input>
			</div>
			<div><button value="添加" id="add">添加</button></div>
  </body>
</html>
