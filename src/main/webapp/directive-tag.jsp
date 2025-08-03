<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- Directive Tag: Page import --%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<%--Make our Page error Paage--%>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Directive Tag</title>
</head>
<body>
<%--Include Directive: Used for add another resource page --%>
<%--Include index.jsp page in this page--%>
<%@ include file="index.jsp" %>

<%
    LocalDateTime now= LocalDateTime.now();
    DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy  hh-mm");
    System.out.println(formatter.format(now));
%>

<h1><%=formatter.format(now)%></h1>

</body>
</html>
