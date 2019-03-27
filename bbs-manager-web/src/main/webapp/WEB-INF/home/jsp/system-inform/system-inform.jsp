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
    <jsp:include page="system-inform-left.jsp"></jsp:include>
  <div class="listr right">
    <h2><span>您现在的位置: <a href="system-inform.html">系统通知</a>>>最新通知</span>最新通知</h2>
    <article width="100%">
      <ul>
        <p class="a_title">大队开展“酒驾”整治措施有力效果明显</p>
        <p class="box_p"><span>发布时间：2012-4-6</span><span>编辑：<a href="mailto:476847113@qq.com">杨青</a></span><span>来源：本站原创</span><span>点击：1297</span><span>点赞：1297</span></p>
        <ul class="a_content">
          <p>为进一步扩大“酒驾”整治战果，始终保持对“酒驾”的高压态势，交警二大队按照上级公安部门的工作要求，突出整治效果，进一步强化整治措施，加大整治力度，扎实开展“酒驾”专项整治工作，有效打击和威慑了酒后驾驶违法行为。</p>
          <p>一是强化组织领导，加强技能培训。大队成立了以副大队长刘建国为组长、各中队负责人或业务骨干为成员的“酒驾”整治小分队，适时组织开展“酒驾”整治集中行动；同时，加强技能培训，提高民警查处“酒驾”的业务技能。5月9日，大队组织召开了“酒驾”整治工作部署会，对“酒驾”整治工作进行了动员部署，对查处“酒驾”进行了技能培训，并组织全体民警学习了《醉驾的办案流程》，一一进行了详细讲解，进一步提高了大队民警查处酒后驾驶违法行为的技能和能力。</p>
        </ul>
      </ul>
    </article>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    // 导航标志
    $("#xttz").attr('id',"nav_current");
    // 栏目标志
    $("#xttz-zxtz a").css("color","white");
    $("#xttz-zxtz").css("background","rgb(81, 164, 231)");
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
