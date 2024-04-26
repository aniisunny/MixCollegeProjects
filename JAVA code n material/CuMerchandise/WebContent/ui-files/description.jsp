<html lang="">

<head>
<meta charset="utf-8">
<title>Product Detail</title>


<meta name="author" content="Aniruddha and Abhishek Bansal" />
<meta name="description" content="will show product detail" />

<!-- including style sheets -->
<link rel="stylesheet" href="../style-files/home-root-style.css" />
<link rel="stylesheet" href="../style-files/home-header-style2.css" />
<link rel="stylesheet" href="../style-files/home-footer-style2.css" />
<link rel="stylesheet" href="../style-files/description.css" />

<!-- page tab icon -->
<link rel="shortcut icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" />
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="32x32"/>
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="48x48"/>
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="96x96"/>
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="144x144"/>


<!-- including jsp tag library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>

<body>

	<header id="navBar">
		<!-- logo -->
		<div class="logo">
			<label class="logo_cu">CU</label><label class="logo_m">Merchandise</label>
		</div>

		<!-- search area -->
		<div style="padding: 5;">
			<input id="search" placeholder="Search Here"> <img
				id="search_ic" src="../resource/icons/search_ic.png" alt="search" />
		</div>

		<!-- other details -->
		<div class="detail">
			<img style="height: 20px;" src="../resource/icons/email_ic.png" /> <label
				style="position: absolute; margin-left: 2;">brandshop@cumail.in</label>
			<br /> <img style="position: absolute; height: 20px; margin-top: 5;"
				src="../resource/icons/call_ic.png" />
			<wbr />
			<label style="position: absolute; margin-left: 22; margin-top: 6px;">9520401457</label>
		</div>
	</header>

	<main>
		<div class="mainBody" id="description">
			<div class="product_image">
				<div class="col0">
					<div class="image">
						<img src="../resource/slider/01.jpg" />
					</div>
					<div class="image">
						<img src="../resource/slider/01.jpg" />
					</div>
					<div class="image">
						<img src="../resource/slider/01.jpg" />
					</div>
				</div>
				<div class="col1">
					<img src="../resource/slider/01.jpg" />
				</div>
			</div>

			<div class="product_detail">

				<label class="product_name">Modo Rapido</label> <br /> <label
					class="about_product">Men Maroon Printed Round Neck T-shirt</label>
				<br /> <br />

				<div>
					<label class="price_product1">Rs. 519</label> <label
						class="price_product2">Rs.649</label> <label
						class="price_product3">(20%OFF)</label>
				</div>

				<label class="taxes">inclusive of all taxes</label> <br /> <br />

				<div>
					<label class="select_size">SELECT SIZE</label> <label
						class="size_chart">SIZE CHART ></label>
				</div>

				<div class="size_div">
					<span class="size">S</span> <span class="size">M</span> <span
						class="size">L</span> <span class="size">XL</span> <span
						class="size">XXL</span>
				</div>

				<div class="buy_now">
					<Button class="bag">ADD TO BAG</Button>
					<Button class="buy">BUY NOW</Button>
				</div>

				<div class="details">PRODUCT DETAILS</div>

				<div class="name">Maroon and black printed T-shirt, has a
					round neck, long sleeves</div>

			</div>

		</div>

	</main>

	<footer></footer>

</body>

</html>