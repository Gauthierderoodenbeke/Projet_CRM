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

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<title>Page Produits</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<ul class="nav nav-pills" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item nav-link" href="admin">Accueil</a></li>

			<li role="presentation"><a class="nav-item nav-link"
				href="categories">Categories</a></li>
		</ul>
	</nav>


	<div id="formprod" class="cadre">
		<f:form modelAttribute="produit" action="saveProd" method="post"
			enctype="multipart/form-data">
			<table>
				<tr>
					<td>ID Produit:</td>
					<td>${produit.idProduit}<f:input type="hidden"
							path="idProduit" /></td>
					<td><f:errors path="idProduit"></f:errors></td>
				</tr>
				<tr>
					<td>Nom Produit</td>
					<td><f:input path="designation" /></td>
					<td><f:errors path="designation"></f:errors></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><f:textarea path="description" /></td>
					<td><f:errors path="description"></f:errors></td>
				</tr>
				<tr>
					<td>Quantité</td>
					<td><f:input path="quantite" /></td>
					<td><f:errors path="quantite"></f:errors></td>
				</tr>
				<tr>
					<td>Prix</td>
					<td><f:input path="prix" /></td>
					<td><f:errors path="prix"></f:errors></td>
				</tr>

				<tr>
					<td>Catégorie</td>
					<td><f:select path="categorie.idCategorie">
							<c:forEach items="${categories}" var="cat">
								<OPTION value="${cat.idCategorie}">${cat.nomCategorie}</OPTION>
							</c:forEach>
						</f:select></td>
					<%-- 		<td> <f:select path="categorie.idCategorie" items="${categories}" itemValue="idCategorie" itemLabel="nomCategorie"></f:select> --%>
					<!-- 			</td> -->
				</tr>

				<tr>
					<td>Photo</td>
					<td><input type="file" name="file"></td>
					<c:if test="${produit.idProduit!=null}">
						<td><img src="photoProd?id=${produit.idProduit}"></td>
						<td><input type="hidden" name="photo" value="photo"></td>
					</c:if>
				</tr>
				<tr>
					<td><input type="hidden" name="selectionne" value="false"></td>
				</tr>


				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</f:form>
	</div>

	<div id="tabProduits" class="cadre">
		<table class="tabStyle1">
			<tr>
				<th>ID</th>
				<th>CATEGORIE</th>
				<th>NOM PROD</th>
				<th>DESCRIPTION</th>
				<th>PHOTO</th>
				<th>QUANTITE</th>
				<th>PRIX</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${produits}" var="prod">
				<tr>
					<td>${prod.idProduit}</td>
					<td>${prod.categorie.getNomCategorie()}</td>
					<td>${prod.designation}</td>
					<td>${prod.description}</td>
					<td><img src="photoProd?id=${prod.idProduit}"></td>
					<td>${prod.quantite}</td>
					<td>${prod.prix}</td>
					<td><a href="suppProd?idProd=${prod.idProduit}"
							class="btn btn-danger"><span
								class="glyphicon glyphicon-trash"></span></a>
					<a href="editProd?idProd=${prod.idProduit}" class="btn btn-primary"><span class="glyphicon glyphicon-wrench"></span>Edit</a></td>
					
				</tr>
			</c:forEach>


		</table>
	</div>
	<div align="right">
		<a href="impression">Export</a>
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