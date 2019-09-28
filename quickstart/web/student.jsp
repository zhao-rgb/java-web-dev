<%@ page import="entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/9/28
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息显示</title>
    <style type="text/css">
        <%--页面主容器，左右均等留白，设置背景色和上下内边距 --%>
        .container {
            width: 80%;
            margin: 0 auto;
            background-color: #9b9b9b;
            padding-top: 10px;
            padding-bottom: 10px;
        }
        <%--展示每个学生数据的div，横向flex布局，水平和垂直方向均居中对齐 --%>
        .item {
            width: 80%;
            margin: 0 auto;
            height: 80px;
            background-color: #eee;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 5px 5px 5px 5px;
        }
        .item span {
            margin-right: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <%
        // 从request对象取出studentList参数
        List<Student> studentList = (List<Student>) request.getAttribute("studentList");
        //遍历集合
        for (Student student : studentList) {
            //将每个Student对象存入当前页面的内置对象，便于用EL表达式展现对象的信息
            pageContext.setAttribute("student", student);
    %>
    <%-- 循环产生div，用来展示每个Student对象的数据--%>
    <div class="item">
        <span>${student.id}</span>
        <span>${student.name}</span>
        <span>${student.gender}</span>
        <span>${student.age}</span>
    </div>
    <%
        }
    %>
</div>
</body>
</html>