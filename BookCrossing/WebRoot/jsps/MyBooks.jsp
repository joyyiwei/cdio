<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <script src="//code.jquery.com/jquery-1.9.1.min.js"></script>
    <base href="<%=basePath%>">  
    <title>My JSP 'MyBooks.jsp' starting page</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/MyBooks.css">
  </head>
  
  <body>
  <div class="allContent">
    <div class="chooseItem"><div class="ItemPosition"><a name="readyBook">待漂书籍</a>&nbsp;&nbsp;<a name="forbiddenBook">不可漂书籍</a></div></div>
    <div class="bookContet">
      <div id="readyBook" class="bb">
      <iframe width="745px" height="360px"  src="<%=request.getContextPath()%>/jsps/ReadyBook.jsp"></iframe>
      </div>
      <div id="forbiddenBook" class="bb" style="display: none">
      <iframe width="745px" height="360px"  src="<%=request.getContextPath()%>/jsps/ForbiddenBook.jsp"></iframe>
      </div>
    </div>
 </div>
	<script type="text/javascript" src="jquery.js"></script>
	<script>
		$(function() {
			$(".ItemPosition a").click(function(e) {
				e.preventDefault();
				var i = $(this).index();
				$(".bookContet>.bb").eq(i).show().siblings(".bb").hide();
			})
		});
	</script>
</body>
</html>
