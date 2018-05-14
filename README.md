# 问卷调查网项目
## 简介
这是一个简单的问卷调查系统，用户注册登入网站根据需求添加问卷，
分享问卷后获取问卷唯一链接，被调查者点击问卷填写并提交。  用户可以查看拥有问卷的问卷分析，管理员可以对用户和问卷进行管理。
## 工具  
编译器： IntelliJ IDEA  
项目构建工具：Maven
## 使用技术  
IOC容器：Spring

Web框架：SpringMVC

ORM框架：Mybatis

安全框架：Shiro

数据库：Mysql

日志：log4j

前端框架：Bootstrap

前端页面：Jsp Echarts 
## 运行项目  
### 1. 运行环境
* Tomcat版本：Tomcat7.x
* Mysql版本: 5.7.x  
### 2. 初始化项目
* 在你的Mysql中，创建一个数据库名称为qn的数据库，并导入项目文件中的sql文件。
* 修改数据库的用户名和密码都为root，也可以修改db.properties配置文件为自己的账号密码。 
* 将war文件夹（在项目文件夹中）下的所有war文件放入tomcat的webapps夹下，启动tomcat。  
* 项目的入口网址为localhost:8080/shiro  
* 用户测试账号user；管理员测试账号admin。（密码和账号相同）
