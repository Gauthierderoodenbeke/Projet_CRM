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
	href="<%=request.getContextPath()%>/resources/css/bootstrap.css" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<title>Page d'achats Client=</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<ul class="nav nav-pills" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item nav-link" href="index">Accueil</a></li>

			<li role="presentation"><a class="nav-item nav-link"
				href="compte">Mon Compte</a></li>
		</ul>
	</nav>

	<br>
	<br>
	<div id="formachat" class="cadre">
		<f:form modelAttribute="produit" action="rechercheMotCle" method="GET">
			<f:input path="designation" />
			<button type="submit" class="btn btn-success">Recherche Par
				Mot-Clé</button>
		</f:form>
		<br> <br>

		<f:form modelAttribute="produit" action="rechercheCat" method="GET">
			<f:select path="categorie.idCategorie" items="${categories}"
				itemValue="idCategorie" itemLabel="nomCategorie"></f:select>

			<button type="submit" class="btn btn-success">Recherche Par
				Catégorie</button>
		</f:form>
		<br> <br>


		<div id="tabProduits" class="cadre">
			<table class="tabStyle1">


				<tr>

					<th>ID</th>
					<th>CATEGORIE</th>
					<th>NOM PROD</th>
					<th>DESCRIPTION</th>
					<th>PHOTO</th>
					<th>PRIX</th>
					<th>QUANTITE</th>
					<th>Ajouter au panier</th>

				</tr>

				<c:forEach items="${produits}" var="prod">
					<tr>
						<td>${prod.idProduit}</td>
						<td>${prod.categorie.getNomCategorie()}</td>
						<td>${prod.designation}</td>
						<td>${prod.description}</td>
						<td><img src="photoProd?id=${prod.idProduit}"></td>
						<td>${prod.prix}</td>
						<td>${prod.quantite}</td>
						<td><f:form modelAttribute="lcommande"
								action="ajoutItem?id=${prod.idProduit}">
								<f:input path="quantite" />
								<f:button type="submit" class="btn btn-primary">
									<span class="glyphicon glyphicon-plus"></span>
								</f:button>
							</f:form></td>
					</tr>
				</c:forEach>



			</table>
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
						<th></th>



					</tr>
				</thead>

				<c:forEach var="ligne" items="${panierCourant.items}">
					<tr>
						
						<td>${ligne.produit.designation}</td>
						<td>${ligne.prix}</td>
						<td>${ligne.quantite}</td>
						<td><a href="suppItem?idProd=${ligne.produit.idProduit}"
							class="btn btn-danger"><span
								class="glyphicon glyphicon-trash"></span></a>
								<a href="dimItem?idProd=${ligne.produit.idProduit}"
							class="btn btn-warning"><span
								class="glyphicon glyphicon-minus"></span></a>
						</td>

					</tr>
				</c:forEach>
				</tbody>
			</table>

			<br> PRIX TOTAL PANIER : ${panierCourant.getTotal()} &euro; <br>
			<f:form action="commande" method="POST">
				<button type="submit" class="btn btn-primary">Commander</button>
			</f:form>
		</fieldset>
	</div>

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