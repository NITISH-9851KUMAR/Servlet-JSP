<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="exp-handling3.jsp" %>
<html>
<head>
    <title>Add Module Project | Home Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<%
    int num1= Integer.parseInt(request.getParameter("number1"));
    int num2= Integer.parseInt(request.getParameter("number2"));
    int result= num1/num2;
%>

<h1>Result: <%=result%></h1>

</body>
</html>
