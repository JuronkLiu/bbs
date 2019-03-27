<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<table id="system-info"></table>  
<script>
$('#system-info').datagrid({   
   url:'datagrid_data.json',   
   columns:[[   
       {field:'code',title:'id',width:100},
       {field:'name',title:'姓名',width:100},
       {field:'price',title:'年龄',width:100,align:'right'}
   ]]   
}); 
</script>
