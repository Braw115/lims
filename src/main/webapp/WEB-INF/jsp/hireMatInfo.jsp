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
	url="/mat/list" toolbar="#tb" title="耗材借用信息"
	iconCls="icon-save" rownumbers="true" pagination="true">
	<thead>
		<tr>
			<th data-options="field:'matNum',width:200,align:'center'">耗材编号 </th>
				<th data-options="field:'matName',width:200,align:'center'">耗材名称</th>
				<th data-options="field:'matAttribute',width:200,align:'center'">耗材所属</th>
				<th data-options="field:'matRemain',width:200,align:'center'">耗材余量(ml)</th>
		</tr>
	</thead>
</table>
<div id="tb" style="padding:3px">
	<span>耗材编号:</span> <input id="matNum"
		style="line-height:26px;border:1px solid #ccc"> <span>耗材名称:</span> <input id="matName"
		style="line-height:26px;border:1px solid #ccc"> <a href="#"
		class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
</div>

<script type="text/javascript">
	function doSearch(){
        $('#tt').datagrid('load',{
            matNum: $('#matNum').val(),
            matName: $('#matName').val()
        });
    }
</script>