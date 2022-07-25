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
                    <c:if test="${sessionScope!=null && sessionScope.isLoggedIn.equals('1')}">
                        <li><a href="logout">Logout</a></li>
                    </c:if>
                    <c:if test="${sessionScope==null || !sessionScope.isLoggedIn.equals('1')}">
                        <li><a href="login.jsp">Login</a></li>
                    </c:if>
                    <li><a href="checkout.jsp"
                           class="icon style2 fa-shopping-cart p-0 cart-shopping-icon position-relative">
                        <span class="label">Cart shopping</span>
                        <div
                                class="cart-shopping-badge position-absolute d-flex align-items-center justify-content-center">
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
            <h1>Books</h1>

            <div class="image main">
                <img src="images/banner-image-6-1920x500.jpg" class="img-fluid" alt=""/>
            </div>

            <!-- Products -->
            <section class="tiles">
                <!-- <c:if test="${!requestScope.books.isEmpty()}">
                    <c:forEach items="${requestScope.books}" var="book"> -->
                <article class="style1">
                        <span class="image">
                            <img src="images/product-1-720x480.jpg" alt=""/>
                        </span>
                    <a href="/book_store_war_exploded/book_detail?id=${book.id}">
                        <h2>${book.name}</h2>
                        <p>
                            <strong>${book.unitPrice}</strong>
                        </p>
                        <p>${book.description}</p>
                    </a>
                </article>
                <!-- </c:forEach>
                </c:if> -->
                <c:if test="${requestScope.books.isEmpty()}">
                    <c:out value="Không có cuốn sách nào"/>
                </c:if>
            </section>
            <nav>
                <ul class="pagination my-4 d-flex justify-content-center">
                    <li class="page-item"><a class="page-link" href="/?page=1">1</a></li>
                    <li class="page-item active">
                        <a class="page-link" href="/?page=2">2</a>
                    </li>
                    <li class="page-item"><a class="page-link" href="/?page=3">3</a></li>
                </ul>
            </nav>
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