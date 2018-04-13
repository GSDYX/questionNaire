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
<html>
<head>
    <title>Title</title>
</head>
<body>
${exception}
<form action="<c:url value='/login'/>" method="post">
    <input type="text" name="username" value="admin">
    <input type="text" name="password" value="admin">
    <input type="submit" value="提交">
    <TR>
        <TD>验证码：</TD>
        <TD><input id="randomcode" name="randomcode" size="8" /> <img id="randomcode_img" src="<c:url value='/validatecode.jsp'/>" alt="" width="56" height="20" align='absMiddle' />

    </TR>
</form>
</body>
</html>
