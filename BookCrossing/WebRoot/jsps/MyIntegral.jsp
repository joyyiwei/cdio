<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyIntegral.jsp' starting page</title>
    <script type="text/javascript" src="jquery.js"></script>
	<script>
		function refresh() {

		}
	</script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
		href="<%=request.getContextPath()%>/css/Integral.css">

  </head>
  
  <body onload="refresh();">
    <div class="showValue">
	    <br/>
	    <br/>
	    <span>可用积分</span><input type="text" value="100"/><span>分</span>
    </div>
    <div class="integralDetail">
        <br/>
	    <br/>
        <span class="ques">积分的用处是什么？ </span></br>
        <span> 当漂友持有足够的积分时，可以进入该系统进行书的求漂。</span></br>
        <span> 每求取到一本书，漂友就要扣去50个积分。</span>
        <br/>
	    <br/>
	    <span class="ques">如何获得积分？</span></br>
        <span> 漂友每漂出一本书，就会相应的得到50积分。</span>
	</div>
  </body>
</html>
