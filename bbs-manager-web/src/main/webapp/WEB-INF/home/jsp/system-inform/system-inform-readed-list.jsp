<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<article width="100%">
   <div> 
     <div class="notebook" style="width:740px">   
       <form method="post" >
         <table onmouseover="changeto()"  onmouseout="changeback()" width="100%">
           <tr height="18">
             <td width="6%">
                 <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
             </td>
             <td width="50%" >标题</td>
             <td width="20%">时间</td>
             <td width="30%">操作</td>
           </tr>
           
           <tr height="18" style="background:#FFFFFF">
             <td>
                 <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
             </td>
             <td>1</td>
             <td><fmt:formatDate pattern="yyyy-MM-dd" value="<%=new Date()%>"/></td>
             <td>
               <img src="<%=basePath%>home/images/show.gif" width="9" height="9" />
               <span>[</span><a href="system-inform-detail.jsp">查看</a><span>]</span>
               <span class="list-readed" style="display: none">
	               <img src="<%=basePath%>home/images/delete.gif" width="9" height="9" />
	               <span>[</span><a href="#">删除</a><span>]</span>
               </span>
             </td>
           </tr>
           <tr height="18" style="background:#FFFFFF">
             <td>
                 <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
             </td>
             <td>1</td>
             <td><fmt:formatDate pattern="yyyy-MM-dd" value="<%=new Date()%>"/></td>
             <td>
               <img src="<%=basePath%>home/images/show.gif" width="9" height="9" />
               <span>[</span><a href="#">查看</a><span>]</span>
               <span class="list-readed" style="display: none">
	               <img src="<%=basePath%>home/images/delete.gif" width="9" height="9" />
	               <span>[</span><a href="#">删除</a><span>]</span>
               </span>
             </td>
           </tr>
           <tr height="18" style="background:#FFFFFF">
             <td>
                 <input name="checkbox" type="checkbox" class="STYLE2" value="checkbox" />
             </td>
             <td>1</td>
             <td><fmt:formatDate pattern="yyyy-MM-dd" value="<%=new Date()%>"/></td>
             <td>
               <img src="<%=basePath%>home/images/show.gif" width="9" height="9" />
               <span>[</span><a href="#">查看</a><span>]</span>
               <span class="list-readed" style="display: none">
	               <img src="<%=basePath%>home/images/delete.gif" width="9" height="9" />
	               <span>[</span><a href="#">删除</a><span>]</span>
               </span>
             </td>
           </tr>
         </table>
       </form>
     </div>
   </div>
 </article>