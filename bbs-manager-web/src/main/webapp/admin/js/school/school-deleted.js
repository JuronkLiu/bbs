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