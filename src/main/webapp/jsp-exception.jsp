
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error-page.jsp" %>
<html>
<head>
    <title>JSP: Exception Handling</title>
</head>
<body>
<h1>Java Exception Handling</h1>
<%!
  int a= 100;
  int b= 0;
%>

<%
  int division= a/b;
%>

<h2>Division : <%=division%></h2>


</body>
</html>
