<%@ page language="java" import="java.util.*, bookcrossing.domain.UserInfo" pageEncoding="utf-8"%>
<%
	UserInfo user = (UserInfo)request.getAttribute("userMain");	
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'specificMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/title.css">
    <link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/message.css">

	<script type="text/javascript">
		//强制必须填性别
		function check() {
			 	var b = false;
				var a=document.getElementsByName("sex");
  				for(var i=0; i<a.length; i++)
       				if(a[i].checked) {
         				b = true;
        				 break; 
       				}
     
   				if(!b){
      				alert("对不起,请选择性别");
      				return false;
   				}
   				return true;
		}
	</script>
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
		<div class="messageleft">
		<img alt="图片" src="<%=request.getContextPath()%>/img/messagebackground.jpg" />
		<input class ="chooseimg" type='file' name='myimg' />
        <input class="submitImg" type='submit' value='提交'/>
		</div>
		<div class="messageright">
		<form action="userinfoperfect" method="post" onsubmit="return check();">
			<div>
			<span>用户名：</span>
			<input class="usernameInput" type="text" name="username" value="<%=(user!=null)?user.getUserName():"" %>"/>
			</div>
			<div>
			<span>性别：</span>
			<input class= "sexChoose"  type="radio" name="sex" value="m"/>男
			<input class= "sexChoose"  type="radio" name="sex" value="f"/>女
			</div>
		    <div>
			<span>地址：</span>
			<input class="address" type="text" name="address" />
			</div>
		    <div class="hobby">
			    <span>兴趣：</span>
			    <input type="checkbox" name="hobby" value="艺术"/> 艺术
			    <input type="checkbox" name="hobby" value="计算机"/>计算机
			    <input type="checkbox" name="hobby" value="文学"/>文学
			    <input type="checkbox" name="hobby" value="生活"/>生活</br>
			    &nbsp;<input type="checkbox" name="hobby" value="科技"/>科技
			    <input type="checkbox" name="hobby" value="管理"/>管理
			    <input type="checkbox" name="hobby" value="励志"/>励志
			    <input type="checkbox" name="hobby" value="教育"/>教育
			    <input type="checkbox" name="hobby" value="其他"/>其他
			</div>
			<div>
				<input class="okBotton" type="submit" value="确认" />
			</div>
		</form>
		</div>
	</div>
  </body>
</html>
