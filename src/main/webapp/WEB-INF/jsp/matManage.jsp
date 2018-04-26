<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>

<table id="matlist" class="easyui-datagrid" title="耗材信息"
		pagination="true" toolbar="#toolbar"
		data-options="singleSelect:false,collapsible:true,pagination:true,url:'/mat/list',method:'get',pageSize:10">
		<thead>
			<tr>
				
				<th data-options="field:'matNum',width:200,align:'center'">耗材编号 </th>
				<th data-options="field:'matName',width:200,align:'center'">耗材名称</th>
				<th data-options="field:'matAttribute',width:200,align:'center'">耗材所属</th>
				<th data-options="field:'matRemain',width:200,align:'center'">耗材余量(ml)</th>
			</tr>
		</thead>
	</table>
<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newMat()">添加耗材</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editMat()">编辑</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyMat()">删除</a>
</div>

	<div id="dlg" class="easyui-dialog" style="width:400px;height:350px;padding:10px 20px"  
            closed="true" buttons="#dlg-buttons">  
        <div class="ftitle">耗材信息</div><br/> 
        <form id="fm" method="post" novalidate>  
            <div class="fitem">  
                <label>编　号:</label>  
                <input name="matNum" class="easyui-textbox" required="true" >  
            </div> <br/> 
             <div class="fitem">  
                <label>名　称:</label>  
                <input name="matName"  class="easyui-textbox" required="true">  
            </div> <br/>   
            <div class="fitem">  
                <label>所　属:</label>  
                <input name="matAttribute" class="easyui-textbox" required="true">  
            </div> <br/> 
             <div class="fitem">  
                <label>余　量:</label>  
                <input name="matRemain" class="easyui-textbox" required="true">  
            </div><br/>
            
        </form>  
    </div>  
    <div id="dlg-buttons">  
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveMat()" style="width:90px">保存</a>  
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>  
    </div> 
    
     
<script type="text/javascript">
var url_pattern;
	function newMat(){
		$('#dlg').dialog('open').dialog('setTitle','New Mat');
		url_pattern = 'mat/addMat';
	}
	
	function saveMat(){
		 $('#fm').form('submit',{  
             url: url_pattern,  
             onSubmit: function(){  
                 return $(this).form('validate');  
             },  
             success: function(result){  
            	 
            	 
                 $('#dlg').dialog('close');        // close the dialog  
                 $('#matlist').datagrid('reload');    // reload the user data  
             }  
         });
		 
	}
		 //编辑（修改，更新）用户
		 function editMat(){  
			
	            var row = $("#matlist").datagrid('getSelected');  
	            if (row){  
	                $('#dlg').dialog('open').dialog('setTitle','Edit Mat');  
	                $('#fm').form('load',row);  
	                url_pattern = '/mat/updateMat';  
	            }  
	        }  

	//删除用户
	function destroyMat(){  
            var row = $('#matlist').datagrid('getSelected');  
            if (row){  
                $.messager.confirm('Confirm','确定要删除这个用户么？',function(r){  
                    if (r){  
                        $.post('/mat/delMat',{matNum:row.matNum},function(result){  
                             $('#matlist').datagrid('reload');  
                        },'json');  
                    }  
                    
                    $('#matlist').datagrid('reload');  
                });  
            }
	}
</script>