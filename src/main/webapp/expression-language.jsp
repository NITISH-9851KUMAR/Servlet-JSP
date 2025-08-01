<%--
  Created by IntelliJ IDEA.
  User: nitis
  Date: 01-08-2025
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression Language</title>
</head>
<body>

<%
    request.setAttribute("user_name", "Hello Server-JSP Program");
    session.setAttribute("session_name", "Smart Programming Language");
%>

<h3>Expression Language: ${requestScope.user_name}</h3>
<h3>Expression Language: ${session_name}</h3>
${1+2}
<%!
    int number= 90;
    StringBuilder name = new StringBuilder("Hello");
    String reverse()
    {
       return name.reverse().toString();
    }
%>

<%=number %>
<%=reverse()%>


</body>
</html>
