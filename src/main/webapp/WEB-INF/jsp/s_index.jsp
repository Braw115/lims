<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>学生首页</title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/student.css">
	<link rel="stylesheet" type="text/css" href="/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/js/easyui/themes/icon.css">
	<script type="text/javascript" src="/js/easyui/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/easyui/jquery.easyui.min.js"></script>
	
</head>
<body>
	<div id="all" class="well">
<div id="top">
	<div style="float:left;"><img src="/images/bs_title.jpg" class="img-rounded"/></div>
	<div style="margin-left: 1150px;"><p style="color:blue;">欢迎：<a href="javascript:0;">${sessionScope.student.sname}</a>同学 | <a href="user/logout;">退出</a></p></div>
</div>
<nav id="nav" class="navbar navbar-default" role="navigation">
	 <div id="flu" class="container-fluid">
	<!--<div class="navbar-header">
		<a class="navbar-brand" href="#">导航</a>
	</div>-->
	<div id="con">
		<ul id="list" class="nav navbar-nav">
			<li class="dropdown"><a href="/s_index">首页</a></li>
			
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					实验室一览
					<b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
					<li><a href="#">多媒体实验室</a></li>
					<li><a href="#">物理实验室</a></li>
					<li><a href="#">化学实验室</a></li>
					<li><a href="#">生物实验室</a></li>
					<li><a href="#">医学实验室</a></li>	
					</ul>
			</li>
			
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					学生选课
					<b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><a href="#">多媒体实验室课程</a></li>
					<li><a href="#">物理实验室课程</a></li>
					<li><a href="#">化学实验室课程</a></li>
					<li><a href="#">生物实验室课程</a></li>
					<li><a href="#">医学实验室课程</a></li>	
				</ul>
			</li>
			
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					租借
					<b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><a href="#">实验室</a></li>
					<li><a href="#">实验器材</a></li>
					<li><a href="#">耗材</a></li>
					
					
				</ul>
			</li>
			
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					信息查询
					<b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><a href="/showStuInfo">个人信息</a></li>
					<li><a href="#">选课信息</a></li>
					<li><a href="#">实验室租借信息</a></li>
				</ul>
			</li>
			
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">
					规章制度
					<b class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<li><a href="#">实验室建设与管理	</a></li>
					<li><a href="#">大型仪器设备管理	</a></li>					
					<li><a href="#">仪器设备购置管理	</a></li>
					<li><a href="#">技术安全管理</a></li>
				</ul>
			</li>
		</ul>
	</div>
	</div>
	<!-- 此处以后放不同的html片段-->
	<div class="well" id="well" >
		<div id="placeTitle">
			<p style="color:blue;">
				<img src="/images/bs_naviga.jpg" alt="图标"/>当前位置--<a id="place" href="#">通知公告</a>
			</p>
		</div>
		<div id="info" class="well">
		</div>
	</div>
</nav>
<div id="desc"><p style="color:blue;"><font size="2">Copyright ©2014-2018 毕业设计专用 版权所有</font></p></div>
</div>

<script type="text/javascript">
$(function(){
	$("#list li ul li a").on("click",function(e){
		e.preventDefault();
		$("#place").html($(this).html()); 
		var thislink = $(this).attr('href');
		$("#info").load(thislink,function(){})
	})
})
</script>
</body>
</html>