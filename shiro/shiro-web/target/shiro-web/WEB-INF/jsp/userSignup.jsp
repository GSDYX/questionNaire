<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/6
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
    <script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
</head>
<body>

<div class="row">
    <div class="col-md-4 col-md-offset-5"><h1>用户注册</h1></div>
</div>
<hr>

<form action="<c:url value='/userSignup'/>" method="post">
    <div class="row row-margin-top" >
        <div class="col-md-3 col-md-offset-4" >
            <div class="input-group">
                <span class="input-group-addon">用户名</span>
                <input type="text" class="form-control inputClass" name="username" placeholder="Username" aria-describedby="basic-addon1">
            </div>
        </div>
    </div>
    <div class="row row-margin-top" style="margin-top: 5px">
        <div class="col-md-3 col-md-offset-4" >
            <div class="input-group">
                <span class="input-group-addon">&nbsp;密&nbsp;码&nbsp; </span>
                <input type="text" class="form-control inputClass" name="password" placeholder="Password" aria-describedby="basic-addon1">
            </div>
        </div>
    </div>

    <div class="row row-margin-top">
        <div class="col-md-3 col-md-offset-6" style="margin-top: 5px" >
            <button type="submit" class="btn btn-default">注册</button>
        </div>
    </div>
    <div class="row row-margin-top" >
        <div class="col-md-2 col-md-offset-4" style="margin-top: 5px" >
            <c:if test="${not empty exception}">
                <div class="alert alert-danger" role="alert">${exception}</div>
            </c:if>
        </div>
    </div>

</form>

</body>
</html>
