<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/11
  Time: 13:01
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
hello
<a href="<c:url value='/logout'/>">登出</a>
<a href="<c:url value='/createItem'/>">createItem</a>

</body>
</html>
