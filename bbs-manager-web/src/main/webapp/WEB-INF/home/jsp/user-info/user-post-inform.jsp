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
<jsp:include page="../header.jsp"></jsp:include>
<!--主体-->
<div class="contain">
  <!-- 栏目导航 -->
  <jsp:include page="user-info-menu.jsp"></jsp:include>
  <div class="listr right">
    <h2><span>您现在的位置: <a href="user-info.html">个人信息</a>>>评论通知</span>评论通知</h2>
    <!-- 评论列表 -->
    <jsp:include page="user-post-inform-list.jsp"></jsp:include>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    // 栏目标志
    $("#grxx-pltz a").css("color","white");
    $("#grxx-pltz").css("background","rgb(81, 164, 231)");

    $("#show-from").hide();
    $(".show-required").hide();
    $(".isreadonly").attr('readonly',"readony");
    $("#grxx").attr('id',"nav_current");
    $("#to-update-user-info").click(function(){
      $(".isreadonly").removeAttr("readonly");
      $("#to-update-user-info").hide();
      $("#show-from").show();
      $(".show-required").show();
      $(".show-required").text("*（必填）");
      $(".show-required").css("color","red");
    });
    $("#cancle-update-user-info").click(function(){
      $(".isreadonly").attr('readonly',"readony");
      $("#to-update-user-info").show();
      $("#show-from").hide();
    });
  });

  var  highlightcolor='#eafcd5';
  var  clickcolor='#51b2f6';
  function  changeto(){
    source=event.srcElement;
    if  (source.tagName=="TR"||source.tagName=="TABLE")
    return;
    while(source.tagName!="TD")
    source=source.parentElement;
    source=source.parentElement;
    cs  =  source.children;
    if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
    for(i=0;i<cs.length;i++){
      cs[i].style.backgroundColor=highlightcolor;
    }
  }

  function  changeback(){
    if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
    return
    if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
    for(i=0;i<cs.length;i++){
      cs[i].style.backgroundColor="";
    }
  }
</script>
<!-- 尾部 -->
<jsp:include page="../footer.jsp"></jsp:include>
</body>
