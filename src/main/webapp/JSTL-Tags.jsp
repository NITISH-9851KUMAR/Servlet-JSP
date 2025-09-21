<%--
  Created by IntelliJ IDEA.
  User: Nitish
  Date: 11-09-2025
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL Tags Example</title>
</head>
<body>

<h1>JSTL Tags Example</h1>
<c:set var="i" value="20" scope="page" />
<c:out value="${i}" />
<c:remove var="i" />
<h1>Hello</h1>
<c:out value="${i}" />

<hr>

<c:set var="x" value="20" />
<c:if test="${x==50 || x<10}">
    Yes condition is True.
</c:if>
<hr>

<!-- Java Switch: choose, when, otherwise -->
<c:set var="y" value="0" />
<c:choose>
    <c:when test="${y>0}">
        <h2>This is my first case</h2>
        <h2>This is positive Number</h2>
    </c:when>

    <c:when test="${y<0}">
        <h2>This is my second case</h2>
        <h2>This is Negative Number</h2>
    </c:when>

    <c:otherwise>
        <h2>This is default case..  otherwise</h2>
        <h2>This is Zero Number</h2>
    </c:otherwise>

</c:choose>

<hr>
<!-- for each Loop -->
<c:forEach var="j" begin="1" end="10">
    <h4>Value of J <c:out value="${j}" /></h4>
</c:forEach>
<hr>

<!-- Redirect Tag -->
<c:url var="myurl" value="https://www.google.com">
    <c:param name="q" value="learn code with durgesh" />
</c:url>
<%--<c:redirect url="https://www.google.com"></c:redirect>--%>
<%--<c:out value="${myurl}"></c:out>--%>
<c:redirect url="${myurl}" />
</body>
</html>
