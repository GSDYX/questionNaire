<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/5/6
  Time: 18:47
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
问卷名 ${nairename}
<br>
问卷链接为<c:url value="${link}"/>
</body>
</html>