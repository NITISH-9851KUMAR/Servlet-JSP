<%--
  Created by IntelliJ IDEA.
  User: Nitish
  Date: 12-09-2025
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>
    <title>JSTL SQL Tags</title>
</head>
<body>


<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/servlet"
                   user="root"
                   password="Nitish@04"
                   var="ds"/>

<sql:query var="rs" dataSource="${ds}">SELECT * FROM form;</sql:query>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Password</td>
    </tr>

    <c:forEach items="${rs.rows}" var="val">
    <tr>
        <td><c:out value="${val.name}"/></td>
        <td><c:out value="${val.email}"/></td>
        <td><c:out value="${val.password}"/></td>
    </tr>
    </c:forEach>

</table>


</body>
</html>
