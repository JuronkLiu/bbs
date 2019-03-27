<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="page">
   	<a title="Total record"><b>共${pageInfo.pages}页</b></a>
   	<b style="width:50px">${pageInfo.pageNum}</b>
   	<c:if test="${pageInfo.pageNum == 1 && pageInfo.pages > 1}">
		<a style="cursor: pointer" href="<%=basePath%>home/post/postList.action?currentPage=${pageInfo.nextPage}&catetoryId=${catetoryId}">下一页</a>
		<a style="cursor: pointer" href="<%=basePath%>home/post/postList.action?currentPage=${pageInfo.pages}&catetoryId=${catetoryId}">尾页</a>
	</c:if>
	<c:if test="${pageInfo.pageNum > 1 && pageInfo.pageNum < pageInfo.pages}">
		<a style="cursor: pointer;" href="<%=basePath%>home/post/postList.action?currentPage=1&catetoryId=${catetoryId}">首页</a>
		<a style="cursor: pointer" href="<%=basePath%>home/post/postList.action?currentPage=${pageInfo.prePage}&catetoryId=${catetoryId}">上一页</a>
		<a style="cursor: pointer" href="<%=basePath%>home/post/postList.action?currentPage=${pageInfo.nextPage}&catetoryId=${catetoryId}">下一页</a>
		<a style="cursor: pointer" href="<%=basePath%>home/post/postList.action?currentPage=${pageInfo.pages}&catetoryId=${catetoryId}">尾页</a>
	</c:if>
	<c:if test="${pageInfo.pageNum == pageInfo.pages && pageInfo.pages > 1}">
		<a style="cursor: pointer;" href="<%=basePath%>home/post/postList.action?currentPage=1&catetoryId=${catetoryId}">首页</a>
		<a style="cursor: pointer" href="<%=basePath%>home/post/postList.action?currentPage=${pageInfo.prePage}&catetoryId=${catetoryId}">上一页</a>
	</c:if>
</div>
