
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
<div class="row">
    <div class="col-md-6 col-md-offset-3" >
    <table class="table table-bordered">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">用户名</th>
            <th scope="col">密码</th>
        </tr>
        <c:forEach begin="0" step="1" items="${pageInfo.list}" var="list">
            <tr>

                <td>${list.userid}</td>
                <td>${list.username}</td>
                <td><a href="<c:url value='/userDelect?userid=${list.userid}'/> ">删除用户</a></td>
            </tr>
        </c:forEach>
    </table>
    </div>
</div>

<div class="row">
    <div class="col-md-6 col-md-offset-5" >

    <nav aria-label="Page navigation">
        <ul class="pagination">

            <%--上一页 --%>

                <c:choose>
                    <c:when test="${pageInfo.pageNum eq 1 }">
                        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                    </c:when>
                    <c:otherwise>
                    <li>
                        <a href="/manager/userManager?pageNumber=${pageInfo.pageNum-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span></a>
                    </li>
                    </c:otherwise>
                </c:choose>


                <c:choose>
                    <c:when test="${pageInfo.pages <= 6 }">
                        <c:set var="begin" value="1"/>
                        <c:set var="end" value="${pageInfo.pages }"/>
                    </c:when>
                    <c:otherwise>
                        <c:set var="begin" value="${pageInfo.pageNum-2 }"/>
                        <c:set var="end" value="${pageInfo.pageNum + 3}"/>
                        <c:if test="${begin < 1 }">
                            <c:set var="begin" value="1"/>
                            <c:set var="end" value="6"/>
                        </c:if>
                        <c:if test="${end > pageInfo.pages }">
                            <c:set var="begin" value="${pageInfo.pages-5 }"/>
                            <c:set var="end" value="${pageInfo.pages }"/>
                        </c:if>
                    </c:otherwise>
                </c:choose>

                <c:forEach begin="${begin }" end="${end }" var="i">
                    <c:choose>
                        <c:when test="${i eq pageInfo.pageNum }">
                            <li><a href="#">${i }</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="/manager/userManager?pageNumber=${i}">${i}</a></li>
                        </c:otherwise>
                    </c:choose>


                </c:forEach>
            <%--<li><a href="#">1</a></li>--%>
            <%--<li><a href="#">2</a></li>--%>
            <%--<li><a href="#">3</a></li>--%>
            <%--<li><a href="#">4</a></li>--%>
            <%--<li><a href="#">5</a></li>--%>


                <%--下一页 --%>
                <c:choose>
                    <c:when test="${pageInfo.pageNum eq pageInfo.pages }">
                        <li class="disabled">
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li>
                            <a href="/manager/userManager?pageNumber=${pageInfo.pageNum+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:otherwise>
                </c:choose>

        </ul>
    </nav>
    </div>
</div>
</body>
</body>
</html>
