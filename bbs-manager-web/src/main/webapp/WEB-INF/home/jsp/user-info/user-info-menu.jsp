<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="listl left">
    <h2>个人信息</h2>
    <ul>
        <li id="grxx-wdxx"><a href="user-info.jsp" >我的信息</a></li>
        <li id="grxx-wdtz"><a href="user-my-post.jsp" >我的帖子</a></li>
        <li id="grxx-pltz"><a href="user-post-inform.jsp" >评论通知</a></li>
        <li id="grxx-hftz"><a href="user-revert-inform.jsp" >回复通知</a></li>
        <li id="grxx-wyft"><a href="user-send-post.jsp" >我要发帖</a></li>
    </ul>
</div>
