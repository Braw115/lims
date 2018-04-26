<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>

<table id="studentlist" class="easyui-datagrid" title="学生表"
		pagination="true" toolbar="#toolbar"
		data-options="singleSelect:false,collapsible:true,pagination:true,url:'/student/list',method:'get',pageSize:10">
		<thead>
			<tr>
				
				<th data-options="field:'sid',width:200,align:'center'"> 学号</th>
				<th data-options="field:'password',width:200,align:'center'">密码</th>
				<th data-options="field:'sname',width:200,align:'center'">姓名</th>
				<th data-options="field:'ssex',width:200,align:'center'">性别</th>
				<th data-options="field:'sage',width:200,align:'center'">年龄</th>
			</tr>
		</thead>
	</table>
<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newUser()">添加学生</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
</div>

	<div id="dlg" class="easyui-dialog" style="width:400px;height:350px;padding:10px 20px"  
            closed="true" buttons="#dlg-buttons">  
        <div class="ftitle">用户信息</div><br/> 
        <form id="fm" method="post" novalidate>  
            <div class="fitem">  
                <label>学　号:</label>  
                <input name="sid" class="easyui-textbox" required="true" >  
            </div> <br/> 
             <div class="fitem">  
                <label>密　码:</label>  
                <input name="password" type="password" class="easyui-textbox" required="true">  
            </div> <br/>   
            <div class="fitem">  
                <label>姓　名:</label>  
                <input name="sname" class="easyui-textbox" required="true">  
            </div> <br/> 
             <div class="fitem">  
                <label>性　别:</label>  
                <input name="ssex" class="easyui-textbox" required="true">  
            </div><br/>
            <div class="fitem">  
                <label>年　龄:</label>  
                <input name="sage" class="easyui-textbox" required="true">  
            </div><br/>  
        </form>  
    </div>  
    <div id="dlg-buttons">  
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">保存</a>  
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>  
    </div> 
    
     
<script type="text/javascript">
var url_pattern;
	function newUser(){
		$('#dlg').dialog('open').dialog('setTitle','New User');
		url_pattern = 'student/addStu';
	}
	
	function saveUser(){
		 $('#fm').form('submit',{  
             url: url_pattern,  
             onSubmit: function(){  
                 return $(this).form('validate');  
             },  
             success: function(result){  
            	 
            	 
                 $('#dlg').dialog('close');        // close the dialog  
                 $('#studentlist').datagrid('reload');    // reload the user data  
             }  
         });
		 
	}
		 //编辑（修改，更新）用户
		 function editUser(){  
			
	            var row = $("#studentlist").datagrid('getSelected');  
	            if (row){  
	                $('#dlg').dialog('open').dialog('setTitle','Edit User');  
	                $('#fm').form('load',row);  
	                url_pattern = '/student/updateStu';  
	            }  
	        }  

	//删除用户
	function destroyUser(){  
            var row = $('#studentlist').datagrid('getSelected');  
            if (row){  
                $.messager.confirm('Confirm','确定要删除这个用户么？',function(r){  
                    if (r){  
                        $.post('/student/delStu',{sid:row.sid},function(result){  
                             $('#studentlist').datagrid('reload');  
                        },'json');  
                    }  
                    
                    $('#studentlist').datagrid('reload');  
                });  
            }
	}
</script>