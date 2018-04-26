<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>

<table id="courselist" class="easyui-datagrid" title="生物实验课程"
		pagination="true" toolbar="#toolbar"
		data-options="singleSelect:false,collapsible:true,pagination:true,url:'/course/biology',method:'get',pageSize:10">
		<thead>
			<tr>
				
				<th data-options="field:'cid',width:200,align:'center'">课程号</th>
				<th data-options="field:'cname',width:200,align:'center'">课程名</th>
				<th data-options="field:'cdept',width:200,align:'center'">开课实验室</th>
				<th data-options="field:'cinfo',width:200,align:'center'">课程介绍</th>
				<th data-options="field:'count',width:200,align:'center'">已选课人数</th>
			</tr>
		</thead>
	</table>
<div id="toolbar">
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-add" plain="true" onclick="newCourse()">新增课程</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editCourse()">编辑</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-remove" plain="true" onclick="destroyCourse()">删除</a>
</div>

	<div id="dlg" class="easyui-dialog" style="width:400px;height:350px;padding:10px 20px"  
            closed="true" buttons="#dlg-buttons">  
        <div class="ftitle">课程信息</div><br/> 
        <form id="fm" method="post" novalidate>  
            <div class="fitem">  
                <label>课　号:</label>  
                <input name="cid" class="easyui-textbox" required="true" >  
            </div> <br/> 
             <div class="fitem">  
                <label>课　名:</label>  
                <input name="cname" type="easyui-textbox" class="easyui-textbox" required="true">  
            </div> <br/> 
            <div class="fitem">  
                <label>开课实验室:</label>  
                <input name="cdept" class="easyui-textbox" required="true">  
            </div> <br/>  
            <div class="fitem">  
                <label>课程信息:</label>  
                <input name="cinfo" class="easyui-textbox" required="true">  
            </div> <br/> 
             <div class="fitem">  
                <label>选课人数:</label>  
                <input name="count" class="easyui-textbox" required="true">  
            </div><br/>
        </form>  
    </div>  
    <div id="dlg-buttons">  
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveCourse()" style="width:90px">保存</a>  
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取消</a>  
    </div> 
    
     
<script type="text/javascript">
var url_pattern;
	function newCourse(){
		$('#dlg').dialog('open').dialog('setTitle','New Course');
		url_pattern = 'course/add';
	}
	
	function saveCourse(){
		 $('#fm').form('submit',{  
             url: url_pattern,  
             onSubmit: function(){  
                 return $(this).form('validate');  
             },  
             success: function(result){  
            	 
            	 
                 $('#dlg').dialog('close');        // close the dialog  
                 $('#courselist').datagrid('reload');    // reload the user data  
             }  
         });
		 
	}
		 //编辑（修改，更新）实验室
		 function editCourse(){  
			
	            var row = $("#courselist").datagrid('getSelected');  
	            if (row){  
	                $('#dlg').dialog('open').dialog('setTitle','Edit Course');  
	                $('#fm').form('load',row);  
	                url_pattern = '/course/update';  
	            }  
	        }  

	//删除用户
	function destroyCourse(){  
            var row = $('#courselist').datagrid('getSelected');  
            if (row){  
                $.messager.confirm('Confirm','确定要删除这个课程？',function(r){  
                    if (r){  
                        $.post('/course/del',{cid:row.cid},function(result){  
                             $('#courselist').datagrid('reload');  
                        },'json');  
                    }  
                    
                    $('#courselist').datagrid('reload');  
                });  
            }
	}
</script>