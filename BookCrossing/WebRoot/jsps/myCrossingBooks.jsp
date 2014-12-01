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
<script src="//code.jquery.com/jquery-1.9.1.min.js"></script>
<base href="<%=basePath%>">

<title>My JSP 'myCrossingBooks.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/title.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/MyCrossingBook.css">
</head>
<body>
	<div class="top">
		<div class="top1">
			<div class="top1a">
				<a href="#"> <img
					src="<%=request.getContextPath()%>/img/tushupiaoliu.jpg" alt="图书漂流"
					weight="200px" height="54px" />
				</a>
			</div>

			<div class="top1b">
				<ul>
					<li><a href="<%=request.getContextPath()%>/jsps/Main.jsp">首页</a></li>
					<li><a href="<%=request.getContextPath()%>/jsps/myCrossingBooks.jsp">我的漂书</a></li>
					<li><a href="<%=request.getContextPath()%>/jsps/myCrossingBooks.jsp">我的积分</a></li>
					<li><a href="<%=request.getContextPath()%>/jsps/myCrossingBooks.jsp">我的收藏</a></li>
					<li><a href="#">[登录/注册]</a></li>
					<!--动态输入人的姓名 -->
				</ul>
			</div>
		</div>

		<div class="top2">
			<div class="top2a">
				<a href="#"> <img
					src="<%=request.getContextPath()%>/img/bookcrossing.jpg" alt="图书漂流"
					weight="230px" height="45px" />
				</a>
			</div>
			<div class="top2b">
				<input class="text" type="text" name="reserch" value=""
					style="height:43px; width:385px"> <input class="reserch"
					type="submit" value="搜索">
			</div>
		</div>
	</div>

	<div class="bottom">
		<div id="left1">	
		<input type="button" value="我的漂书" onclick="document.frames['i1'].location.reload(true)"/>
		<input type="button" value="已漂书籍"/>
		<input type="button" value="添加漂书"/>
		<input type="button" value="我的收藏"/>
		<input type="button" value="漂书订单"/>
		<input type="button" value="我的积分"/>
		<input type="button" value="个人信息"/>
		</div>
		<div id="right1">
           <div id="myBooks" class="aa" >
            <iframe name="i1" width="770px" height="460px"  src="<%=request.getContextPath()%>/jsps/MyBooks.jsp"></iframe> 
           </div>
		   <div id="floatedBooks" class="aa" style="display: none">
		    <iframe name="floatedBook" width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/FloatedBooks.jsp"></iframe> 
		   </div>
		   <div id="addBook" class="aa" style="display: none">
		   <iframe name="addBook" width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/AddBook.jsp"></iframe> 
		   </div>
		   <div id="myCollectedBooks" class="aa" style="display: none">
		   <iframe name="myCollectedBook" width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/CollectBooks.jsp"></iframe> 
		   </div>
		   <div id="orderBooks" class="aa" style="display: none">
		   <iframe name="orderBook" width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/OrderBooks.jsp"></iframe> 
		   </div>
		   <div id="myIntegral" class="aa" style="display: none">
		   <iframe name="myintegral" width="770px" height="460px"  src="<%=request.getContextPath()%>/jsps/MyIntegral.jsp"></iframe> 
		   </div>
		   <div id="personMessage" class="aa" style="display: none">
		   <iframe name="personmessage" width="770px" height="460px"  src="<%=request.getContextPath()%>/jsps/PersonMessage.jsp"></iframe>
		   </div>
		</div>		
	</div>
	
	<script type="text/javascript" src="jquery.js"></script>
	<script>
		$(function() {
			$("#left1 input").click(function(e) {
				e.preventDefault();
				var i = $(this).index();
				$("#right1>.aa").eq(i).show().siblings(".aa").hide();		
			})
		});
	</script>
</body>
</html>
