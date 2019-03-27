<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="school-info" title="院校信息列表" class="easyui-datagrid"
		url="<%=basePath%>admin/school/list.action" fit="true" pageSize="30"
		toolbar="#school-info-toolbar" pagination="true" collapsible="true"
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
<div id="school-info-toolbar" style="height:50px">
	学校编号:<input id="searchSchoolId" type="text" /> 
	学校名称:<input id="searchSchoolName" type="text" /> 
	所属区域:<input id="searchSchoolArea" type="text" /> 
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchSchool()">搜索</a> <br>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newSchool()">新增</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editSchool()">编辑</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroySchool()">删除</a>
	<!-- <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" plain="true" onclick="batchDesSchool()">批量删除</a> -->
</div>

<div id="dlg" class="easyui-dialog" style="width: 400px; height: 180px; padding: 10px 20px"
    closed="true" buttons="#dlg-buttons" shadow="false">
    <form id="fm" method="post">
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
<div id="dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveSchool()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
</div>
<script type="text/javascript">
function searchSchool(){
	$('#school-info').datagrid('load',{
		searchSchoolId: $('#searchSchoolId').val(),
		searchSchoolName: $('#searchSchoolName').val(),
		searchSchoolArea: $('#searchSchoolArea').val()
	});
}
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
function newSchool(){
    $('#dlg').dialog('open').dialog('setTitle','新增院校');
    $('#fm').form('clear');
    url = '<%=basePath%>admin/school/add.action';
}
function editSchool(){
	var row = $('#school-info').datagrid('getSelected');
	if (row){
		$('#dlg').dialog('open').dialog('setTitle','编辑院校');
		$('#fm').form('load',row);
		url = '<%=basePath%>admin/school/update.action?schoolId='+row.schoolId;
	}else{
		showInfo("请选择一行数据!");
	}
}
function saveSchool(){
	$('#fm').form('submit',{
		url: url,
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(date){
			var date = eval('('+date+')');
			if (date.result == 'error'){
				showInfo("操作失败!");
			} else {
				$('#dlg').dialog('close');	
				showInfo("操作成功!");
				$('#school-info').datagrid('reload');	
			}
		}
	});
}
function destroySchool(){
	var row = $('#school-info').datagrid('getSelected');
	if (row){
		$.messager.confirm('删除院校','确定删除？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/school/delete.action',
					{schoolId:row.schoolId},
					function(date){
						if (date.result == 'success'){
							$('#school-info').datagrid('reload');	
						} else {
							showInfo("操作失败!");
						}
					},
					'json'
				);
			}
		});
	}else{
		showInfo("请选择一行数据!");
	}
}
//批量删除
function batchDesSchool() {
    var selRow = $("#school-info").datagrid('getSelections');
    if (selRow.length == 0) {
        showInfo("请至少选择一行数据!");
        return false;
    }
    var ids = [];
    for (var i = 0; i < selRow.length; i++) {
        var id = selRow[i].id;
        ids.push(id); //把单个id循环放到ids的数组中  
    }
    $.messager.confirm('提示', '确认删除?', function(r) {
        if (r) {
            $.ajax({
                url : '<%=basePath%>admin/school/batchDel.action',
                dataType : 'json',
                type : 'post',
                data : {
                    schoolIds : ids
                },
                success : function(data) {
                    showInfo('删除成功!');
                    $('#school-info').datagrid('reload');	
                },
                error : function(data) {
                    showInfo('删除失败!');
                }
            });
        }
    });
}
function  showInfo(msgStr){
	$.messager.show({
		title: '提示',
		msg: msgStr,
		timeout : 3000,
        showType : 'slide'
	});
}
</script>
