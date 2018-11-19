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

<title>Page Verif Commande</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<ul class="nav nav-pills" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item nav-link"
				href="achat">Retour</a></li>
		</ul>
	</nav>
	<br />
	<br />


	<div align="center" style="font-family: Lobster; font-size: 24px">
		PAGE DES COMMANDES ! <br />
	</div>

	<fieldset>
		<legend style="text-align: center;"> Votre Panier </legend>

		<table class="table table-bordered">
			<tbody>
			<thead>
				<tr>

					<th>NOM PRODUIT</th>
					<th>PRIX UNITAIRE</th>
					<th>QUANTITE</th>
					<td></td>



				</tr>
			</thead>

			<c:forEach var="ligne" items="${panierCourant.items}">
				<tr>

					<td>${ligne.produit.designation}</td>
					<td>${ligne.prix}</td>
					<td>${ligne.quantite}</td>
					<td><a href="suppItem?idProd=${ligne.produit.idProduit}"
						class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span></a>
						<a href="dimItem?idProd=${ligne.produit.idProduit}"
						class="btn btn-warning"><span
							class="glyphicon glyphicon-minus"></span></a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</fieldset>
	<br> PRIX TOTAL PANIER : ${panierCourant.getTotal()}
	<br>
	<br>
	<div>Adresse de livraison : ${client.adresse}</div>
	<br>
	<br>
	<f:form action="commandeValide" method="POST">
		<button type="submit" class="btn btn-primary">Valide</button>
	</f:form>

	<!---------------------------- FOOTER -------------------------------------->

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