<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Lobster" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<title>Page Accueil</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<ul class="nav nav-pills" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item nav-link" href="<%=request.getContextPath()%>/admin/admin">admin</a></li>
				<li role="presentation" ><a
				class="nav-item nav-link" href="inscriptionPage">Inscription</a></li>
		</ul>
	</nav>

	<div class="container-fluid" align="center">
		<img
			src="http://www.marketing-pgc.com/wp-content/uploads/2017/04/banniere-veggie.jpg">
	</div>
	<br />
	<br />


	<div align="center" style="font-family: Lobster; font-size: 24px">
		Bienvenue sur notre site de vente ! <br /> <a href="achat"
			style="font-family: Lobster; font-size: 20px; color: #03caed">
			Let's Go !</a>
	</div>
	
	<!---------------------------- FOOTER -------------------------------------->
	
	<br />
	<br />
	<div class="container-fluid footer" align="center">
		<a href="<%=request.getContextPath()%>/client/index" style="color:white">Sign out</a> - 
		<a href="contactUs" style="color:white">Contact Us</a>
		<hr/>
		<p>&copy; Adaming 2018 - Promotion Septembre</p>
	</div>

</body>
</html>