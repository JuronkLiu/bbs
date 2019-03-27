<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
 	<meta charset="UTF-8">
    <title>大学生校内管理系统</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>admin/jquery-easyui-1.2.6/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>admin/jquery-easyui-1.2.6/themes/icon.css">
	<script type="text/javascript" src="<%=basePath%>admin/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>admin/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>admin/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">
    
	</script>
  </head>
    <body class="easyui-layout">  <!-- background:url(<=basePath>admin/images/admin_logo.png);  -->
        <div region="north" style="height:80px;background-repeat:no-repeat;background-color:#E4EDFE" ></div>  
        <div region="west" title="菜单" style="width:180px;" href="<%=basePath%>admin/showPage.action?page=menu"></div>  
        <div region="center" style="padding:5px;background:#eee;" href="<%=basePath%>admin/showPage.action?page=main"></div>  
    </body> 
</html>

