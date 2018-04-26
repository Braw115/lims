<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>

<table id="lablist" class="easyui-datagrid" title="实验室信息"
		pagination="true" toolbar="#toolbar"
		data-options="singleSelect:false,collapsible:true,pagination:true,url:'/lab/list',method:'get',pageSize:10">
		<thead>
			<tr>
				
				<th data-options="field:'labNum',width:200,align:'center'">实验室编号</th>
				<th data-options="field:'labName',width:200,align:'center'">实验室名称</th>
				<th data-options="field:'labCatagroy',width:200,align:'center'">实验室类别</th>
				<th data-options="field:'labStatus',width:200,align:'center'">实验室状态</th>
			</tr>
		</thead>
	</table>
<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newLab()">新增实验室</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editLab()">编辑</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyLab()">删除</a>
</div>

	<div id="dlg" class="easyui-dialog" style="width:400px;height:350px;padding:10px 20px"  
            closed="true" buttons="#dlg-buttons">  
        <div class="ftitle">实验室信息</div><br/> 
        <form id="fm" method="post" novalidate>  
            <div class="fitem">  
                <label>编　号:</label>  
                <input name="labNum" class="easyui-textbox" required="true" >  
            </div> <br/> 
             <div class="fitem">  
                <label>名　称:</label>  
                <input name="labName" type="easyui-textbox" class="easyui-textbox" required="true">  
            </div> <br/>   
            <div class="fitem">  
                <label>类　型:</label>  
                <input name="labCatagroy" class="easyui-textbox" required="true">  
            </div> <br/> 
             <div class="fitem">  
                <label>状　态:</label>  
                <input name="labStatus" class="easyui-textbox" required="true">  
            </div><br/>
        </form>  
    </div>  
    <div id="dlg-buttons">  
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveLab()" style="width:90px">保存</a>  
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>  
    </div> 
    
     
<script type="text/javascript">
var url_pattern;
	function newLab(){
		$('#dlg').dialog('open').dialog('setTitle','New Lab');
		url_pattern = 'lab/addLab';
	}
	
	function saveLab(){
		 $('#fm').form('submit',{  
             url: url_pattern,  
             onSubmit: function(){  
                 return $(this).form('validate');  
             },  
             success: function(result){  
            	 
            	 
                 $('#dlg').dialog('close');        // close the dialog  
                 $('#lablist').datagrid('reload');    // reload the user data  
             }  
         });
		 
	}
		 //编辑（修改，更新）实验室
		 function editLab(){  
			
	            var row = $("#lablist").datagrid('getSelected');  
	            if (row){  
	                $('#dlg').dialog('open').dialog('setTitle','Edit Lab');  
	                $('#fm').form('load',row);  
	                url_pattern = '/lab/updateLab';  
	            }  
	        }  

	//删除用户
	function destroyLab(){  
            var row = $('#lablist').datagrid('getSelected');  
            if (row){  
                $.messager.confirm('Confirm','确定要删除这个实验室？',function(r){  
                    if (r){  
                        $.post('/lab/delLab',{labNum:row.labNum},function(result){  
                             $('#lablist').datagrid('reload');  
                        },'json');  
                    }  
                    
                    $('#lablist').datagrid('reload');  
                });  
            }
	}
</script>