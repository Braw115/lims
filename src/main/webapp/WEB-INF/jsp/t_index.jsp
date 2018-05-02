<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>教师首页</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/teacher.css">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<div id="top">
		<div style="float:left;">
			<img src="/images/bs_title.jpg" class="img-rounded" />
		</div>
		<div style="margin-left: 1150px;">
			<p style="color:blue;">
				欢迎：<a href="javascript:0;">${sessionScope.teacher.tname}</a> 教师| <a
					href="user/logout;">退出</a>
			</p>
		</div>
	</div>
	<nav id="nav" class="navbar navbar-default" role="navigation">
		<div id="flu" class="container-fluid">
			<!--<div class="navbar-header">
		<a class="navbar-brand" href="#">导航</a>
	</div>-->
			<div id="con">
				<ul id="list" class="nav navbar-nav">
					<li class="dropdown"><a href="/t_index">首页</a></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 用户管理 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="/stuManage">学生信息管理</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 资源管理 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="/labManage">实验室</a></li>
							<li><a href="/devManage">实验设备</a></li>
							<li><a href="/matManage">耗材</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 课程管理 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="/technologyCourse">多媒体课程</a></li>
							<li><a href="/physicsCourse">物理实验课程</a></li>
							<li><a href="/chemistryCourse">化学实验课程</a></li>
							<li><a href="/biologyCourse">生物实验课程</a></li>
							<li><a href="/medicineCourse">医学实验课程</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 租借管理 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="/hireLabInfo">实验室租借信息</a></li>
							<li><a href="/hireDevInfo">设备租借信息</a></li>
							<li><a href="/hireMatInfo">耗材借用信息</a></li>
						</ul></li>


					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> 统计分析 <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="/notice">发布公告 </a></li>
							<li><a href="#">规章制度</a></li>
							<li><a href="#">实验室使用情况</a></li>
							<li><a href="#">学生选课信息统计</a></li>
						</ul></li>
				</ul>
			</div>
		</div>

		<!-- 此处以后放不同的html片段-->
		<div class="well" id="well">
			<div id="placeTitle">
				<p style="color:blue;">
					<img src="/images/bs_naviga.jpg" alt="图标" />当前位置-- <a id="place"
						href="#">通知公告</a>
				</p>
			</div>
			<div id="info" class="well"></div>
		</div>
		<div id="desc">
			<p style="color:blue;">
				<font size="2">Copyright ©2014-2018 毕业设计专用 版权所有</font>
			</p>
		</div>
	</nav>



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