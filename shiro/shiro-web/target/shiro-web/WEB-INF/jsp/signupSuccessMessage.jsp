<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/6
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<div class="page-header" style="margin: auto">
    <h1>${message}<small>3秒后返回主页</small></h1>
</div>

<button class="btn btn-default" type="submit">
    <a href="/">点击返回主页</a>
</button>

<%
    //转向语句
    response.setHeader("Refresh", "3;URL=/");
%>
</body>
</html>
