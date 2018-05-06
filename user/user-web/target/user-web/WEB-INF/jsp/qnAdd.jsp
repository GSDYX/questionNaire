<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/5/6
  Time: 19:19
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
        <table class="table table-bordered">

            <c:forEach items="${naireListAll}" var="item">
                <tr>
                    <td>${item.nairename}</td>
                    <td><a href="/naire/qnAdd?naireid=${item.naireid}&userid=${userid}">添加</a> </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>


</body>
</html>
