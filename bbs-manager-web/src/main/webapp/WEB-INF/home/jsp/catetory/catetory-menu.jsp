<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="listl left">
  <h2>栏目导航</h2>
  <ul>
    <c:forEach items="${catetoryInfoList}" var="catetoryInfo">
    	 <li id="${catetoryInfo.catetoryId}"><a href="#">${catetoryInfo.catetoryName}</a></li>
	</c:forEach>
  </ul>
</div>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
	// 栏目标志
	var str = "#"+${catetoryId};
	var strAndA = "#"+${catetoryId}+" a";
    $(strAndA).css("color","white");
    $(str).css("background","rgb(81, 164, 231)");
  });
</script>