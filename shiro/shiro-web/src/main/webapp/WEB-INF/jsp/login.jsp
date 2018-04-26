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
<%--${exception}--%>
<%--<form action="<c:url value='/login'/>" method="post">--%>
    <%--<input type="text" name="username" value="admin">--%>
    <%--<input type="text" name="password" value="admin">--%>
    <%--<input type="submit" value="提交">--%>
    <%--<TR>--%>
        <%--<TD>验证码：</TD>--%>
        <%--<TD><input id="randomcode" name="randomcode" size="8" /> <img id="randomcode_img" src="<c:url value='/validatecode.jsp'/>" alt="" width="56" height="20" align='absMiddle' />--%>

    <%--</TR>--%>
<%--</form>--%>
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
