<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>

<table id="devlist" class="easyui-datagrid" title="设备信息"
		pagination="true" toolbar="#toolbar"
		data-options="singleSelect:false,collapsible:true,pagination:true,url:'/dev/list',method:'get',pageSize:10">
		<thead>
			<tr>
				
				<th data-options="field:'devNum',width:200,align:'center'">设备编号 </th>
				<th data-options="field:'devName',width:200,align:'center'">设备名称</th>
				<th data-options="field:'devAttribute',width:200,align:'center'">设备所属</th>
				<th data-options="field:'devStatus',width:200,align:'center'">设备状态</th>
			</tr>
		</thead>
	</table>
<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newDev()">添加设备</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editDev()">编辑</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyDev()">删除</a>
</div>

	<div id="dlg" class="easyui-dialog" style="width:400px;height:350px;padding:10px 20px"  
            closed="true" buttons="#dlg-buttons">  
        <div class="ftitle">设备信息</div><br/> 
        <form id="fm" method="post" novalidate>  
            <div class="fitem">  
                <label>编　号:</label>  
                <input name="devNum" class="easyui-textbox" required="true" >  
            </div> <br/> 
             <div class="fitem">  
                <label>名　称:</label>  
                <input name="devName"  class="easyui-textbox" required="true">  
            </div> <br/>   
            <div class="fitem">  
                <label>所　属:</label>  
                <input name="devAttribute" class="easyui-textbox" required="true">  
            </div> <br/> 
             <div class="fitem">  
                <label>状　态:</label>  
                <input name="devStatus" class="easyui-textbox" required="true">  
            </div><br/>
            
        </form>  
    </div>  
    <div id="dlg-buttons">  
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveDev()" style="width:90px">保存</a>  
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>  
    </div> 
    
     
<script type="text/javascript">
var url_pattern;
	function newDev(){
		$('#dlg').dialog('open').dialog('setTitle','New Dev');
		url_pattern = 'dev/addDev';
	}
	
	function saveDev(){
		 $('#fm').form('submit',{  
             url: url_pattern,  
             onSubmit: function(){  
                 return $(this).form('validate');  
             },  
             success: function(result){  
            	 
            	 
                 $('#dlg').dialog('close');        // close the dialog  
                 $('#devlist').datagrid('reload');    // reload the user data  
             }  
         });
		 
	}
		 //编辑（修改，更新）用户
		 function editDev(){  
			
	            var row = $("#devlist").datagrid('getSelected');  
	            if (row){  
	                $('#dlg').dialog('open').dialog('setTitle','Edit Devr');  
	                $('#fm').form('load',row);  
	                url_pattern = '/dev/updateDev';  
	            }  
	        }  

	//删除用户
	function destroyDev(){  
            var row = $('#devlist').datagrid('getSelected');  
            if (row){  
                $.messager.confirm('Confirm','确定要删除这个用户么？',function(r){  
                    if (r){  
                        $.post('/dev/delDev',{devNum:row.devNum},function(result){  
                             $('#devlist').datagrid('reload');  
                        },'json');  
                    }  
                    
                    $('#devlist').datagrid('reload');  
                });  
            }
	}
</script>