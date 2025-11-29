<%--
  Created by IntelliJ IDEA.
  User: nitis
  Date: 29-11-2025
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
    <title>Photo Shows</title>
</head>
<body>

<%
    // This photo-show.jsp is call by PhotoStore.java
    String fileName = (String) session.getAttribute("photo");
%>

<h2>Your Uploaded Photo:</h2>

<%
    if (fileName != null) {
%>
<img src="image/<%= fileName %>" width="200" height="200"/>
<%
} else {
%>
<p>No photo found!</p>
<%
    }
%>

</body>
</html>
