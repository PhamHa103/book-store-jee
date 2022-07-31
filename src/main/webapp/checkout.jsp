<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no"/>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="assets/css/main.css"/>
    <noscript>
        <link rel="stylesheet" href="assets/css/noscript.css"/>
    </noscript>
</head>

<body class="is-preload">
<!-- Wrapper -->
<div id="wrapper">

    <!-- Header -->
    <header id="header">
        <div class="inner">

            <!-- Logo -->
            <a href="book" class="logo">
                <span class="fa fa-book"></span> <span class="title">Book Online Store Website</span>
            </a>

            <!-- Nav -->
            <nav class="position-absolute">
                <ul>
                    <li><a href="logout">Logout</a></li>
                    <li><a href="checkout.jsp"
                           class="icon style2 fa-shopping-cart p-0 cart-shopping-icon position-relative">
                        <span class="label">Cart shopping</span>
                        <div class="cart-shopping-badge position-absolute d-flex align-items-center justify-content-center">
                            0
                        </div>
                    </a></li>
                </ul>
            </nav>

        </div>
    </header>

    <!-- Main -->
    <div id="main">
        <div class="inner">
            <h1>Checkout</h1>

            <!-- Shopping cart -->
            <section>
                <c:if test="${!requestScope.carts.isEmpty()}">
                    <c:forEach items="${requestScope.carts}" var="cart">

                        <div class="row">
                            <div class="col-12 col-md-9">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>All (${requestScope.carts.size()} books)</th>
                                        <th>Unit Price</th>
                                        <th>Quantity</th>
                                        <th>Price</th>
                                        <th><a class="icon style2 fa-trash border-0"><span
                                                class="label">Delete all</span></a>
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>
                                            <a class="border-0" style="cursor: pointer;">
                                                <img src="images/product-1-720x480.jpg" width="120"/>
                                                <div class="d-inline-block">
                                                    <h3>${cart.book.name}</h3>
                                                    <p>${cart.book.description}</p>
                                                </div>
                                            </a>
                                        </td>
                                        <td class="font-weight-bold">35000</td>
                                        <td>
                                            <input type="number" value="2" min="1" step="1" style="width: 80px;"/>
                                        </td>
                                        <td class="font-weight-bold text-danger">70000</td>
                                        <td><a class="icon style2 fa-trash border-0"><span
                                                class="label">Delete all</span></a>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                            <div class="col-12 col-md-3">
                                <div class="border border-secondary rounded mb-2 p-2">
                                    <p class="text-muted mb-0">Delivery to</p>
                                    <p class="font-weight-bold mb-0">Nguyen Thi Nhan | 0333461337</p>
                                    <p class="text-muted mb-0">Xom 1 thon da hoa xa binh minh huyen khoai chau tinh hung
                                        yen</p>
                                </div>
                                <div class="d-flex justify-content-between border border-secondary rounded mb-2 p-2">
                                    <p class="text-muted font-weight-bold mb-0">Total</p>
                                    <div>
                                        <p class="font-weight-bold text-danger mb-0">70000</p>
                                    </div>
                                </div>
                                <button type="button" class="w-100">Buy</button>
                                <p>${!requestScope.carts.isEmpty()} ${requestScope.carts.user.id} ${requestScope.carts.book.name}</p>
                            </div>
                        </div>
                    </c:forEach>
                </c:if>
                <c:if test="${requestScope.carts.isEmpty()}">
                    <c:out value="Không có cuốn sách nào"/>
                </c:if>
            </section>
        </div>
    </div>

    <!-- Footer -->
    <footer id="footer">
        <div class="inner">
            <section>
                <ul class="icons">
                    <li><a href="#" class="icon style2 fa-twitter"><span class="label">Twitter</span></a></li>
                    <li><a href="#" class="icon style2 fa-facebook"><span class="label">Facebook</span></a></li>
                    <li><a href="#" class="icon style2 fa-instagram"><span class="label">Instagram</span></a></li>
                    <li><a href="#" class="icon style2 fa-linkedin"><span class="label">LinkedIn</span></a></li>
                </ul>

                &nbsp;
            </section>

            <ul class="copyright">
                <li>Copyright © 2020 Company Name</li>
                <li>Template by: <a href="https://www.phpjabbers.com/">PHPJabbers.com</a></li>
            </ul>
        </div>
    </footer>

</div>

<!-- Scripts -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/js/jquery.scrolly.min.js"></script>
<script src="assets/js/jquery.scrollex.min.js"></script>
<script src="assets/js/main.js"></script>
</body>

</html>