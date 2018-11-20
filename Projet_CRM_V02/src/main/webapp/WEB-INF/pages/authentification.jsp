<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Lobster" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<title>Authentification</title>
</head>
<body>

<nav class="navbar navbar-inverse">
		<ul class="nav nav-pills" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item nav-link" href="achat">Retour</a></li>
		</ul>
	</nav>
	
	<br />
	<br />

	<div>
		<table class="tabStyle1">
			<f:form modelAttribute="client" action="connexion" method="post">
				<tr>

					<td>Username</td>

					<td><f:input path="email" required="true"/></td>

				</tr>
				<tr>
					<td>Mot de Passe</td>

					<td><f:password path="mdp"/></td>

				</tr>
				
				<tr> <td> <button type="submit" class="btn btn-primary">Log In</button> </td>
				<td><a href="mdpoubliePage">Mot de passe oublie</a></td></tr> 
				
			</f:form>
		</table>
		
	</div>
	<br />
	<br />
	<div class="container-fluid footer" align="center">
		<a href="<%=request.getContextPath()%>/client/index"
			style="color: white">Sign out</a> - <a href="contactUs"
			style="color: white">Contact Us</a>
		<hr />
		<p>&copy; Adaming 2018 - Promotion Septembre</p>
	</div>


</body>
</html>