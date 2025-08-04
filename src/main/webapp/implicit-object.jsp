<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>

<!-- Implicit Object  -->
<%
    out.println("Hello world");

    request.getParameter("");

    // config(ServletConfig)

    // application(ServletContext)

    // session
    out.println(session.isNew());
    session.setAttribute("name", "ABC");

     // page: current page jsp
    // exception throwable

    // pageContext: PageContext
%>

</body>
</html>
