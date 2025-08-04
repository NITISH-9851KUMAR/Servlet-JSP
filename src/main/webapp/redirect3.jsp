<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP: Send Redirect</title>
</head>
<body>

<h2>JSP: Send Redirect Method</h2>
<p>This is Page Three</p>

<%
    // Redirect
    response.sendRedirect("https://www.india.gov.in/");
%>

</body>
</html>
