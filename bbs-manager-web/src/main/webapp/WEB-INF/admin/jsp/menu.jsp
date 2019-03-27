<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<style>
	button{
		background: none;
		border:none;
	}
</style>

<div id="aa" class="easyui-accordion"  fit="true">  
  <div title="用户管理" iconCls="icon-folder_open" style="padding:10px;">  
 	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('用户信息','user/user-info');">用户信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('用户警告','user/user-warn');">用户警告</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('黑名单','user/user-blacklist');">黑名单</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('已删除用户','user/user-deleted');">已删除用户</button><br>
  </div>

 <div title="院校管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('院校信息','school/school-info');">院校信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('已删除院校','school/school-deleted');">已删除院校</button><br>
 </div>
 <div title="栏目管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('栏目信息','catetory/catetory-info');">栏目信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('下栏信息','catetory/catetory-down');">下栏信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('已删除栏目','catetory/catetory-deleted');">已删除栏目</button><br>
 </div>
 <div title="帖子管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('帖子信息','post/post-info');">帖子信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('已删除帖子','post/post-deleted');">已删除帖子</button><br>
 </div>
 <div title="评论管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('评论信息','discuss/discuss-info');">评论信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('已删除评论','discuss/discuss-deleted');">已删除评论</button><br>
 </div>
 <div title="回复管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('回复信息','revert/revert-info');">回复信息</button><br>
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('已删除回复','revert/revert-deleted');">已删除回复</button><br>
 </div>
 <div title="举报管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('举报信息','report/report-info');">举报信息</button><br>
 </div>
 <div title="系统管理" iconCls="icon-folder_open" style="padding:10px;">  
   	<img src="<%=basePath%>admin/images/file.gif" >&nbsp;
   	<button onclick="addTab('系统信息','system/system-info');">系统信息</button><br>
 </div>  
</div>

<script>
   	function addTab(title,url){
   		if($("#main").tabs("getTab",title)){
   			$("#main").tabs("select",title);
   		}else{
			$("#main").tabs("add",{
				title:title,
				href:'<%=basePath%>admin/showPage.action?page='+url,
				closable:true
			});
   		}
   	}
</script>

