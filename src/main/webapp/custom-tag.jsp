<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://example.com/mytags" %>

<html>
<head>
    <title>Tag handler</title>
</head>
<body>

<h2>Hello Everyone</h2>
<h2>This is Tag Custom Tag JSP Folder</h2>

<t:BasicTagHandler></t:BasicTagHandler>
<t:printTable number="3" color="green"></t:printTable>
<t:printTable number="10" color="salmon"></t:printTable>

</body>
</html>
