<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/4/27
  Time: 12:44
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
    <div class="col-md-6 col-md-offset-3">
        <h1 style="text-align:center">大学生网络游戏调查问卷</h1>
        <hr>
        <form action="<c:url value='/naireForm'/> " method="post">
            <div>
                <p>性别</p>
                <label class="radio-inline">
                    <input type="radio" name="sex" value="1"> 男
                </label>
                <label class="radio-inline">
                    <input type="radio" name="sex" value="2"> 女
                </label>
            </div>
            <hr>
             <div>
             <p>你的年级</p>
             <label class="radio-inline">
                 <input type="radio" name="grade" value="1"> 大一
             </label>
             <label class="radio-inline">
                 <input type="radio" name="grade" value="2"> 大二
             </label>
             <label class="radio-inline">
                 <input type="radio" name="grade" value="3"> 大三
             </label>
             <label class="radio-inline">
                 <input type="radio" name="grade" value="4"> 大四
             </label>
            </div>
            <hr>
            <div>
                <p>你经常玩网游吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="times" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="times" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="times" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <p>网络游戏是一种良好的放松方式，是对智力的一种挑战，能学习知识，你同意这种观点吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="relax" value="1"> 完全同意
                </label>
                <label class="radio-inline">
                    <input type="radio" name="relax" value="2"> 基本同意
                </label>
                <label class="radio-inline">
                    <input type="radio" name="relax" value="3"> 部分同意
                </label>
                <label class="radio-inline">
                    <input type="radio" name="relax" value="4"> 不同意
                </label>
            </div>
            <hr>
           <div>
               <P>你觉得网游最吸引你的是什么？（多选）</P>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract" value="1">
                       画面精美
                   </label>
               </div>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract" value="2">
                       过关或升级时的成就感
                   </label>
               </div>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract" value="3">
                       身边有同学或朋友在玩
                   </label>
               </div>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract"value="4">
                       可以结交更多地朋友
                   </label>
               </div>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract" value="5">
                       PK
                   </label>
               </div>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract" value="6">
                       角色扮演，比如当团长、帮主等
                   </label>
               </div>
               <div class="checkbox">
                   <label>
                       <input type="checkbox" name="attract" value="7">
                       赚钱
                   </label>
               </div>
           </div>
            <hr>
            <div>
                <p>你在家里也花很多时间玩游戏吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="hours" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="hours" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="hours" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <p>当生活中压力很大时，你会选择玩游戏来放松自己吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="pressure" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="pressure" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="pressure" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <p>当在生活遇到学习中或情感上的烦恼时，你会选择去游戏中发泄吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="vent" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="vent" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="vent" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <p>你觉得游戏中“英雄感或胜利感”能增强你的信心吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="confidence" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="confidence" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="confidence" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <p>你会通过玩网络游戏来摆脱生活中的孤独吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="lonely" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="lonely" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="lonely" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <p>你经常玩游戏超出预计时间吗？</p>
                <label class="radio-inline">
                    <input type="radio" name="forecast" value="1"> 经常
                </label>
                <label class="radio-inline">
                    <input type="radio" name="forecast" value="2"> 有时
                </label>
                <label class="radio-inline">
                    <input type="radio" name="forecast" value="3"> 很少
                </label>
            </div>
            <hr>
            <div>
                <P>你觉得让你戒不掉网游的原因是什么？（多选）</P>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="1">
                        在游戏中已经取得的等级和地位
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="2">
                        游戏中和好友之间的交情
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="3">
                        身边有同学或朋友在玩
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="4">
                        空余时间的无聊
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="5">
                        PK
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="6">
                        放松心情和发泄烦恼的渠道
                    </label>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="stop" value="7">
                        赚钱
                    </label>
                </div>
            </div>
            <hr>
            <P style="text-align:center ;margin-top:2cm"><button class="btn btn-primary btn-lg" type="submit" onclick="SendForm();">提交</button></P>

        </form>


    </div>
</div>
<%--<script>--%>
    <%--function SendForm (){--%>
        <%--var attract = "|";--%>
        <%--var stop="|";--%>

        <%--$("input[name='attract']:checkbox").each(function(index) {        if ($(this).prop("checked") === true) {--%>
            <%--attract += ($(this).val())+"|";--%>
        <%--}--%>
        <%--});--%>



        <%--$("input[name='stop']:checkbox").each(function(index) {        if ($(this).prop("checked") === true) {--%>
            <%--stop += ($(this).val())+"|";--%>
        <%--}--%>
        <%--});--%>
        <%--$("input[name='attract']:checkbox:first").attr("value",attract);--%>
        <%--console.log( $("input[name='attract']:checkbox:first").value);--%>
        <%--console.log(attract);--%>

    <%--}--%>

<%--</script>--%>
</body>
</html>
