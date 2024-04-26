<%@page import="myapp.javax.controller.MainController"%>
<%@page import="myapp.javax.bean.ProductBean"%>
<%@page import="java.util.List"%>
<%!String offset, item;%>
<%!List<ProductBean> list;%>
<%
	int ind = 0;
	if ((offset = request.getParameter("offset")) == null)
		offset = "1";

	if ((item = request.getParameter("searchProduct")) != null) {
		list = MainController.search(item);
	} else {
		list = MainController.getProducts(offset);
	}
	int size = MainController.size;
%>
<html lang="">

<head>

<meta charset="utf-8" />
<title>Home page</title>

<meta name="author" content="Abhishek Bansal" />
<meta name="description" content="page will fetch product from db" />

<!-- including style sheets -->
<link rel="stylesheet" href="../style-files/home-root-style.css" />
<link rel="stylesheet" href="../style-files/home-header-style2.css" />
<link rel="stylesheet" href="../style-files/home-slider-style2.css" />
<link rel="stylesheet" href="../style-files/home-body-style2.css" />
<link rel="stylesheet" href="../style-files/home-footer-style2.css" />

<!-- page tab icon -->
<link rel="shortcut icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" />
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="32x32" />
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="48x48" />
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="96x96" />
<link rel="icon" type="image/x-icon"
	href="../resource/icons/tab_logo.png" sizes="144x144" />

<!-- including jsp tag library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>

<body style="height: 275%;">

	<header id="navBar">
		<!-- logo -->
		<div class="logo">
			<label class="logo_cu">CU</label><label class="logo_m">Merchandise</label>
		</div>

		<!-- search area -->
		<div style="padding: 5;">
			<form action="" method="get">
				<input id="search" name="searchProduct" placeholder="Search Here">
				<img id="search_ic" src="../resource/icons/search_ic.png"
					alt="search" />
			</form>
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

	<!-- slider --->
	<div class="slider">
		<div class="slider-items"></div>
	</div>




	<!-- product holder --->
	<main class="mainBody">

		<div class="products">
			<c:forEach var="i" begin="0" end="2">
				<div class="row${i}">
					<c:forEach var="j" begin="0" end="2">
						<div class="product${j}">
							<div style="text-align: center">
								<c:if test="<%=ind < size%>">
									<img src="../resource/slider/01.jpg" />
									<div style="padding: 3px;">
										<label><%=list.get(ind).getName()%></label> <label
											style="padding-left: 50;"><%=list.get(ind).getPrice()%></label>
										<%
											ind++;
										%>
									</div>
								</c:if>
							</div>
						</div>
					</c:forEach>
				</div>
			</c:forEach>
		</div>

		<div class="page_navigator">
		
			<a type="submit" href="?offset=1" >1</a> 
			<a type="submit" href="?offset=2" >2</a> 
			<a type="submit" href="?offset=3" >3 </a>
			<a type="submit" href="?offset=4" >4</a>
			
		</div>
		
	</main>


	<footer> </footer>

	<script src="../js-files/home-controller.js">
		
	</script>


</body>
</html>
