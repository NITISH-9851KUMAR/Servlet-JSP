<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Error Handling Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container p-3 text-center">
    <img src="image/error-page1.png" class="img-fluid">
    <h1 class="display-3">Sorry Something Went wrong!</h1>
    <p><%=exception%></p>
    <a href="exp-handling1.jsp" class="btn btn-outline-primary">Home Page</a>
</div>

</body>
</html>
