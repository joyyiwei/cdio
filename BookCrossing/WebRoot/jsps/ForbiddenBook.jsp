<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ForbiddenBook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/ForbiddenBookItem.css">

  </head>
  
  <body>
       <div class="firstPage">
					<%
						for (int i = 0; i < 3; i++) {
					%>
					<div class="firstPageItem">
						<div class="imgPosition">
							<img alt="java" src="<%=request.getContextPath()%>/img/keji.jpg" />
						</div>
						<div class="buttons">
							<button>设置为可漂</button>
						</div>
						<div class="briefInfo">
							<span><a href="<%=request.getContextPath()%>/jsps/BookDetail.jsp" target="_top">Java编程思想</a> </span><br /> <br /> <span>作者：
								[美]埃克尔</span><br /> <span>持有者：宋慧颖</span><br />
						</div>
					</div>
					<%
						}
					%>
		</div>
  </body>
</html>
