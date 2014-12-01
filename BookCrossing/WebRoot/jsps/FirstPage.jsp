<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FirstPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/title.css">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/Bottom.css">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/item.css">
  </head>
  
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
		<div class="left1">
			<ul>
				<li><a href="#">文学</a></li>
				<li><a href="#">计算机</a></li>
				<li><a href="#">教育</a></li>
				<li><a href="#">管理</a></li>
				<li><a href="#">励志与成功</a></li>
				<li><a href="#">人文社科</a></li>
				<li><a href="#">生活</a></li>
				<li><a href="#">艺术</a></li>
				<li><a href="#">科技</a></li>
				<li><a href="#">其他</a></li>
			</ul>
		</div>
	
		     <div class= "firstPage">
    <% 
    for(int i=0;i<3;i++){%>
	    <div class="firstPageItem">
		   <div class="imgPosition">
		     <img alt="java" src="<%=request.getContextPath()%>/img/java.jpg"/>
		   </div>
		   <div class="flag">
	         <span>&nbsp;&nbsp;&nbsp;待漂</span><br/><br/>
		     <button>求漂</button>
	       </div> 
		    <div class="briefInfo">
	         <span><a href="#">Java编程思想</a></span><br/><br/>
		     <span>作者： [美]埃克尔</span><br/>
		     <span>持有者：宋慧颖</span><br/>   
	       </div> 
	    </div>
	 <%}%> 	  
    </div>
		</div>

  </body>
</html>
