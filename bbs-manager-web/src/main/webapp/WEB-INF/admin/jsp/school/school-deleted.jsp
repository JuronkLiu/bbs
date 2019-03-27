<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="school-deleted" title="已删除院校列表" class="easyui-datagrid"
		url="<%=basePath%>admin/school/deleteList.action" fit="true" pageSize="30"
		toolbar="#school-deleted-toolbar" pagination="true" collapsible="true"
		rownumbers="false" fitColumns="true" singleSelect="true">
	<thead>
		<tr>
			<!-- <th field="cb" width="50" checkbox="true"></th> -->
			<th field="schoolId" width="50" align="center">学校编号</th>
            <th field="schoolName" width="50" align="center">学校名称</th>
            <th field="schoolArea" width="50" align="center">所属区域</th>
            <th field="createDate" width="50" align="center" formatter="dataFormatter">加入时间</th>
            <th field="updateDate" width="50" align="center" formatter="dataFormatter">更新时间</th>
		</tr>
	</thead>
</table>
<div id="school-deleted-toolbar" style="height:50px">
	学校编号:<input id="searchDelSchoolId" type="text" /> 
	学校名称:<input id="searchDelSchoolName" type="text" /> 
	所属区域:<input id="searchDelSchoolArea" type="text" /> 
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchDelSchool()">搜索</a> <br>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-back" plain="true" onclick="recoverSchool()">还原</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editDelSchool()">编辑</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="completeDelSchool()">彻底删除</a>
</div>

<div id="school-deleted-dlg" class="easyui-dialog" style="width: 400px; height: 180px; padding: 10px 20px"
    closed="true" buttons="#school-deleted-dlg-buttons" shadow="false">
    <form id="del-fm" method="post">
        <div class="fitem">
            <label>学校名称:</label> 
            <input id="schoolName" name="schoolName" class="easyui-validatebox" required="true"/>
        </div>
        <div class="fitem">
            <label>所属区域:</label> 
            <input id="schoolArea" name="schoolArea" class="easyui-validatebox" required="true" />
        </div>
    </form>
</div>
<div id="school-deleted-dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveDelSchool()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#school-deleted-dlg').dialog('close')">取消</a>
</div>
<script type="text/javascript">
//按条件查询学院
function searchDelSchool(){
	$('#school-deleted').datagrid('load',{
		searchSchoolId: $('#searchDelSchoolId').val(),
		searchSchoolName: $('#searchDelSchoolName').val(),
		searchSchoolArea: $('#searchDelSchoolArea').val()
	});
}
//时间格式化
function dataFormatter(value,row,index){
	if(value == null){
		return "--";
	}
	var da = value;
    da = new Date(da);
    var year = da.getFullYear()+'年';
    var month = da.getMonth()+1+'月';
    var date = da.getDate()+'日';
    return ([year,month,date].join('-'));  
}
//编辑院校
function editDelSchool(){
	var row = $('#school-deleted').datagrid('getSelected');
	if (row){
		$('#school-deleted-dlg').dialog('open').dialog('setTitle','编辑院校');
		$('#del-fm').form('load',row);
		url = '<%=basePath%>admin/school/update.action?schoolId='+row.schoolId;
	}
}
//保存院校
function saveDelSchool(){
	$('#del-fm').form('submit',{
		url: url,
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(date){
			var date = eval('('+date+')');
			if (date.result == 'error'){
				showInfo("操作失败!");
			} else {
				$('#school-deleted-dlg').dialog('close');	
				showInfo("操作成功!");
				$('#school-deleted').datagrid('reload');	
			}
		}
	});
}
//完全删除院校
function completeDelSchool(){
	var row = $('#school-deleted').datagrid('getSelected');
	if (row){
		$.messager.confirm('彻底删除院校','确定删除？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/school/completeDel.action',
					{schoolId:row.schoolId},
					function(date){
						if (date.result == 'success'){
							$('#school-deleted').datagrid('reload');	
						} else {
							showInfo("操作失败!");
						}
					},
					'json'
				);
			}
		});
	}
}
//还原院校
function recoverSchool(){
	var row = $('#school-deleted').datagrid('getSelected');
	if (row){
		$.messager.confirm('还原院校','确定还原？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/school/recover.action',
					{schoolId:row.schoolId},
					function(date){
						if (date.result == 'success'){
							$('#school-deleted').datagrid('reload');	
						} else {
							showInfo("操作失败!");
						}
					},
					'json'
				);
			}
		});
	}
}
//封装提示框
function  showInfo(msgStr){
	$.messager.show({
		title: '提示',
		msg: msgStr,
		timeout : 3000,
        showType : 'slide'
	});
}
</script>
