<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/11/25
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">

  <title>My JSP 'index.jsp' starting page</title>
</head>

<body>
<form action="<%=basePath%>servlet/UserLoginServlet" method="post" >
  <table border="1px" width="438px"   >
    <tr align="center">
      <td>用户名</td>
      <td>
        <input type="text" name="username" >
      </td>
    </tr>
    <tr align="center">
      <td>密码</td>
      <td>
        <input type="password" name="password" >
      </td>
    </tr>
    <tr align="center">
      <td colspan="2" >
        <input type="submit" value="用户登录" >
        <input type="reset" value="重置内容" >
      </td>
    </tr>
  </table>
</form>
</body>
</html>
