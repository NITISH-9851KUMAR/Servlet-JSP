<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP: Send Redirect</title>
</head>
<body>

<h2>JSP: Send Redirect Method</h2>
<p>This is Page Two</p>

<%
    // Redirect from one page to another page
    response.sendRedirect("redirect3.jsp");

%>

</body>
</html>
