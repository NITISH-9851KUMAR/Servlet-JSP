
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error Page: Exception Handling</title>
    <style>
        body{
            padding: 0;
            margin: 0;
        }

    </style>
</head>
<body>

<div style="background-color: blue" >
    <h2>Error Page: Exception Handling</h2>
    <h3>Something went happen wrong</h3>
    <h4>Error Occurred on this page</h4>
    <p><%=exception%></p>
</div>

</body>
</html>
