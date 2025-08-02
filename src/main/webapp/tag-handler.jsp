<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://example.com/mytags" %>

<html>
<head>
    <title>Tag handler</title>
</head>
<body>

<h2>Hello Everyone</h2>
<%--<t:mytag></t:mytag> <!-- mytag name is present in mytag.tld file which is in WEB-INF foloder -->--%>
<t:printTable number="30" color="red"></t:printTable>
<t:printTable number="40" color="brown"></t:printTable>
</body>
</html>
