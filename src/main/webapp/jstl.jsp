<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--if write c in prefix then use c entire program in JSTL--%>

<html>
<head>
    <title>Taglib Directive Tag</title>
</head>

<body>

<h3>Taglib Directive Tag</h3>
<c:set var="name" value="TCS Informatin & Technology"></c:set>
<c:out value="${name}"></c:out>
<c:if test="${10>2}">
    <h3>This is true block 10>2</h3>
</c:if>


</body>
</html>
