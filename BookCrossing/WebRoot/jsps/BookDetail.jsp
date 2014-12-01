<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'BookDetail.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/title.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/detail.css">
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
					<li><a href="#">首页</a></li>
					<li><a href="#">我的漂书</a></li>
					<li><a href="#">我的积分</a></li>
					<li><a href="#">我的收藏</a></li>
					<li><a href="#">[登录/注册]</a></li>
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
		<div class="detailTop">
			<div class="imgPosition">
				<img alt="BookCrossing"
					src="<%=request.getContextPath()%>/img/java.jpg" />
			</div>
			<div class="detailPosition">
				<div class="detailPositionleft">
				  <span>java编程思想</span><br/><br/>
				  <span>作者:[美]埃克尔</span><br/><br/>
				  <span>出版社:机械工业出版社</span><br/><br/>
				  <span>出版时间:2007年6月</span><br/><br/>
				</div>
				<div class="detailPositionright">
				   <span>待漂</span>
				</div>
			</div>
			<div class="detailPosition">
				
				  <span>转漂：3次</span><br/><br/>
				  <span>持有者：林佳怡</span><br/><br/>
				  <span>内容简介：本书的作者拥有多年教学经验，对C、C++以及Java语言都有独到、深入的见解。······
				  </span><br/><br/>
		          <button>收藏</button>
		          <button>求漂</button>
			</div>
		</div>
	</div>
</body>
</html>
