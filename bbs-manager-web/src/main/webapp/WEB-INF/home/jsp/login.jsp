<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
<jsp:include page="header.jsp"></jsp:include>
<!--主体-->
<article>
  <div class="tsjb">
    <h2><span class="location">当前位置：登录</span>登录</h2>
 <div class="notebook">   
      <form action="login.action" method="post">
    <div class="gbook left">
     <ul>
       <li>昵称/手机/邮箱：</li>
       <li>密码：</li>
       <li class="bookbtn"></li>
     </ul>
    </div>
    <div class="gform left">
    <ul>
     <li><input name="namePhoneEmail" type="text" id="namePhoneEmail" required="required"><span>*（必填）</span></li>
     <li><input name="userPassword" type="password" id="userPassword" required="required"><span>*（必填）</span></li>
     <li class="bookbtn">
       <input type="submit" name="submit" value="登录" class="btn">
       <input type="reset" name="reset" value="重置" class="btn btnrest">
      </li>
    </ul>
    </div>
    </form>
    </div>
  </div>
</article>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    $("#to-login").attr('id',"nav_current");
  });
</script>
<!-- 尾部 -->
<jsp:include page="footer.jsp"></jsp:include>
</body>
