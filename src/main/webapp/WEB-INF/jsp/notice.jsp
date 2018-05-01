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

<form>
</br>
 公告标题：<input id="notice_title" name="notice_title"/> 发布单位：<input id="dept" name="dept"/><br/><br/>
<script id="editor" type="text/plain" style="width:1000px;height:252px;"></script><br/>
<input  id="but" type="button" value="发布公告"/>
</form>
<script type="text/javascript">     
    var ue = UE.getEditor('editor',
    {
        initialFrameWidth : 1000,
        initialFrameHeight: 150
    }
    );
    $('#but').click(function(){
    	var notice_title = $("input[name='notice_title']").val();
        var content = UE.getEditor('editor').getContent();
        var dept =$("input[name='dept']").val(); 
        $.ajax({
            cache: true,
            type: 'POST',
            url: '/notice/announce',
            dataType: 'json',
　　　　　　　　   data: {
				"title":notice_title,
				"content":content,
				"announceDept":dept
　　　　　　　　},

            async: true,
            error: function(request) {
                alert("发布失败");
            },
            success: function(data){
                alert(data.message);
               window.location.reload();
            }
        });
    });
</script>  