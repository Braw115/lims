<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<script type="text/javascript" charset="utf-8" src="/js/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/ueditor/ueditor.all.js"></script>  
<link rel="stylesheet" type="text/css" href="/js/ueditor/themes/default/css/ueditor.css"/>
<form action="/" >
标题<input id="title" /><br/>
<textarea id="myEditor"></textarea>
<submit id="sub" >发布公告</submit>
</form>
<script type="text/javascript">  
    var editor = new UE.ui.Editor();  
    editor.render("myEditor");  
</script>  