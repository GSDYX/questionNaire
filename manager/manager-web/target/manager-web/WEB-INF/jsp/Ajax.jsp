<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/14
  Time: 16:25
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
<script>
    $(function () {
        $.ajax({
            url: "/manager/userItems",
            datatype: 'json',
            type: "Post",
            success: function (data) {
                if (data != null) {
                    $.each(data.list, function (index, item) { //遍历返回的json
                    alert(item)
                    })

                }
            }
        });
    })
</script>
</body>
</html>
