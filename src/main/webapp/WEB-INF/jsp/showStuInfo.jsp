<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<div class="panel panel-info">
	<div class="panel-heading">
		<h3 class="panel-title">个人信息</h3>
	</div>
	<table class="table">
		<tr>
			<td>sid</td>
			<td>${sessionScope.student.sid}</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>${sessionScope.student.sname}</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>${sessionScope.student.ssex}</td>
		</tr>
		<tr>
			<td>年龄</td>
			<td>${sessionScope.student.sage}</td>
		</tr>
	</table>
</div>


