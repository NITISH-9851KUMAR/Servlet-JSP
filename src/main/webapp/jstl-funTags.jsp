<%--
  Created by IntelliJ IDEA.
  User: Nitish
  Date: 11-09-2025
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- For JSTL Core Tag -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- For JSTL Function Tag -->
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>JSP Standard Tag Library</title>
</head>
<body>

<c:set var="str" value="Hello world"  />
<c:out value="${str}" />

<h2>Length of String: <c:out value="${fn:length(str)}" /> </h2>
<h2>Lower Case: <c:out value="${fn:toLowerCase(str)}" /> </h2>
<c:out value="${fn:contains(str, 'worlk')}" /> <br>
<c:out value="${fn:toUpperCase(str)}" />


</body>
</html>
