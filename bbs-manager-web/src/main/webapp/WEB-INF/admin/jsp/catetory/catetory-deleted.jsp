<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="catetory-deleted" title="已删除栏目信息列表" class="easyui-datagrid"
		url="<%=basePath%>admin/catetory/delList.action" fit="true" pageSize="30"
		toolbar="#catetory-deleted-toolbar" pagination="true" collapsible="true"
		rownumbers="false" fitColumns="true" singleSelect="true">
	<thead>
		<tr>
			<!-- <th field="cb" width="50" checkbox="true"></th> -->
			<th field="catetoryId" width="50" align="center">栏目编号</th>
            <th field="catetoryName" width="50" align="center">栏目名称</th>
            <th field="parentId" width="50" align="center">所属父栏目</th>
            <th field="createDate" width="50" align="center" formatter="dataFormatter">加入时间</th>
            <th field="updateDate" width="50" align="center" formatter="dataFormatter">更新时间</th>
		</tr>
	</thead>
</table>
<div id="catetory-deleted-toolbar" style="height:50px">
	栏目编号:<input id="searchCatetoryIdDel" type="text" /> 
	栏目名称:<input id="searchCatetoryNameDel" type="text" /> 
	所属父栏目:<input id="searchParentIdDel" type="text" /> 
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchCatetoryDel()">搜索</a> <br>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editCatetoryDel()">编辑</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="completeDel()">彻底删除</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-back" plain="true" onclick="repealDel()">还原</a>
</div>

<div id="catetory-deleted-dlg" class="easyui-dialog" style="width: 400px; height: 180px; padding: 10px 20px"
    closed="true" buttons="#catetory-deleted-dlg-buttons" shadow="false">
    <form id="catetory-deleted-fm" method="post">
        <div class="fitem">
            <label>栏目名称:</label> 
            <input id="catetoryName" name="catetoryName" class="easyui-validatebox" required="true"/>
        </div>
        <div class="fitem">
            <label>所属父栏目:</label> 
            <input id="parentId" name="parentId" class="easyui-validatebox" required="true" />
        </div>
    </form>
</div>
<div id="catetory-deleted-dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveCatetoryDel()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#catetory-deleted-dlg').dialog('close')">取消</a>
</div>
<script type="text/javascript">
//查询参数
function searchCatetoryDel(){
	$('#catetory-deleted').datagrid('load',{
		searchCatetoryId: $('#searchCatetoryIdDel').val(),
		searchCatetoryName: $('#searchCatetoryNameDel').val(),
		searchParentId: $('#searchParentIdDel').val()
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
//编辑
function editCatetoryDel(){
	var row = $('#catetory-deleted').datagrid('getSelected');
	if (row){
		$('#catetory-deleted-dlg').dialog('open').dialog('setTitle','编辑栏目');
		$('#catetory-deleted-fm').form('load',row);
		url = '<%=basePath%>admin/catetory/update.action?catetoryId='+row.catetoryId;
	}else{
		showInfo("请选择一行数据!");
	}
}
//保存
function saveCatetoryDel(){
	$('#catetory-deleted-fm').form('submit',{
		url: url,
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(date){
			var date = eval('('+date+')');
			if (date.result == 'error'){
				showInfo("操作失败!");
			} else {
				$('#catetory-deleted-dlg').dialog('close');	
				showInfo("操作成功!");
				$('#catetory-deleted').datagrid('reload');	
			}
		}
	});
}
//彻底删除
function completeDel(){
	var row = $('#catetory-deleted').datagrid('getSelected');
	if (row){
		$.messager.confirm('彻底删除栏目','确定彻底删除该栏目？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/catetory/completeDel.action',
					{catetoryId:row.catetoryId},
					function(date){
						if (date.result == 'success'){
							$('#catetory-deleted').datagrid('reload');	
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
//彻底批量删除
function batchDesCatetoryDel() {
    var selRow = $("#catetory-deleted").datagrid('getSelections');
    if (selRow.length == 0) {
        showInfo("请至少选择一行数据!");
        return false;
    }
    var ids = [];
    for (var i = 0; i < selRow.length; i++) {
        var id = selRow[i].id;
        ids.push(id); //把单个id循环放到ids的数组中  
    }
    $.messager.confirm('删除栏目', '确认删除这些栏目?', function(r) {
        if (r) {
            $.ajax({
                url : '<%=basePath%>admin/catetory/batchDel.action',
                dataType : 'json',
                type : 'post',
                data : {
                    catetoryIds : ids
                },
                success : function(data) {
                    showInfo('删除成功!');
                    $('#catetory-deleted').datagrid('reload');	
                },
                error : function(data) {
                    showInfo('删除失败!');
                }
            });
        }
    });
}
//提示框
function  showInfo(msgStr){
	$.messager.show({
		title: '提示',
		msg: msgStr,
		timeout : 3000,
        showType : 'slide'
	});
}
//还原
function repealDel(){
	var row = $('#catetory-deleted').datagrid('getSelected');
	if (row){
		$.messager.confirm('还原栏目','确定还原该栏目？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/catetory/repealDel.action',
					{catetoryId:row.catetoryId},
					function(date){
						if (date.result == 'success'){
							$('#catetory-deleted').datagrid('reload');	
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
</script>
