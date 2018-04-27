<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/3
  Time: 17:07
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
<h1>欢迎您</h1>
${message}

<a href="<c:url value='/myQnJump'/>">我的问卷</a>
</body>
</html>
