<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mutual.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/title.css">
    <link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/mutual.css">
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
		<div class="dialogue">
		<a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=841455393&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:841455393:52" alt="Click Me！我为您服务" title="Click Me！为您服务" style="vertical-align: middle"/></a>
	<!-- 	<a target="_blank" href="http://sighttp.qq.com/authd?IDKEY=73ced48be5f5240c76744e4d6a4ce980fe4a315a6c479429"><img border="0"  src="http://wpa.qq.com/imgd?IDKEY=73ced48be5f5240c76744e4d6a4ce980fe4a315a6c479429&pic=52" alt="点击这里给我发消息" title="点击这里给我发消息"/></a>
	<img  style="CURSOR: pointer" onclick="javascript:window.open('http://b.qq.com/webc.htm?new=0&sid=826262405&o=http://localhost:8088/BookCrossing/jsps/mutual.jsp&q=7', '_blank', 'height=502, width=644,toolbar=no,scrollbars=no,menubar=no,status=no');"  border="0" SRC=http://wpa.qq.com/pa?p=1:826262405:1 alt="点击这里给我发消息"> -->

<!-- 		<a target="_blank" href="http://sighttp.qq.com/authd?IDKEY=be06eebea943da9b658e364b28620a045aaccd4ba486679f"><img border="0"  src="http://wpa.qq.com/imgd?IDKEY=be06eebea943da9b658e364b28620a045aaccd4ba486679f&pic=52" alt="点击这里给我发消息" title="点击这里给我发消息"/></a>		
		<img  style="CURSOR: pointer" onclick="javascript:window.open('http://b.qq.com/webc.htm?new=0&sid=826262405&o=http://localhost:8088/BookCrossing/jsps/mutual.jsp&q=7', '_blank', 'height=502, width=644,toolbar=no,scrollbars=no,menubar=no,status=no');"  border="0" SRC=http://wpa.qq.com/pa?p=1:826262405:3 alt="点击这里给我发消息">-->
		 <!-- 会话框 -->
<!-- 		<iframe height="200px" width="700px"
			frameborder="0" name="chatAreaFrame" id="chatAreaFrame" style="margin-top: 50px;"> </iframe> -->	
		<!--输入框-->
			<div class="inputArea">
				<!-- 注意换行 -->
				<textarea wrap=hard class="userInput" id="userInput" style="resize:none" maxlength="100">
				</textarea>
				<input class="sandButton" type="button" value="发送" id="sandButton">
			</div>
		</div>
		<div class="holderlist">
			<div>
			</div>
			<div>
			</div>
		</div>
	</div>
  </body>
</html>
