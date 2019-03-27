<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="user-deleted" title="已删除用户列表" class="easyui-datagrid"
		url="<%=basePath%>admin/user/delList.action" fit="true" pageSize="30"
		toolbar="#user-deleted-toolbar" pagination="true" collapsible="true"
		rownumbers="false" fitColumns="true" singleSelect="true">
	<thead>
		<tr>
			<th field="userId" width="30" align="center">用户编号</th>
            <th field="userNo" width="30" align="center">学号</th>
            <th field="userNickName" width="50" align="center">昵称</th>
            <th field="userRealName" width="50" align="center">真实姓名</th>
            <th field="userPassword" width="50" align="center">密码</th>
            <th field="userSex" width="50" align="center">性别</th>
            <th field="userTelephone" width="50" align="center">电话</th>
            <th field="userEmail" width="50" align="center">Email</th>
            <th field="userSchool" width="50" align="center">学校</th>
            <th field="createDate" width="50" align="center" formatter="dataFormatter">创建时间</th>
            <th field="updateDate" width="50" align="center" formatter="dataFormatter">更新时间</th>
            <th field="warnTime" width="30" align="center">警告次数</th>
            <th field="userComment" width="30" align="center">说明</th>
		</tr>
	</thead>
</table>
<div id="user-deleted-toolbar" style="height:80px">
	用户编号:<input id="searchUserId" type="text" /> 
	学号:<input id="searchUserNo" type="text" /> 
	昵称:<input id="searchUserNickName" type="text" />
	真实姓名:<input id="searchUserRealName" type="text" />  <br>
	所属学校:<input id="searchUserSchool" type="text" /> 
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="searchUserDel()">搜索</a> <br>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUserDel()">编辑</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-back" plain="true" onclick="recoverUserDel()">还原</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" plain="true" onclick="completeUserDel()">彻底删除</a>
</div>

<div id="user-deleted-dlg" class="easyui-dialog" style="width: 400px; height: 300px; padding: 10px 20px"
    closed="true" buttons="#user-deleted-dlg-buttons" shadow="false">
    <form id="user-deleted-fm" method="post">
        <div class="fitem">
            <label>学号:</label> 
            <input id="userNo" name="userNo" class="easyui-validatebox" required="true"/>
        </div>
        <div class="fitem">
            <label>昵称:</label> 
            <input id="userNickName" name="userNickName" class="easyui-validatebox" required="true" />
        </div>
        <div class="fitem">
            <label>真实姓名:</label> 
            <input id="userRealName" name="userRealName" class="easyui-validatebox" required="true" />
        </div>
        <div class="fitem">
            <label>密码:</label> 
            <input id="userPassword" name="userPassword" type="password" class="easyui-validatebox" required="true" />
        </div>
        <div class="fitem">
            <label>确认密码:</label> 
            <input id="reUserPassword" name="reUserPassword" type="password" class="easyui-validatebox" required="true" />
        </div>
        <div class="fitem">
            <label>性别:</label> 
            <input type="radio" name="userSex" checked="checked" value="男"/>男
            <input type="radio" name="userSex" value="女"/>女
        </div>
        <div class="fitem">
            <label>电话:</label> 
            <input id="userTelephone" name="userTelephone" class="easyui-validatebox" required="true" />
        </div>
        <div class="fitem">
            <label>Email:</label> 
            <input id="userEmail" name="userEmail" type="email" class="easyui-validatebox" required="true" />
        </div>
        <div class="fitem">
            <label>学校:</label> 
            <input id="userSchool" name="userSchool" class="easyui-validatebox" required="true" />
        </div>
        
    </form>
</div>
<div id="user-deleted-dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUserDel()">确定</a> 
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#user-deleted-dlg').dialog('close')">取消</a>
</div>
<script type="text/javascript">
function searchUserDel(){
	$('#user-deleted').datagrid('load',{
		searchUserId: $('#searchUserId').val(),
		searchUserNo: $('#searchUserNo').val(),
		searchUserNickName: $('#searchUserNickName').val(),
		searchUserRealName: $('#searchUserRealName').val(),
		searchUserSchool: $('#searchUserSchool').val()
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

function editUserDel(){
	var row = $('#user-deleted').datagrid('getSelected');
	if (row){
		$('#user-deleted-dlg').dialog('open').dialog('setTitle','编辑用户');
		$('#user-deleted-fm').form('load',row);
		url = '<%=basePath%>admin/user/update.action?userId='+row.userId;
	}else{
		showInfo("请选择一行数据!");
	}
}
function saveUserDel(){
	$('#user-deleted-fm').form('submit',{
		url: url,
		onSubmit: function(){
			return $(this).form('validate');
		},
		success: function(date){
			var date = eval('('+date+')');
			if (date.result == 'error'){
				showInfo("操作失败!");
			} else {
				$('#user-deleted-dlg').dialog('close');	
				showInfo("操作成功!");
				$('#user-deleted').datagrid('reload');	
			}
		}
	});
}
function completeUserDel(){
	var row = $('#user-deleted').datagrid('getSelected');
	if (row){
		$.messager.confirm('删除用户','确定删除？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/user/completeDel.action',
					{userId:row.userId},
					function(date){
						if (date.result == 'success'){
							$('#user-deleted').datagrid('reload');	
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
function batchDesUserDel() {
    var selRow = $("#user-deleted").datagrid('getSelections');
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
                url : '<%=basePath%>admin/user/batchDel.action',
                dataType : 'json',
                type : 'post',
                data : {
                    userIds : ids
                },
                success : function(data) {
                    showInfo('删除成功!');
                    $('#user-deleted').datagrid('reload');	
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
//撤销警告
function recoverUserDel(){
	var row = $('#user-deleted').datagrid('getSelected');
	if (row){
		$.messager.confirm('还原用户','确定还原该用户？',function(r){
			if (r){
				$.post(
					'<%=basePath%>admin/user/recover.action',
					{userId:row.userId},
					function(date){
						if (date.result == 'success'){
							$('#user-deleted').datagrid('reload');	
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