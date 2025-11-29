<%--
  Created by IntelliJ IDEA.
  User: Nitish Kumar
  Date: 28-11-2025
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Photo Store</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-4">
    <form action="photo-upload" method="post" enctype="multipart/form-data">
        <div class="mb-4">
            <label for="exampleInputName" class="form-label">User Name</label>
            <input type="text" name="userName" class="form-control" id="exampleInputName">
        </div>
        <div class="mb-3">
            <label for="exampleInputPhoto" class="form-label">Password</label>
            <input type="file" name="userPhoto" class="form-control" id="exampleInputPhoto">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>

</body>