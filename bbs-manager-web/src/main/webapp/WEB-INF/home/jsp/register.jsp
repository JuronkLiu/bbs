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
    <h2><span class="location">当前位置：注册</span>注册</h2>
 <div class="notebook">   
      <form action="reg.action" method="post">
    <div class="gbook left">
     <ul>
       <li>学号：</li>
       <li>昵称：</li>
       <li>姓名：</li>
       <li>性别：</li>
       <li>学校：</li>
       <li>邮箱：</li>
       <li>手机：</li>
       <li>密码：</li>
       <li>确认密码：</li>
       <li class="bookbtn"></li>
     </ul>
    </div>
    <div class="gform left">
    <ul>
     <li><input name="userNo" type="text" id="userNo" required="required"><span>*（必填）</span></li>
     <li><input name=userNickName type="text" id="userNickName" required="required"><span>*（必填）</span></li>
     <li><input name="userRealName" type="text" id="userRealName" required="required"><span>*（必填）</span></li>
     <li>
       <input name="userSex" type="radio" value="男" checked="checked">&nbsp;男&nbsp;&nbsp;&nbsp;&nbsp;
       <input name="userSex" type="radio" value="女">&nbsp;女
      </li>
     <li><input name="userSchool" type="text" id="userSchool" required="required"><span>*（必填）</span></li>
     <li><input name="userEmail" type="text" id="userEmail" required="required"><span>*（必填）</span></li>
     <li><input name="userTelephone" type="text" id="userTelephone" required="required"><span>*（必填）</span></li>
     <li><input name="userPassword" type="text" id="userPassword" required="required"><span>*（必填）</span></li>
     <li><input type="text" id="userRepassword" required="required"><span>*（必填）</span></li>
     <li class="bookbtn">
       <input type="submit" value="注册" class="btn">
       <input type="reset" value="重置" class="btn btnrest">
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
    $("#to-register").attr('id',"nav_current");
  });
</script>
<!-- 尾部 -->
<jsp:include page="footer.jsp"></jsp:include>
</body>
