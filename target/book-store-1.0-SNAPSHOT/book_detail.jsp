<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>PHPJabbers.com | Free Book Online Store Website Template</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
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
									<li><a href="logout?returnUrl=book_detail?id=${requestScope.bookDetail.id}">Logout</a></li>
								</c:if>
								<c:if test="${sessionScope==null || !sessionScope.isLoggedIn.equals('1')}">
									<li><a href="login.jsp?returnUrl=book_detail?id=${requestScope.bookDetail.id}">Login</a></li>
								</c:if>
								<li><a href="checkout.jsp" class="icon style2 fa-shopping-cart p-0 cart-shopping-icon position-relative">
										<span class="label">Cart shopping</span>
										<div class="cart-shopping-badge position-absolute d-flex align-items-center justify-content-center">
											0</div>
									</a></li>
							</ul>
						</nav>
		
					</div>
				</header>

				<!-- Main -->
					<div id="main">
						<div class="inner">
							<h1>${requestScope.bookDetail.name}<span class="pull-right">${requestScope.bookDetail.unitPrice} VND</span></h1>
							
							<div class="container-fluid">
								<div class="row">
									<div class="col-md-5">
										<img src="images/product-1-720x480.jpg" class="img-fluid" alt="">
									</div>

									<div class="col-md-7">
										<p >Author: <b>${requestScope.bookDetail.author}</b></p>

										<p>${requestScope.bookDetail.publisher} - ${requestScope.bookDetail.publishedYear}</p>
										<p>
											${requestScope.bookDetail.description}
										</p>

										<div class="row">
							                <div class="col-sm-8">
							                  	<label class="control-label">Quantity</label>

							                  	<div class="row">
								                    <div class="col-sm-6">
								                      	<div class="form-group">
								                        	<input type="number" value="1" min="1" step="1" style="width: 80px;" />
								                      	</div>
								                    </div>

								                    <div class="col-sm-6">
							                      		<button type="submit">Add to Cart</button>
								                    </div>
							                  	</div>
							                </div>
							            </div>
									</div>
								</div>
							</div>

							<br>
							<br>
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
								<li>Copyright © 2020 Company Name </li>
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