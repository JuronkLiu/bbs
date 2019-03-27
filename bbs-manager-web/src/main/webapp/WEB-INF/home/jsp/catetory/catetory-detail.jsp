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
    <h2><span>您现在的位置: <a href="/">栏目展示</a>>><a href="catetory-show.html">学校通知</a>>><a href="detail.html">大队开展“酒驾”整治措施有力效果明显</a>>>正文</span>帖子详情</h2>
    <ul>
      <p class="a_title">${postInfo.postTitle}</p>
      <p class="box_p">
      	<span>发布时间：<span><fmt:formatDate pattern="yyyy-MM-dd" value="${postInfo.createDate}"/></span></span>
      	<span>编辑：<a href="mailto:476847113@qq.com">杨青</a></span>
      	<span>来源：本站原创</span>
      	<span>点击：1297</span>
      	<span>点赞：1297</span></p>
      <ul class="a_content">
      	${postInfo.postContent}
      </ul>
    </ul>
    &nbsp;&nbsp;&nbsp;<button class="btn" id="to-revert">我要评论</button>
    &nbsp;&nbsp;<button class="btn" id="give-good">点赞</button>
    <div id="my-revert" style="display: none">
        <div class="gb_tit"><span class="tim">2012-08-27</span>我的评论</div>
        <div class="gb_con"><textarea cols="110" rows="5"></textarea>
        &nbsp;&nbsp;<button class="btn" style="width:60px" id="revert">提交</button>
        &nbsp;&nbsp;<button class="btn" style="width:60px" id="revert-cancel">取消</button></div>
    </div>
    <div id="gbooklist">
      <div class="gb_tit"><span class="tim">2012-08-27</span>xxx评论&nbsp;&nbsp;
        <button id="to-reply" class="btn" style="background: #CCCCCC; color: #0066FF;">我要回复</button>
      </div>
      <div class="gb_con">Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签</div>
      <div id="my-reply" class="gb_reply" style="display: none" ><span>我的回复：</span>
        <div class="gb_con"><textarea cols="120" rows="3"></textarea>
          &nbsp;&nbsp;<button class="btn" style="width:60px" id="reply">提交</button>
          &nbsp;&nbsp;<button class="btn" style="width:60px" id="reply-cancel">取消</button>
        </div>
      </div>
      <div class="gb_reply"><span>站长回复：</span>挺好用的s2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播放插件，标签Aspcms2.2.7中已经添加了视频功能，使用window的的播</div>  
    </div>
    

  </div>
  
</article>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    $("#lmzs").attr('id',"nav_current");
    $("#to-revert").click(function(){
      $("#my-revert").show();
    });

    $("#revert-cancel").click(function(){
      $("#my-revert").hide();
    });

    $("#to-reply").click(function(){
      $("#my-reply").show();
    });

    $("#reply-cancel").click(function(){
      $("#my-reply").hide();
    });

  });
</script>
<!-- 尾部 -->
<jsp:include page="../footer.jsp"></jsp:include>
</body>
