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
	url="/dev/list" toolbar="#tb" title="设备租借信息"
	iconCls="icon-save" rownumbers="true" pagination="true">
	<thead>
		<tr>
			<th data-options="field:'devNum',width:200,align:'center'">设备编号 </th>
				<th data-options="field:'devName',width:200,align:'center'">设备名称</th>
				<th data-options="field:'devAttribute',width:200,align:'center'">设备所属</th>
				<th data-options="field:'devStatus',width:200,align:'center'">设备状态</th>
		</tr>
	</thead>
</table>
<div id="tb" style="padding:3px">
	<span>设备编号:</span> <input id="devNum"
		style="line-height:26px;border:1px solid #ccc"> <span>设备名称:</span> <input id="devName"
		style="line-height:26px;border:1px solid #ccc"> <a href="#"
		class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
</div>

<script type="text/javascript">
	function doSearch(){
        $('#tt').datagrid('load',{
            devNum: $('#devNum').val(),
            devName: $('#devName').val()
        });
    }
</script>