<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/12
  Time: 12:48
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
    <div class="col-md-4 col-md-offset-2">
        <button type="button" class="btn btn-danger">
            <a href="<c:url value='/userManager'/>" style="color: white">用户管理</a>
        </button>
    </div>
    <div class="col-md-4 col-md-offset-2" >
        <button type="button" class="btn btn-danger">
            <a href="<c:url value='/qnManagerJump'/>" style="color: white">问卷管理</a>
        </button>
    </div>
</div>


</body>
</html>
