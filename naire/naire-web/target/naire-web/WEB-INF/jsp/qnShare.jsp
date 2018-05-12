<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/5/6
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value='/css/bootstrap.min.css'/> " rel="stylesheet">
    <script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
</head>
<body>

<div class="row">
    <div class="col-md-8">
        <h1>问卷名<small>${nairename}</small></h1>
    </div>
</div>

<br>
<div class="row">
    <div class="col-md-8">
        <h1>问卷链接为<small>localhost:8080<c:url value="${link}"/></small></h1>
    </div>
</div>

</body>
</html>
