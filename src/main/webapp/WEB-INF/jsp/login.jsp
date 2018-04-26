<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#img").click(function(){
			var url="/createCode?number="+Math.random();
			$("#img").attr("src",url);    
		});
		
		
		
		$("#sub").click(function(){
			/*$.post("/dologin?rand="+Math.random(),$("#form").serialize(),
						function(data){
							alert("进入回掉函数");
							alert(data.message);
							if(data.flag == "1"){
								alert("index重定向之前");
								window.location.href="/index";
							}else{
								alert("login重定向之前");
								window.location.href="/login";
							}
						 },"json",);*/
			$.ajax({
				type: 'POST',
				url: '/user/dologin?number='+Math.random(),
				data: $('#form').serialize(),
				dataType: 'json',
				async: true,
				success: function(data){
							//alert('进入回掉函数');
							alert(data.message);
							if(data.flag == '0'){
								//alert('index重定向之前');
								window.location.href='/s_index';
							}else if(data.flag == '1'){
								window.location.href='/t_index';
							}else{
								//alert('login重定向之前');
								window.location.href='/login';
							}
							},
					error:function(xhr){
					alert('回掉错误'+xhr.flag+xhr.message);
					window.location.href='/login';
					}		
			});	
		});
	});
</script>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<% String path = request.getContextPath(); 
   String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<!DOCTYPE html>
<html>
<head>
<title>登录页面</title>
<meta charset="utf-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="login">
		<form id="form">
			<input id="uid" type="text" name="uid"><br> 
			<input id="password" type="password" name="password"> 
			<input id="checkCode" type="text" name="checkCode">
			<img id="img" src="<%=basePath%>createCode">
			<input id="ra1" type="radio" name="role" value="0">
				<font size="1" color="#324762">学生</font></input> 
			<input id="ra2" type="radio" name="role" value="1">
				<font size="1" color="#324762">教师</font></input>
			<input id="sub" type="button" value="登录"> 
			<input id="reset" type="reset" value="重置">
		</form>
	</div>
	<div id="desc">
		<p style="color:blue;">
			<font size="2">Copyright ©2014-2018 毕业设计专用 版权所有</font>
		</p>
	</div>
	
</body>
</html>
