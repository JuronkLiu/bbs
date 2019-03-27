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
<article>
<div class="info_text">
    <h2><span>您现在的位置: <a href="user-info.jsp">个人信息</a>>><a href="user-post-inform.jsp">评论通知</a></span>评论通知详情</h2>
    <ul>
      <p class="a_title">帖子标题：<a href="user-my-post-detail.jsp">大队开展“酒驾”整治措施有力效果明显</a></p>
    </ul>
   
    <div id="gbooklist">
      <div class="gb_tit"><span class="tim">2012-08-27</span>xxx评论&nbsp;&nbsp;</div>
      <div class="gb_con">Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签</div>
      
      <div class="gb_reply"><span>站长回复：</span>挺好用的s2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播</div>  
    </div>
  </div>
  
</article>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    $("#grxx").attr('id',"nav_current");
  });
</script>
<!-- 尾部 -->
<jsp:include page="../footer.jsp"></jsp:include>
</body>
