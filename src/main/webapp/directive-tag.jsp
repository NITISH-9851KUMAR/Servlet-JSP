<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- Directive Tag: Page --%>
<%@page import="java.util.Random, java.io.*" %>

<%--Make our Page error Paage--%>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Directive Tag</title>
</head>
<body>
<%--Include Directive: Used for add another resource page --%>

<%--Include index.jsp page in this page--%>
<%@ include file="index.jsp"%>
<%
    for(int i=1; i<=5; i++){
%>
<h3>Directive Tag: Include</h3>
<%
    }
%>

</body>
</html>
