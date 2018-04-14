<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/13
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Title</title>
    <link href="<c:url value='/css/bootstrap.min.css'/> " rel="stylesheet">
    <script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
</head>
<body>
<body>
<div style="text-align: center;">
    <table border="1">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">用户名</th>
            <th scope="col">密码</th>
        </tr>
        <c:forEach begin="0" step="1" items="${pageInfo.list}" var="list">
            <tr>

                <td>${list.userid}</td>
                <td>${list.username}</td>
                <td>${list.password}</td>
                <td><a href="#">封禁用户</a></td>
                <td><a href="#">删除用户</a></td>
            </tr>
        </c:forEach>
    </table>
    <%--<a href="userManager?pageNumber=${pageInfo.firstPage}">第一页</a>--%>
    <%--<a href="userManager?pageNumber=${pageInfo.prePage}">上一页</a>--%>
    <%--<a href="userManager?pageNumber=${pageInfo.nextPage}">下一页</a>--%>
    <%--<a href="userManager?pageNumber=${pageInfo.lastPage}">最后页</a>--%>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li><a href="userManager?pageNumber=${pageInfo.firstPage}">首页</a></li>
            <li>
                <a href="userManager?pageNumber=${pageInfo.prePage}" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>

            <%--<li><a href="userManager?pageNumber=${pageInfo.nextPage}">2</a></li>--%>
            <%--<li><a href="userManager?pageNumber=${pageInfo.nextPage}">3</a></li>--%>
            <%--<li><a href="userManager?pageNumber=${pageInfo.nextPage}">4</a></li>--%>

            <li>
                <a href="userManager?pageNumber=${pageInfo.nextPage}" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
            <li><a href="userManager?pageNumber=${pageInfo.lastPage}">尾页</a></li>
        </ul>
    </nav>
</div>
</body>
</body>
</html>
