<%--
  Created by IntelliJ IDEA.
  User: nitis
  Date: 28-07-2025
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HttpSession: Session Tracking</title>
</head>
<body>

<%
    String userName= (String)session.getAttribute("user_name");
%>

<div style= "text-align: center">
    <h3>Session Tracking: HttpSession</h3>
    <h3>Welcome: <%= userName%></h3>
    <a href="http-session-home.jsp">Home Page </a>&nbsp
    <a href="http-session-about.jsp">About Us </a>&nbsp
    <a href="logout">Logout</a>
</div>

</body>
</html>
