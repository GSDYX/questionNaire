<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/2
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
    <script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
</head>
<body>

<div class="row">
    <div class="col-md-4 col-md-offset-5"><h1>用户登入</h1></div>
</div>
<hr>
${exception}
<form action="<c:url value='/login'/>" method="post">
<div class="row row-margin-top">
    <div class="col-md-3 col-md-offset-4" >
        <div class="input-group">
        <span class="input-group-addon">用户名</span>
        <input type="text" class="form-control" name="username" placeholder="Username" aria-describedby="basic-addon1">
        </div>
    </div>
</div>
<div class="row row-margin-top">
    <div class="col-md-3 col-md-offset-4" >
        <div class="input-group">
            <span class="input-group-addon">&nbsp;密&nbsp;码&nbsp; </span>
            <input type="text" class="form-control" name="password" placeholder="Password" aria-describedby="basic-addon1">
        </div>
    </div>
</div>
<div class="row row-margin-top">
    <div class="col-md-2 col-md-offset-4" >
        <div class="input-group">
            <span class="input-group-addon">验证码</span>
            <input type="text" class="form-control" name="randomcode" placeholder="validate" aria-describedby="basic-addon1">
        </div>
    </div>
    <div class="col-md-2">
        <img src="<c:url value='/validatecode.jsp'/>" alt="验证码显示错误" class="img-rounded">
    </div>
</div>
<div class="row row-margin-top">
    <div class="col-md-3 col-md-offset-6" >
        <button type="submit" class="btn btn-default">登入</button>
    </div>
</div>
</form>
</body>
</html>
