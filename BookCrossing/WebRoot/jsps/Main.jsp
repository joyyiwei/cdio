<%@ page language="java" import="java.util.*,bookcrossing.domain.UserInfo" pageEncoding="utf-8"%>
<%
	UserInfo user = (UserInfo)request.getAttribute("userMain");
	request.removeAttribute("err"); //移除
	//System.out.println("---" + user.getUserName());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<script src="//code.jquery.com/jquery-1.9.1.min.js"></script>
<title>My JSP 'FirstPage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/title.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/Main.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/item.css">
</head>

<body>
	<div class="top">
		<div class="top1">
			<div class="top1a">
				<a href="#"> <img src="img/tushupiaoliu.jpg" alt="图书漂流"
					weight="200px" height="54px" />
				</a>
			</div>
			<div class="top1b">
				<ul>
					<li><a href="<%=request.getContextPath()%>/jsps/Main.jsp">首页</a></li>
					<li><a href="<%=request.getContextPath()%>/jsps/myCrossingBooks.jsp">我的漂书</a></li>
					<li><a href="<%=request.getContextPath()%>/jsps/myCrossingBooks.jsp">我的积分</a></li>
					<li><a href="<%=request.getContextPath()%>/jsps/myCrossingBooks.jsp">我的收藏</a></li>
					<li><a href="#">[<%=user.getUserName()%>]</a></li> 
				</ul>
			</div>
		</div>
		<div class="top2">
			<div class="top2a">
				<a href="#"> <img src="img/bookcrossing.jpg" alt="图书漂流"
					weight="230px" height="45px" />
				</a>
			</div>
			<div class="top2b">
				<input class="text" type="text" name"reserch" value=""
					style="height:43px; width:385px"> <input class="reserch"
					type="submit" value="搜索">
			</div>
		</div>
	</div>

	<div class="bottom">
		<div id="left1">
			<a name="wenxue">文学</a> <a name="jisuanji">计算机</a> <a name="jiaoyu">教育</a>
			<a name="guanli">管理</a> <a name="lizhiyuchenggong">励志与成功</a> <a
				name="renwensheke">人文社科</a> <a name="shenghuo">生活</a> <a
				name="yishu">艺术</a> <a name="keji">科技</a> <a name="qita">其他</a>
		</div>
		<div id="right1">
	    	<div id="wenxue" class="aa">
               <iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook.jsp"></iframe> 
            </div> 
			<div id="jisuanji" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook2.jsp"></iframe>
			</div>
			<div id="jiaoyu" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook.jsp"></iframe>
			</div>
			<div id="guanli" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook2.jsp"></iframe>
			</div>
			<div id="lizhiyuchenggong" class="aa" style="display: none">
		    <iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook.jsp"></iframe>
			</div>
			<div id="renwensheke" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook2.jsp"></iframe>
			</div>
			<div id="shenghuo" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook.jsp"></iframe>
			</div>
			<div id="yishu" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook2.jsp"></iframe>
			</div>
			<div id="keji" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook.jsp"></iframe>
			</div>
			<div id="qita" class="aa" style="display: none">
			<iframe width="740px" height="445px"  src="<%=request.getContextPath()%>/jsps/SearchBook2.jsp"></iframe>
			</div>
		</div>
	</div>

	<script type="text/javascript" src="jquery.js"></script>
	<script>
		$(function() {
			$("#left1 a").click(function(e) {
				e.preventDefault();
				var i = $(this).index();
				$("#right1>.aa").eq(i).show().siblings(".aa").hide();
			})
		});
	</script>
</body>