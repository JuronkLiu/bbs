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
    <h2><span class="location">当前位置：建议与反馈</span>建议与反馈</h2>
 <div class="notebook">   
      <form action="#" method="post" name="form1" id="form1">
    <div class="gbook left">
     <ul>
       <li>您的姓名：</li>
       <li>联系邮箱：</li>
       <li>联系电话：</li>
       <li class="bookarea">建议或反馈内容：</li>
       <li class="bookbtn"></li>
     </ul>
    </div>
    <div class="gform left">
    <ul>
     <li><input name="name" type="text" id="name"><span>*（必填）</span></li>
     <li><input name="email" type="text" id="email"><span>*（必填）</span></li>
     <li><input name="mycall" type="text" id="mycall"></li>
     <li class="bookare"><textarea name="lytext" cols="60" rows="12" id="lytext"></textarea></li>
     <li class="bookbtn">
       <input type="submit" name="Submit3" value="提交" class="btn">
       <input type="reset" name="Submit22" value="重置" class="btn btnrest">
       <input name="enews" type="hidden" id="enews" value="AddGbook">
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
    $("#jyfk").attr('id',"nav_current");
  });
</script>
<!-- 尾部 -->
<jsp:include page="footer.jsp"></jsp:include>
</body>
