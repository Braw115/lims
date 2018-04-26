<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css"
	href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>

<table id="tt" class="easyui-datagrid" 
	url="/lab/list" toolbar="#tb" title="实验室租借信息"
	iconCls="icon-save" rownumbers="true" pagination="true">
	<thead>
		<tr>
			<th data-options="field:'labNum',width:200,align:'center'">实验室编号</th>
			<th data-options="field:'labName',width:200,align:'center'">实验室名称</th>
			<th data-options="field:'labCatagroy',width:200,align:'center'">实验室类别</th>
			<th data-options="field:'labStatus',width:200,align:'center'">实验室状态</th>
		</tr>
	</thead>
</table>
<div id="tb" style="padding:3px">
	<span>实验室编号:</span> <input id="labNum"
		style="line-height:26px;border:1px solid #ccc"> <span>实验室名称:</span> <input id="labName"
		style="line-height:26px;border:1px solid #ccc"> <a href="#"
		class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
</div>

<script type="text/javascript">
	function doSearch(){
        $('#tt').datagrid('load',{
            labNum: $('#labNum').val(),
            labName: $('#labName').val()
        });
    }
</script>