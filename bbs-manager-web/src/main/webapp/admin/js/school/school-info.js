function searchSchool(){
	$('#school-info').datagrid('load',{
		searchSchoolId: $('#searchSchoolId').val(),
		searchSchoolName: $('#searchSchoolName').val(),
		searchSchoolArea: $('#searchSchoolArea').val()
	});
}
function dataFormatter(value,row,index){
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