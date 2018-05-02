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
		<h3 class="panel-title">公告信息</h3>
	</div>
	<table class="table table-bordered">
		<thead>
		<tr>
			<th>公告标题</th>
			<th>发布时间</th>
			<th>发布单位</th>
		</tr>
		</thead>

			<tbody>

			<c:forEach  items="${noticeList}" var="notice">
			<tr>
				<td><a id="title" href="#">${notice.title}</a></td>
				<td><fmt:formatDate value="${notice.announceData}" dateStyle="long" /></td>
				<td>${notice.announceDept}</td>
			</tr>
			</c:forEach>
			</tbody>
	</table>
</div>
<script type="text/javascript" >
	$('#title').on(click,function(e){
		
	})

</script>


