<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<footer>
    <div class="footnav">
    <ul>
        <li><a href="<%=basePath%>home/jsp/index.jsp">网站首页</a></li>
        <li><a href="<%=basePath%>home/jsp/catetory/catetory-show.jsp">栏目展示</a></li>
        <li><a href="<%=basePath%>home/jsp/user-info/user-info.jsp">个人信息</a></li>
        <li><a href="<%=basePath%>home/jsp/system-inform/system-inform.jsp">系统通知</a></li>
        <li><a href="<%=basePath%>home/jsp/suggest-feedback.jsp">建议与反馈</a></li>
    </ul>
    </div>
    <div class="copyright">
        <p>Copyright  2019 All Rights Reserved 版权所有 哈尔滨商业大学 计算机与信息技术学院 计算机科学与技术3班 刘志荣</p> 
        <p>地址：黑龙江省哈尔滨市江北区学海街1号 联系电话：131-6892-8783</p>
    </div>
</footer>
