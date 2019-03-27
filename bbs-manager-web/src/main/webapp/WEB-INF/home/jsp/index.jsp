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
</head>
<body>
<!-- 头部 -->
<jsp:include page="header.jsp"></jsp:include>
<!--主体-->
<div class="banner box"><img src="<%=basePath%>home/images/banner.png"></div>
<div class="box">
  <div class="news left">
    <h2><span class="more"><a href="#" target="_blank">更多..</a></span>最新帖子</h2>
    <ul>
      <div class="pic_news left"><img src="<%=basePath%>home/images/newspic.jpg"></div>
      <div class="center_news right">
        <section class="c_n_top">
          <h3>广安区卫计局开展“道德讲堂”活动</h3>
          <p>10月17日下午，广安区卫计局举办了以“助人为乐”为主题的“道德讲堂”活动。使全体干部职工再一次受到了心灵的洗礼....[<a href="detail.html" target="_blank">详情</a>]</p>
        </section>
        <ul>
          <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠<img src="<%=basePath%>home/images/new.gif"></a></li>
          <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动<img src="<%=basePath%>home/images/new.gif"></a></li>
          <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
          <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
          <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
        </ul>
      </div>
    </ul>
  </div>
  <div class="announce right">
    <h2><a href="#">帖子排行榜</a></h2>
    <ul>
     <marquee onmouseover="this.stop()" onmouseout="this.start()" scrollamount="2" direction="up" height="240">
      <li><a href="#" target="_blank">武陵区农林局执法人员正检查农产品来贸易争端 矛头直指</a></li>
      <li><a href="#" target="_blank">“秦台”农产品商标注册 </a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
      <li><a href="#" target="_blank">上海最大农产品批发市场开业海最大农产品批发市场开业贸易争端 矛头直指 </a></li>
      <li><a href="#" target="_blank">上海:最大农产品批发市场开业贸易争端 矛头直指 ...</a></li>
      <li><a href="#" target="_blank">多重屏障确保食品安全...</a></li>
      </marquee>
    </ul>
  </div>
  <div class="blank"></div>
  <div class="blank"></div>
  <div class="linews left">
    <h3><span><a href="#" class="more">更多..</a></span>医政中医</h3>
    <ul>
      <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠开业贸易争端 矛头直指</a></li>
      <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动</a></li>
      <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
      <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
      <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
    </ul>
  </div>
  <div class="linews left ln">
    <h3><span><a href="#" class="more">更多..</a></span>公共卫生</h3>
    <ul>
      <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠</a></li>
      <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动</a></li>
      <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
      <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
      <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
    </ul>
  </div>
  <div class="linews right">
    <h3><span><a href="#" class="more">更多..</a></span>疾病控制</h3>
    <ul>
      <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠</a></li>
      <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动</a></li>
      <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
      <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
      <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
    </ul>
  </div>
  <div class="blank"></div>
  <div class="linews left">
    <h3><span><a href="#" class="more">更多..</a></span>科教爱卫</h3>
    <ul>
      <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠</a></li>
      <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动</a></li>
      <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
      <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
      <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
    </ul>
  </div>
  <div class="linews left ln">
    <h3><span><a href="#" class="more">更多..</a></span>计划生育</h3>
    <ul>
      <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠</a></li>
      <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动</a></li>
      <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
      <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
      <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
    </ul>
  </div>
  <div class="linews right">
    <h3><span><a href="#" class="more">更多..</a></span>新农合工作</h3>
    <ul>
      <li><a href="#" target="_blank">广安区喜摘全市人口计生统计与信息岗位技能竞赛桂冠</a></li>
      <li><a href="#" target="_blank">广安区卫计局开展“道德讲堂”活动</a></li>
      <li><a href="#" target="_blank">广安区中医院开展“全国高血压日”义诊宣传活动</a></li>
      <li><a href="#" target="_blank">广安区“五心”做好孕前优生健康检查工作</a></li>
      <li><a href="#" target="_blank">广安区实施“五项工程”帮助计生家庭发家致富</a></li>
      <li><a href="#" target="_blank">美国挑起对华贸易争端 矛头直指</a></li>
    </ul>
  </div>
  <div class="blank"></div>
  <div class="links">
  <p>友情链接:</p>
  <ul>
  <li><a href="http://www.hrbcu.edu.cn/">哈尔滨商业大学官网</a></li>
    <li><a href="http://lib.hrbcu.edu.cn/">哈尔滨商业大学图书馆</a></li>   
    <li><a href="http://jwxsd.hrbcu.edu.cn/">哈尔滨商业大学教务处</a></li>
    <li><a href="http://jgzx.hrbcu.edu.cn/">哈尔滨商业大学经管综合实践中心</a></li>   
    <li><a href="http://sjjx.hrbcu.edu.cn/index.jsp">哈尔滨商业大学教学实验设备管理中心</a></li>
  </ul>
  <ul style="display:none">
      <a href="#"><img src="<%=basePath%>home/images/ad01.jpg"></a><a href="#"><img src="<%=basePath%>home/images/ad02.jpg"></a>
  </ul>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    $("#wzsy").attr('id',"nav_current");
  });
</script>
<!-- 尾部 -->
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>