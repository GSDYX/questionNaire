
<%--</body>--%>
<%--</html>--%>

<%--
Created by IntelliJ IDEA.
User: GSDYX
Date: 2018/4/2
Time: 20:31
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>问卷调查</title>
    <meta charset="utf-8" />

    <link rel="stylesheet" type="text/css" href="<c:url value='/css/bootstrap.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/font-awesome.css'/>">
    <link rel='stylesheet' id='camera-css'  href='<c:url value='/css/camera.css'/>' type='text/css' >

    <link rel="stylesheet" type="text/css" href="<c:url value='/css/slicknav.css'/>">
    <link rel="stylesheet" href="<c:url value='/css/prettyPhoto.css'/>" type="text/css" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>">


    <script type="text/javascript" src="<c:url value='/js/jquery-1.8.3.min.js'/>"></script>


    <script type="text/javascript" src="<c:url value='/js/jquery.mobile.customized.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/jquery.easing.1.3.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/camera.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/js/myscript.js'/>"></script>
    <script src="<c:url value='/js/sorting.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/js/jquery.isotope.js'/>" type="text/javascript"></script>
    <!--script type="text/javascript" src="/js/jquery.nav.js"></script-->


    <script>
        jQuery(function(){
            jQuery('#camera_wrap_1').camera({
                transPeriod: 500,
                time: 3000,
                height: '490px',
                thumbnails: false,
                pagination: true,
                playPause: false,
                loader: false,
                navigation: false,
                hover: false
            });
        });
    </script>

</head>
<body>
${sessionScope.username}
${sessionScope.values()}
<!--home start-->

<div id="home">
    <div class="headerLine">
        <div id="menuF" class="default">
            <div class="container">
                <div class="row">
                    <div class="logo col-md-4">
                        <div>
                            <h1>问卷网</h1>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="navmenu"style="text-align: center;">
                            <ul id="menu">
                                <li class="active" ><a href="/shiro/loginJump">登入</a></li>
                                <li><a href="/shiro/userSignupJump">注册</a></li>
                                <li><a href="#">用户名</a></li>
                                <li><a href="#">问卷管理</a></li>
                                <li class="last"><a href="/shiro/test.jsp">test</a></li>

                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row wrap">
                <div class="col-md-12 gallery">
                    <div class="camera_wrap camera_white_skin" id="camera_wrap_1">
                        <div data-thumb="" data-src="<c:url value='/images/slides/blank.gif'/>">
                            <div class="img-responsive camera_caption fadeFromBottom">
                                <h2>We listen.</h2>
                            </div>
                        </div>
                        <div data-thumb="" data-src="<c:url value='/images/slides/blank.gif'/>">
                            <div class="img-responsive camera_caption fadeFromBottom">
                                <h2>We discuss.</h2>
                            </div>
                        </div>
                        <div data-thumb="" data-src="<c:url value='/images/slides/blank.gif'/>">
                            <div class="img-responsive camera_caption fadeFromBottom">
                                <h2>We develop.</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>




</body>

</html>