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
    <link href="<c:url value='/css/bootstrap.min.css'/> " rel="stylesheet">
    <script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
</head>
<body>

<div class="col-md-3 col-md-offset-4">
<h1>密码修改</h1>
</div>
<%--根据session获取用户名--%>
<form action="<c:url value='/userAlterPwd'/>" method="post">
    <div class="row row-margin-top">
        <div class="col-md-3 col-md-offset-4">
            <div class="input-group">
                <span class="input-group-addon">密码</span>
                <input type="text" class="form-control" name="password" placeholder="Password"
                       aria-describedby="basic-addon1">
            </div>
        </div>
    </div>
    <div class="row row-margin-top">
        <div class="col-md-3 col-md-offset-6" style="margin-top: 5px" >
            <button type="submit" class="btn btn-default">确认修改</button>
        </div>
    </div>
</form>

</body>
</html>
