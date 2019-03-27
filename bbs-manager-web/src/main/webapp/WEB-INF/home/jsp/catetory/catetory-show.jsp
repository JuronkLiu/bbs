<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>大学生校内论坛</title>
<meta name="Keywords" content="" >
<meta name="Description" content="" >
<link href="<%=basePath%>home/css/index.css" rel="stylesheet">
<link href="<%=basePath%>home/css/main.css" rel="stylesheet">
</head>
<body>
<!-- 头部 -->
<jsp:include page="../header.jsp"></jsp:include>
<!--主体-->
<div class="contain">
  <jsp:include page="catetory-menu.jsp"></jsp:include>
  <div class="listr right">
    <h2><span>您现在的位置: <a href="catetory-show.html">栏目展示</a>>>学校通知</span>学校通知</h2>
    <ul>
    	<c:forEach items="${pageInfo.list}" var="postInfo">
        	<li>
	        	<a href="<%=basePath%>home/post/showPost.action?postId=${postInfo.postId}">
	        		<span><fmt:formatDate pattern="yyyy-MM-dd" value="${postInfo.createDate}"/></span>${postInfo.postTitle} 
	        		<%-- <c:if test="${postInfo.postPic != null}"></c:if><b>[图]</b> --%>
	        	</a>
	        </li>
    	</c:forEach>
    </ul>
    <div class="blank"></div>
    <!-- 分页 -->
	<jsp:include page="../page.jsp"></jsp:include>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    $("#lmzs").attr('id',"nav_current");
  });
</script>
<!-- 尾部 -->
<jsp:include page="../footer.jsp"></jsp:include>
</body>
