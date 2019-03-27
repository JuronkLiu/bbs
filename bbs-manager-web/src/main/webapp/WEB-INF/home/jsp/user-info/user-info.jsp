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
    <h2><span>您现在的位置: <a href="user-info.html">个人信息</a>>>我的信息</span>我的信息</h2>
    <article>
      <div class="wdxx">
        <div class="notebook" style="width:740px">   
          <form method="post" >
              <table width="500px">
                <tr>
                  <td class="table-td-right" width="30%">昵称：</td>
                  <td class="table-td-left"><input name="name" type="text" id="name" class="isreadonly" value="admin"></td>
                  <td width="30%" class="table-td-left"><label class="show-required"></label></td>
                </tr>
                <tr>
                  <td class="table-td-right">邮箱：</td>
                  <td class="table-td-left"><input name="name" type="text" id="name" class="isreadonly" value="admin"></td>
                  <td class="table-td-left"><label class="show-required"></label></td>
                </tr>
                <tr>
                  <td class="table-td-right">手机号：</td>
                  <td class="table-td-left"><input name="name" type="text" id="name" class="isreadonly" value="admin"></td>
                  <td class="table-td-left"><label class="show-required"></label></td>
                </tr>
                <tr>
                  <td></td>
                  <td colspan="2" class="table-td-left">
                    <label id="to-update-user-info" class="btn" style="color:white;">&nbsp;修改信息&nbsp;</label>
                    <div id="show-from">
                      <input type="submit" name="update" value="修改" class="btn" style="width:50px">
                      <input type="reset" name="reset" value="重置" class="btn" style="width:50px">
                      <button id="cancle-update-user-info" class="btn" style="width:50px">取消</button>
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
    $("#grxx-wdxx a").css("color","white");
    $("#grxx-wdxx").css("background","rgb(81, 164, 231)");
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
</script>
<!-- 尾部 -->
<jsp:include page="../footer.jsp"></jsp:include>
</body>
