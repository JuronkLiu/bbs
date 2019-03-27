<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="listl left">
    <h2>系统通知</h2>
    <ul>
        <li id="xttz-zxtz"><a href="system-inform.jsp" >最新通知</a></li>
        <li id="xttz-wyl"><a href="system-inform-unread.jsp" >未阅览</a></li>
        <li id="xttz-yyl"><a href="system-inform-readed.jsp" >已阅览</a></li>
    </ul>
</div>
