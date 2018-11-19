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

<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<title>Page Categories</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<ul class="nav nav-pills" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item nav-link" href="admin">Accueil</a></li>

			<li role="presentation"><a class="nav-item nav-link"
				href="produits">Produits</a></li>
		</ul>
	</nav>


	<div id="formCat" class="cadre">
		<f:form modelAttribute="categorie" action="saveCat" method="post"
			enctype="multipart/form-data">
			<table>
				<tr>
					<td>
					<c:if test="${categorie.idCategorie!=null}">
						<td>ID Catégorie:</td>
					</c:if>				
					<td>${categorie.idCategorie}<f:input type="hidden"
							path="idCategorie" /></td>
					<td><f:errors path="idCategorie"></f:errors></td>
				</tr>
				<tr>
					<td>Nom Catégorie</td>
					<td><f:input path="nomCategorie" /></td>
					<td><f:errors path="nomCategorie"></f:errors></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><f:textarea path="description" /></td>
					<td><f:errors path="description"></f:errors></td>
				</tr>

				<tr>
					<td>Photo</td>
					<c:if test="${categorie.idCategorie!=null}">
						<td><img src="photoCat?id=${categorie.idCategorie}"></td>
					</c:if>
					<td><input type="file" name="file"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</f:form>
	</div>

	<div id="tabCategories" class="cadre">
		<table class="tabStyle1">
			<tr>
				<th>ID</th>
				<th>NOM CAT</th>
				<th>DESCRIPTION</th>
				<th>PHOTO</th>
				<th></th>
				
			</tr>
			<c:forEach items="${categories}" var="cat">
				<tr>
					<td>${cat.idCategorie}</td>
					<td>${cat.nomCategorie}</td>
					<td>${cat.description}</td>
					<td><img src="photoCat?id=${cat.idCategorie}"></td>
					
					<td><a href="suppCat?idCat=${cat.idCategorie}"
							class="btn btn-danger"><span
								class="glyphicon glyphicon-trash"></span></a>
					<a href="editCat?idCat=${cat.idCategorie}" class="btn btn-primary"><span class="glyphicon glyphicon-wrench"></span>Edit</a></td>
					
				</tr>
			</c:forEach>


		</table>
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