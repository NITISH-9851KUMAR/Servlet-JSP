<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Module Project | Home Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">

            <form action="exp-handling2.jsp" method="post">
            <div class="card">
                <div class="card-header bg-dark text-white">
                    <h3>Enter Two Number</h3>
                </div>
                <div class="card-body bg-secondary">
                    <input type="number" name="number1" class="form-control" placeholder="Enter Number1"> <br>
                    <input type="number" name="number2" class="form-control" placeholder="Enter Number2">
                </div>
                <div class="card-footer text-center bg-dark text-white">
                    <button type="submit" class="btn btn-outline-light">Divide</button>
                </div>
            </div>
            </form>

        </div> <!-- Column class div -->

    </div><!-- Row class Div -->

</div> <!-- Container class Div -->

</body>
</html>
