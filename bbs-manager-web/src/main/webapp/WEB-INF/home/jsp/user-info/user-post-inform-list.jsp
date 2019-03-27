<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<article width="100%">
   <div>
     <div class="notebook" style="width:740px">   
       <form method="post" >
         <table onmouseover="changeto()"  onmouseout="changeback()" width="100%">
           <tr height="18">
             <td width="6%">
                 <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
             </td>
             <td width="60%" >标题</td>
             <td width="10%">发帖时间</td>
             <td width="30%">操作</td>
           </tr>
           <tr height="18" style="background:#FFFFFF">
             <td>
                 <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
             </td>
             <td>1</td>
             <td>1</td>
             <td>
               <img src="<%=basePath%>home/images/show.gif" width="9" height="9" />
               <span>[</span><a href="user-post-inform-detail.jsp">查看</a><span>]</span>
               <img src="<%=basePath%>home/images/delete.gif" width="9" height="9" />
               <span>[</span><a href="#">删除</a><span>]</span>
             </td>
           </tr>
         </table>
       </form>
     </div>
   </div>
 </article>