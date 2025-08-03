<%@ page contentType="text/html;charset=UTF-8" %>

<!-- Directive Tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--if write c in prefix then use c entire program in JSTL--%>

<html>
<head>
    <title>Taglib Directive Tag</title>
</head>

<body>

<h3>JSP Standard Tag Library</h3>
<%--For set value --%>
<c:set var="name" value="Tata Conseltancy Company"></c:set>

<%--For Print Value--%>
<c:out value="${name}"></c:out>

<%--If Block for test Condition --%>
<c:if test="${3>2}">True Block is executed</c:if>
<c:if test="${2>3}">False Block Is Executed</c:if>


</body>
</html>
