<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">  
    <title>用户信息</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 
	<link rel="stylesheet" type="text/css" href="styles.css"> 
	-->

  </head>
  
  <body bgcolor="#C8D2FF">

    Hello ${loginUser.username} ，您是第${loginRank}位访问者，在您前边的访问者是   ：
 
    <hr>
   
    <center>
                    
        <table cellpadding="5" cellspacing="0" table border="1">
        <tr  width="300"><td>名字</td><td width="300">访问时间</td>
        </tr>
        <c:forEach items="${allUser}" var="user">
        <tr bgcolor=><td>${user.username}</td><td>${user.time}</td>
        </tr>      
		</c:forEach>
		
         </table>
               
    </center>
    <hr>
     
  </body>
</html>
