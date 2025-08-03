<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declaration or Declarative Tag</title>
</head>
<body>

<h1>Common JSP Tag</h1>

<%--Declaration Tag Used for Declare Variable and Method--%>
<%!
    int a= 5;
    int b= 10;

    int sum(){
        return a+b;
    }
%>

<%--Scriptlet Tag Write for Java Code--%>
<%
    Random rm= new Random();
    int randomNumber= rm.nextInt(100);
%>

<%--Expression Tag to show the Value --%>
<p>Random Value: <%= randomNumber %></p>
<p>Sum of <%=a%> and <%=b%> : <%=sum()%></p>

<%
    for(int i= 1; i<5; i++){
%>
<p>Random number: <%=randomNumber+i%></p>
<%
    }
%>

</body>
</html>
