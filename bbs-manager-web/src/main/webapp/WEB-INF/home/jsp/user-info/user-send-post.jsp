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
    <h2><span>您现在的位置: <a href="user-info.html">个人信息</a>>>我要发帖</span>我要发帖</h2>
    <article>
      <div class="wdxx">
        <div class="notebook" style="width:740px">   
          <form method="post" >
              <table width="100%">
                <tr>
                  <td class="table-td-right" width="20%">标题：</td>
                  <td class="table-td-left">
                    <input name="name" type="text" id="name" class="isreadonly" value="admin">
                    <label class="show-required"></label>
                  </td>
                </tr>
                <tr>
                  <td class="table-td-right">所属栏目：</td>
                  <td class="table-td-left">
                    <select>
                      <option>--请选择--</option>
                      <option>失物招领</option>
                      <option>学习交流</option>
                      <option>生活娱乐</option>
                      <option>买卖交易</option>
                    </select>
                    <label class="show-required"></label>
                  </td>
                </tr>
                <tr>
                  <td class="table-td-right">图片：</td>
                  <td class="table-td-left">
                    <input type="file" name="pic">
                  </td>
                </tr>
                <tr>
                    <td class="table-td-right">内容：</td>
                    <td class="table-td-left">
                      <textarea name="lytext" cols="60" rows="12"></textarea>
                      <label class="show-required"></label>
                    </td>
                  </tr>
                <tr>
                  <td></td>
                  <td class="table-td-left">
                      <input type="submit" value="发布" class="btn" style="width:50px">
                      <input type="reset" value="重置" class="btn" style="width:50px">
                    </div>
                  </td>
                </tr>
              </table>
          </form>
        </div>
      </div>
    </article>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>home/js/jquery-1.11.0.js"></script>
<script>
  $(function(){
    // 栏目标志
    $("#grxx-wyft a").css("color","white");
    $("#grxx-wyft").css("background","rgb(81, 164, 231)");
    $(".show-required").hide();
    // 导航标志
    $("#grxx").attr('id',"nav_current");

    $(".show-required").text("*（必填）");
    $(".show-required").css("color","red").show();
   
  });
</script>
<!-- 尾部 -->
<jsp:include page="../footer.jsp"></jsp:include>
</body>
