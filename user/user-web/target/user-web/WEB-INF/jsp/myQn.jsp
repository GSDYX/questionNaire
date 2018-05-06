<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/27
  Time: 10:12
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
    <div class="col-md-4 col-md-offset-4">
        <h1 style="text-align:center">我的问卷</h1>
        <hr style="height:1px;background-color:#000;">
    </div>
</div>
<div class="row">
    <div class="col-md-8 col-md-offset-2">
        <table class="table table-bordered">

            <c:forEach items="${userCustom.naires}" var="item">
                <tr>
                    <td><a href="/naire${item.naireadderss}">${item.nairename}</a> </td>
                    <td><a href="/naire/qnDelect?naireid=${item.naireid}&userid=${userCustom.user.userid}">删除问卷</a></td>
                    <td><a href="/naire/qnShare?naireadderss=${item.naireadderss}&nairename=${item.nairename}">分享问卷</a></td>
                    <td><a href="/naire/qnReport?nairename=${item.nairename}">生成问卷报告</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

<div class="row">
    <div class="col-md-4 col-md-offset-2">
        <button type="button" class="btn btn-default">
            <a href="<c:url value='/qnAddJump'/> ">添加问卷</a>
        </button>
    </div>
</div>




</body>
</html>
