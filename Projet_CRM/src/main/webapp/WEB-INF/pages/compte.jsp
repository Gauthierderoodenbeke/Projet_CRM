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
				class="nav-item nav-link" href="index">Accueil</a></li>
		</ul>
	</nav>
	<br />
	<br />


	<div align="center" style="font-family: Lobster; font-size: 24px">
		COMPTE A FAIRE <br /> 
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