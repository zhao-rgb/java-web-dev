<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/9/28
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();
    response.sendRedirect("/");
%>
