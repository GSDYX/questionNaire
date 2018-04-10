<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/2
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<c:url value='/login'/>" method="post">
    <input type="text" name="username" value="a">
    <input type="text" name="userpwd" value="a">
    <input type="submit" value="提交">
</form>
</body>
</html>
