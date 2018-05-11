<%--
  Created by IntelliJ IDEA.
  User: GSDYX
  Date: 2018/5/11
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>



<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <!-- 引入 ECharts 文件 -->
    <link href="<c:url value='/css/bootstrap.min.css'/> " rel="stylesheet">
    <script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/js/echarts.js'/>"></script>
</head>
<body>
<div class="row">
    <div class="col-md-4 col-md-offset-5">
        <h1>问卷报告</h1>
    </div>
</div>
<hr>
<div class="row">
    <div class="col-md-4 col-md-offset-3">
        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <%--性别--%>
        <div id="sex" style="width: 300px;height:200px;"></div>
        <script type="text/javascript">
            // 基于准备好的dom，初始化echarts实例
            var myChartSex = echarts.init(document.getElementById('sex'));

            myChartSex.setOption({
                title : {
                    text: '性别',
                    x:'center'
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: ['女','男']
                },
                series : [
                    {
                        name: '性别',
                        type: 'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:[],
                        itemStyle: {
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            });

            myChartSex.showLoading();    //数据加载完之前先显示一段简单的loading动画



            $.ajax({
                type: "post",
                async: true,            //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                url: "<c:url value='/qnReport' />",    //请求发送到TestServlet处
                data: {},
                dataType: "json",        //返回数据形式为json
                success: function (result) {
                    //请求成功时执行该函数内容，result即为服务器返回的json对象
                    if (result) {

                        myChartSex.hideLoading();    //隐藏加载动画
                        myChartSex.setOption({        //加载数据图表
                            series: [{
                                name: '性别',
                                data:result
                            }]
                        });

                    }

                },
                error: function (errorMsg) {
                    //请求失败时执行该函数
                    alert("图表请求数据失败!");
                    myChartSex.hideLoading();
                }
            })



        </script>
    </div>
    <div class="col-md-4">
        <%--年级--%>
        <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
        <div id="grade" style="width:300px;height:200px;"></div>
        <script type="text/javascript">
            // 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('grade'));

            // 指定图表的配置项和数据
            var option = {
                title : {
                    text: '年级',
                    x:'center'
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: ['大一','大二','大三','大四']
                },
                series : [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:[
                            {value:335, name:'大一'},
                            {value:310, name:'大二'},
                            {value:234, name:'大三'},
                            {value:135, name:'大四'}
                        ],
                        itemStyle: {
                            emphasis: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };


            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        </script>
    </div>
</div>

<hr>

<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="relax" style="width:400px;height:300px;margin-top: 100px;margin-left:auto;margin-right:auto;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('relax'));

    // 指定图表的配置项和数据
    var option = {
        title : {
            text: '认同网络游戏是一种放松方式',
            x:'center'
        },
        xAxis: {
            type: 'category',
            data: ['完全同意', '基本同意', '部分同意', '不同意']
        },
        yAxis: {
            type: 'value'
        },
        series: [{
            data: [120, 200, 150, 80],
            type: 'bar'
        }]
    };



    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
<hr>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="mix" style="width:800px;height:600px;margin-top: 100px;margin-left:auto;margin-right:auto;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('mix'));

    // 指定图表的配置项和数据
    var option = {
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            legend: {
                data: ['经常', '有时','很少']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis:  {
                type: 'value'
            },
            yAxis: {
                type: 'category',
                data: ['经常玩游戏','在家里花很多时间玩游戏','在游戏中放松','在游戏中发泄','游戏增强信心','游戏摆脱孤独','超出预计时间玩游戏']
            },
            series: [
                {
                    name: '经常',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: [320, 302, 301, 334, 390, 330, 320]
                },
                {
                    name: '有时',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: [120, 132, 101, 134, 90, 230, 210]
                },
                {
                    name: '很少',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: [220, 182, 191, 234, 290, 330, 310]
                }
            ]

    };



    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>

<%--年级--%>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="attract" style="height:700px;width:100%;margin-top: 100px;margin-left:auto;margin-right:auto;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('attract'));

    // 指定图表的配置项和数据
    var option = {
        backgroundColor: '#2c343c',

        title: {
            text: '你觉得网游最吸引你的是什么？',
            left: 'center',
            top: 20,
            textStyle: {
                color: '#ccc'
            }
        },

        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },

        visualMap: {
            show: false,
            min: 80,
            max: 600,
            inRange: {
                colorLightness: [0, 1]
            }
        },
        series : [
            {
                name:'你觉得网游最吸引你的是什么？',
                type:'pie',
                radius : '55%',
                center: ['50%', '50%'],
                data:[
                    {value:335, name:'画面精美'},
                    {value:310, name:'过关或升级时的成就感'},
                    {value:274, name:'身边有同学或朋友在玩'},
                    {value:235, name:'可以结交更多地朋友'},
                    {value:400, name:'PK'},
                    {value:346, name:'角色扮演，比如当团长、帮主等'},
                    {value:156, name:'赚钱'}
                ].sort(function (a, b) { return a.value - b.value; }),
                roseType: 'radius',
                label: {
                    normal: {
                        textStyle: {
                            color: 'rgba(255, 255, 255, 0.3)'
                        }
                    }
                },
                labelLine: {
                    normal: {
                        lineStyle: {
                            color: 'rgba(255, 255, 255, 0.3)'
                        },
                        smooth: 0.2,
                        length: 10,
                        length2: 20
                    }
                },
                itemStyle: {
                    normal: {
                        color: '#c23531',
                        shadowBlur: 200,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                },

                animationType: 'scale',
                animationEasing: 'elasticOut',
                animationDelay: function (idx) {
                    return Math.random() * 200;
                }
            }
        ]
    };


    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>
