<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="catetory-info" title="栏目信息列表" class="easyui-datagrid"
		url="<%=basePath%>admin/catetory/list.action" fit="true" pageSize="30"
		toolbar="#catetory-info-toolbar" pagination="true" collapsible="true"
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
<div id="catetory-info-toolbar" style="height:50px">
	栏目编号:<input id="searchCatetoryId" type="text" /> 
	栏目名称:<input id="searchCatetoryName" type="text" /> 
	所属父栏目:<input id="searchParentId" type="text" /> 
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchCatetory()">搜索</a> <br>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editCatetory()">编辑</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="delCatetory()">删除</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="downCatetory()">下栏</a>
</div>

<div id="catetory-info-dlg" class="easyui-dialog" style="width: 400px; height: 180px; padding: 10px 20px"
    closed="true" buttons="#catetory-info-dlg-buttons" shadow="false">
    <form id="catetory-info-fm" method="post">
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
<div id="catetory-info-dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveCatetory()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#catetory-info-dlg').dialog('close')">取消</a>
</div>
<script type="text/javascript">
//查询参数
function searchCatetory(){
	$('#catetory-info').datagrid('load',{
		searchCatetoryId: $('#searchCatetoryId').val(),
		searchCatetoryName: $('#searchCatetoryName').val(),
		searchParentId: $('#searchParentId').val()
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
function editCatetory(){
	var row = $('#catetory-info').datagrid('getSelected');
	if (row){
		$('#catetory-info-dlg').dialog('open').dialog('setTitle','编辑栏目');
		$('#catetory-info-fm').form('load',row);
		url = '<%=basePath%>admin/catetory/update.action?catetoryId='+row.catetoryId;
	}else{
		showInfo("请选择一行数据!");
	}
}
//保存
function saveCatetory(){
	$('#catetory-info-fm').form('submit',{
		url: url,
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(date){
			var date = eval('('+date+')');
			if (date.result == 'error'){
				showInfo("操作失败!");
			} else {
				$('#catetory-info-dlg').dialog('close');	
				showInfo("操作成功!");
				$('#catetory-info').datagrid('reload');	
			}
		}
	});
}
//删除
function delCatetory(){
	var row = $('#catetory-info').datagrid('getSelected');
	if (row){
		$.messager.confirm('删除栏目','确定删除该栏目？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/catetory/delete.action',
					{catetoryId:row.catetoryId},
					function(date){
						if (date.result == 'success'){
							$('#catetory-info').datagrid('reload');	
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
function batchDesCatetory() {
    var selRow = $("#catetory-info").datagrid('getSelections');
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
                url : '<%=basePath%>admin/catetory/batchDel.action',
                dataType : 'json',
                type : 'post',
                data : {
                    catetoryIds : ids
                },
                success : function(data) {
                    showInfo('删除成功!');
                    $('#catetory-info').datagrid('reload');	
                },
                error : function(data) {
                    showInfo('删除失败!');
                }
            });
        }
    });
}
//下栏
function downCatetory(){
	var row = $('#catetory-info').datagrid('getSelected');
	if (row){
		$.messager.confirm('下栏栏目','确定下栏该栏目？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/catetory/down.action',
					{catetoryId:row.catetoryId},
					function(date){
						if (date.result == 'success'){
							$('#catetory-info').datagrid('reload');	
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
//提示框
function  showInfo(msgStr){
	$.messager.show({
		title: '提示',
		msg: msgStr,
		timeout : 3000,
        showType : 'slide'
	});
}
</script>
