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
    <title>Register for book store</title>

    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="assets/css/register.css">
</head>

<body>
    <div class="container d-flex justify-content-center">
        <div id="register-form-container" class="p-5 m-5">
            <h2 class="text-center">Register</h2>
            <form action="register" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" class="form-control" id="username" placeholder="Enter username" name="username" required>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" class="form-control" id="password" placeholder="Enter password"
                        name="password" required>
                </div>
                <div class="form-group">
                    <label for="fullname">Fullname:</label>
                    <input type="text" class="form-control" id="fullname" placeholder="Enter fullname"
                        name="fullname" required>
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter email"
                        name="email">
                </div>
                <div class="form-group">
                    <label for="address">Address:</label>
                    <textarea type="text" rows="3" class="form-control" id="address" placeholder="Enter address"
                        name="address" required></textarea>
                </div>
                <div class="form-group">
                    <label for="phone">Phone number:</label>
                    <input type="text" class="form-control" id="phone" placeholder="Enter phone"
                        name="phone" required>
                </div>
                <p class="text-danger">
                    ${param.get("message").equals("0") ? "Username must not empty" : ""}
                    ${param.get("message").equals("1") ? "Username no more than 20 characters" : ""}
                    ${param.get("message").equals("2") ? "Password must not empty" : ""}
                    ${param.get("message").equals("3") ? "Password must more than 8 characters and less than 16 characters" : ""}
                    ${param.get("message").equals("4") ? "Fullname must not empty" : ""}
                    ${param.get("message").equals("5") ? "Fullname no more than 50 characters" : ""}
                    ${param.get("message").equals("6") ? "Email must not empty" : ""}
                    ${param.get("message").equals("7") ? "Address must not empty" : ""}
                    ${param.get("message").equals("8") ? "Phone number must not empty" : ""}
                    ${param.get("message").equals("9") ? "Username existed" : ""}
                    ${param.get("message").equals("10") ? "Email existed" : ""}
                    ${param.get("message").equals("11") ? "Phone number existed" : ""}
                    ${param.get("message").equals("12") ? "Register fail" : ""}
                </p>
                <div class="d-flex justify-content-end">
                    <button type="button" class="btn mr-2">Back</button>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>
    </div>

</body>

</html>