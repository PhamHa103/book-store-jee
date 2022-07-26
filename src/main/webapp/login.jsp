<!-- <%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 7/15/2022
  Time: 9:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> -->
<html>

<head>
    <title>Login to book store</title>

    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/login.css">
</head>

<body>
    <div class="container d-flex justify-content-center">
        <div id="login-form-container" class="p-5 m-5">
            <h2 class="text-center">Login</h2>
            <form action="/book_store_war_exploded/login?returnUrl=${param.get('returnUrl')}" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control" id="username" placeholder="Enter username" name="username" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" placeholder="Enter password"
                        name="password" required>
                </div>
                <p class="text-danger">${param.get("message").equals("0") ? "Login fail" : ""} </p>
                <div class="d-flex justify-content-end">
                    <button type="button" class="btn mr-2">Back</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
                <p class="mt-3"><small>Do you want to create new account? <a href="register.jsp">Click me</a></small></p>
            </form>
        </div>
    </div>

</body>

</html>