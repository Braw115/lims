<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" charset="utf-8" src="/js/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/ueditor/ueditor.all.min.js"></script>
<!--  <script type="text/javascript" charset="utf-8" src="/js/ueditor/lang/zh-cn/zh-cn.js"></script>
<link rel="stylesheet" type="text/css" href="/js/ueditor/themes/default/css/ueditor.css"/>
-->

<form action="/" >
</br>
 公告标题：<input id="title style="width: 225px;"/><br/><br/>
<script id="editor" type="text/plain" style="width:1000px;height:252px;"></script><br/>
<input  id="sub" type="submit" value="发布公告"/>
</form>
<script type="text/javascript">     
    var ue = UE.getEditor('editor',
    {
        initialFrameWidth : 1000,
        initialFrameHeight: 150
    }
    );
    $("#submit").click(function(){
    	var title = $("#title").val();
        var content = UE.getEditor('editor').getContent();
        $.ajax({
            cache: true,
            type: "GET",
            url: "/notice/add",
　　　　　　　　data: {
				"title":title,
				"content":content
　　　　　　
　　　　　　　　},

            async: false,
            error: function(request) {
                alert("Connection error");
            },
            success: function(){
                alert("success");
            }
        });
    });
</script>  