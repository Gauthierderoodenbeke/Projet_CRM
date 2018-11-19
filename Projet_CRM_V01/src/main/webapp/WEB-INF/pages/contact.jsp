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
				class="nav-item nav-link"
				href="<%=request.getContextPath()%>/client/index">Retour</a></li>

		</ul>
	</nav>

	<br />
	<br />


	<div align="center" >
		Ecrivez-nous un petit mot : <br />
		<f:form modelAttribute="message"  action="envoyeMail" >
			<f:input path="msg" />
			<input type="submit" value="Envoyer" class="button btn-primary" />
		</f:form>
		<br />
	</div>

	<!---------------------------- FOOTER -------------------------------------->

	<br />
	<br />
	<div class="container-fluid footer" align="center">

		<hr />
		<p>&copy; Adaming 2018 - Promotion Septembre</p>
	</div>

</body>
</html>