<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<header>
    <div class="headtop">
        <div class="timer box">
        <span>
            欢迎：xxx，<a href="#">退出</a> | <a href="<%=basePath%>home/jsp/login.jsp">请登录</a> 
        </span>
        <script type="text/javascript" src="<%=basePath%>home/js/timer.js"></script>
        </div>
    </div>
    <div class="logo box"></div>
    <nav id="nav" class="box">
        <ul>
        <li><a href="<%=basePath%>home/index.action" id="wzsy">网站首页</a></li>
        <li><a href="<%=basePath%>home/post/postList.action?currentPage=1&catetoryId=1" id="lmzs">栏目展示</a></li>
        <li><a href="<%=basePath%>home/user/index.action" id="grxx">个人信息</a></li>
        <li><a href="<%=basePath%>home/system/index.action" id="xttz">系统通知</a></li>
        <li><a href="<%=basePath%>home/suggest/index.action" id="jyfk">建议与反馈</a></li>
        <li><a href="<%=basePath%>home/user/toLogin.action" id="to-login">登录</a></li>
        <li><a href="<%=basePath%>home/user/toRegister.action" id="to-register">注册</a></li>
        </ul>
    </nav>
</header>
