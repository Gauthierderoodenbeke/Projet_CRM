<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style2.css">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="//fonts.googleapis.com/css?family=Lobster" />
<link rel="stylesheet" type="text/css"
	href="//http://online-free-tools.com/fr/bootstrap_navbar_css_customiser_generateur/EE4643-FFFFFF-FFFFFF-000000" />
<link rel="stylesheet" type="text/css"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>


<title><spring:message code="accueil.clients" /></title>
</head>
<body>

	<!------------------------ BARRE DE NAVIGAT -------------------------------->
	<nav class="navbar navbar-rouge">
		<ul class="nav navbar-nav" role="tablist">
			<li role="presentation" class="active"><a
				class="nav-item navbar-link:hover" href="accueil"><spring:message
						code="navbar.retour" /></a></li>
		</ul>
	</nav>
	<!-------------------------------------------------------------------------->

	<div class="container-fluid">

		<!--------------------------- IMAGE GAUCHE ---------------------------------->
		<div class="col-md-2">
			<img alt=""
				src="https://nsa39.casimages.com/img/2018/11/22/181122100543363291.jpg">
			<br> <br> <br> <br> <br> <br> <img
				alt=""
				src="https://nsa39.casimages.com/img/2018/11/22/181122100630255004.png"
				width="80%">
		</div>
		<!-------------------------------------------------------------------------->

		<div class="col-md-8">
			<!-------------------------------FORMULAIRE AJOUT CLIENT-------------------->




			<div align="center">
				<div class="form-style-3" align="center">
					<f:form modelAttribute="particulier" action="choixp">
						<label> <span></span><input type="submit"
							value="Particulier" />
						</label>
					</f:form>

					<f:form modelAttribute="entreprise" action="choixe">
						<label> <span></span><input type="submit"
							value="Entreprise " />
						</label>
					</f:form>

					<c:choose>
						<c:when test="${client.idClient eq null}">
							
								<c:if test="${client.familleClient eq 'entreprise'}">
								<f:form modelAttribute="client" action="saveEntreprise">
									<fieldset>
										<legend>
											<spring:message code="client.ajoutE" />
										</legend>

										<label for="field1"> <span><spring:message
													code="client.coordPref" /><span class="required"></span></span> <f:input
												path="coordPrefere" class="input-field" />

										</label> <label for="field2"> <span><spring:message
													code="client.niveauC" /><span class="required"></span></span> <f:input
												path="niveauClient" class="input-field" />

										</label> <label for="field3"> <span><spring:message
													code="client.idFisc" /><span class="required"></span></span> <f:input
												path="idFiscal" class="input-field" />

										</label> <label for="field4"> <span><spring:message
													code="client.raisonSocE" /><span class="required"></span></span>
											<f:input path="raisonSociale" class="input-field" />

										</label> <label for="field5"> <span><spring:message
													code="client.dateCreaE" /><span class="required"></span></span> <f:input
												path="dateCreation" class="input-field" type="date"/>

										</label> <label for="field6"> <span><spring:message
													code="client.nombreEmp" /><span class="required"></span></span> <f:input
												path="nbEmployes" class="input-field" />

										</label> <label for="field7"> <span><spring:message
													code="client.formeJE" /><span class="required"></span></span> <f:input
												path="formeJuridique" class="input-field" />

										</label> <label for="field8"> <span><spring:message
													code="client.capital" /><span class="required"></span></span> <f:input
												path="capital" class="input-field" />

										</label> <label for="field9"> <span><spring:message
													code="client.LogoE" /><span class="required"></span></span> <f:input
												path="sigle" class="input-field" />

										</label> <label> <span></span><input type="submit" value="">
											<spring:message code="client.subAdd" /></input>
										</label>
									</fieldset>
									</f:form>
								</c:if>

								<!-- Deuxieme if -->
								<c:if test="${client.familleClient eq 'particulier'}">
								<f:form modelAttribute="client" action="saveParticulier">
									<fieldset>
										<legend>
											<spring:message code="client.ajoutP" />
										</legend>

										<label for="field1"> <span><spring:message
													code="client.coordPref" /><span class="required"></span></span> <f:input
												path="coordPrefere" class="input-field" />

										</label> <label for="field2"> <span><spring:message
													code="client.niveauC" /><span class="required"></span></span> <f:input
												path="niveauClient" class="input-field" />

										</label> <label for="field3"> <span><spring:message
													code="client.numSecu" /><span class="required"></span></span> <f:input
												path="numSecu" class="input-field" />

										</label> <label for="field4"> <span><spring:message
													code="client.nom" /><span class="required"></span></span> <f:input
												path="nom" class="input-field" />

										</label> <label for="field5"> <span><spring:message
													code="client.prenom" /><span class="required"></span></span> <f:input
												path="prenom" class="input-field" />

										</label> <label for="field6"> <span><spring:message
													code="client.dateNaiss" /><span class="required"></span></span> <f:input
												path="dateNaissance" class="input-field" />

										</label> <label for="field7"> <span><spring:message
													code="client.enfants" /><span class="required"></span></span> <f:input
												path="nbEnfants" class="input-field" />

										</label> <label for="field8"> <span><spring:message
													code="client.situationFam" /><span class="required"></span></span>
											<f:input path="situationFam" class="input-field" />

										</label> <label for="field9"> <span><spring:message
													code="client.catSocio" /><span class="required"></span></span> <f:input
												path="catSocio" class="input-field" />

										</label> <label for="field10"> <span><spring:message
													code="client.age" /><span class="required"></span></span> <f:input
												path="age" class="input-field" />

										</label> <label for="field11"> <span></span><input
											type="submit"> <spring:message code="client.subAdd" /></input>
										</label>
									</fieldset>
									</f:form>
								</c:if>

							
						</c:when>
						<c:otherwise>

							<c:if test="${client.familleClient eq 'entreprise'}">
								<f:form modelAttribute="client" action="editEnt">
									<fieldset>
										<legend>
											<spring:message code="client.editE" />
										</legend>

										<f:input path="idClient" type="hidden" value="${idClient}" />

										<label for="field1"> <span><spring:message
													code="client.coordPref" /><span class="required"></span></span> <f:input
												path="coordPrefere" class="input-field" />

										</label> <label for="field2"> <span><spring:message
													code="client.niveauC" /><span class="required"></span></span> <f:input
												path="niveauClient" class="input-field" />

										</label> <label for="field3"> <span><spring:message
													code="client.idFisc" /><span class="required"></span></span> <f:input
												path="idFiscal" class="input-field" />

										</label> <label for="field4"> <span><spring:message
													code="client.raisonSocE" /><span class="required"></span></span>
											<f:input path="raisonSociale" class="input-field" />

										</label> <label for="field6"> <span><spring:message
													code="client.nombreEmp" /><span class="required"></span></span> <f:input
												path="nbEmployes" class="input-field" />

										</label> <label for="field7"> <span><spring:message
													code="client.formeJE" /><span class="required"></span></span> <f:input
												path="formeJuridique" class="input-field" />

										</label> <label for="field8"> <span><spring:message
													code="client.capital" /><span class="required"></span></span> <f:input
												path="capital" class="input-field" />

										</label> <label for="field9"> <span><spring:message
													code="client.LogoE" /><span class="required"></span></span> <f:input
												path="sigle" class="input-field" />

										</label> <label> <span></span><input type="submit"> <spring:message
												code="client.subEdi" /></input>



										</label>
									</fieldset>
								</f:form>
							</c:if>

							<!-- Deuxieme if -->
							<c:if test="${client.familleClient eq 'particulier'}">
								<f:form modelAttribute="client" action="editPart">
									<fieldset>
										<legend>
											<spring:message code="client.editP" />
										</legend>

										<f:input path="idClient" type="hidden" value="${idClient}" />

										<label for="field1"> <span><spring:message
													code="client.coordPref" /><span class="required"></span></span> <f:input
												path="coordPrefere" class="input-field" />

										</label> <label for="field2"> <span><spring:message
													code="client.niveauC" /><span class="required"></span></span> <f:input
												path="niveauClient" class="input-field" />

										</label> <label for="field3"> <span><spring:message
													code="client.numSecu" /><span class="required"></span></span> <f:input
												path="numSecu" class="input-field" />

										</label> <label for="field4"> <span><spring:message
													code="client.nom" /><span class="required"></span></span> <f:input
												path="nom" class="input-field" />

										</label> <label for="field5"> <span><spring:message
													code="client.prenom" /><span class="required"></span></span> <f:input
												path="prenom" class="input-field" />

										</label> <label for="field7"> <span><spring:message
													code="client.enfants" /><span class="required"></span></span> <f:input
												path="nbEnfants" class="input-field" />

										</label> <label for="field8"> <span><spring:message
													code="client.situationFam" /><span class="required"></span></span>
											<f:input path="situationFam" class="input-field" />

										</label> <label for="field9"> <span><spring:message
													code="client.catSocio" /><span class="required"></span></span> <f:input
												path="catSocio" class="input-field" />

										</label> <label for="field10"> <span><spring:message
													code="client.age" /><span class="required"></span></span> <f:input
												path="age" class="input-field" />

										</label> <label for="field11"> <span></span><input
											type="submit"> <spring:message code="client.subEdi" /></input>
										</label>
									</fieldset>
								</f:form>
							</c:if>


						</c:otherwise>
					</c:choose>
				</div>
			</div>

	<br>
	<br>
	<br>

			<!------------------------------ TABLEAU ENTREPRISES -------------------------------------------->

			<%-- <f:form modelAttribute="client" action="saveClient" method="post"> --%>
			<div id="tabEntreprises" class="cadre" align="center">
				<table class="customers">
					<tr>

						<th><spring:message code="client.coordPref" /></th>
						<th><spring:message code="client.niveauC" /></th>
						<th><spring:message code="client.idFisc" /></th>
						<th><spring:message code="client.raisonSocE" /></th>
						<th><spring:message code="client.dateCreaE" /></th>
						<th><spring:message code="client.nombreEmp" /></th>
						<th><spring:message code="client.formeJE" /></th>
						<th><spring:message code="client.capital" /></th>
						<th><spring:message code="client.LogoE" /></th>


					</tr>
					<c:forEach items="${listEntr}" var="entr">
						<tr>

							<td>${entr.coordPrefere}</td>
							<td>${entr.niveauClient}</td>
							<td>${entr.idFiscal}</td>
							<td>${entr.raisonSociale}</td>
							<td>${entr.dateCreation}</td>
							<td>${entr.nbEmployes}</td>
							<td>${entr.formeJuridique}</td>
							<td>${entr.capital}</td>
							<td>${entr.sigle}</td>
							<td><a href="suppClient?idClient=${entr.idClient}"
								class="btn btn-danger"><span
									class="glyphicon glyphicon-trash"></span></a> <a
								href="editionEnt?idClient=${entr.idClient}"
								class="btn btn-primary"><span
									class="glyphicon glyphicon-wrench"></span>Edit</a></td>

						</tr>
					</c:forEach>


				</table>
			</div>
			<%-- </f:form> --%>
<br>
<br>
<br>
			<!-- 	---------------------------- TABLEAU PARTICULIER ------------------------------------------ -->


			<div id="tabParticulier" class="cadre" align="center">
				<table class="customers">
					<tr>

						<th><spring:message code="client.coordPref" /></th>
						<th><spring:message code="client.niveauC" /></th>
						<th><spring:message code="client.numSecu" /></th>
						<th><spring:message code="client.nom" /></th>
						<th><spring:message code="client.prenom" /></th>
						<th><spring:message code="client.dateNaiss" /></th>
						<th><spring:message code="client.enfants" /></th>
						<th><spring:message code="client.situationFam" /></th>
						<th><spring:message code="client.catSocio" /></th>
						<th><spring:message code="client.age" /></th>


					</tr>
					<c:forEach items="${listPart}" var="part">
						<tr>

							<td>${part.coordPrefere}</td>
							<td>${part.niveauClient}</td>
							<td>${part.numSecu}</td>
							<td>${part.nom}</td>
							<td>${part.prenom}</td>
							<td>${part.dateNaissance}</td>
							<td>${part.nbEnfants}</td>
							<td>${part.situationFam}</td>
							<td>${part.catSocio}</td>
							<td>${part.age}</td>
							<td><a href="suppClient?idClient=${entr.idClient}"
								class="btn btn-danger"><span
									class="glyphicon glyphicon-trash"></span></a> <a
								href="editionPart?idClient=${part.idClient}"
								class="btn btn-primary"><span
									class="glyphicon glyphicon-wrench"></span>Edit</a></td>

						</tr>
					</c:forEach>


				</table>
			</div>



		</div>



		<!---------------------------IMAGE DROITE ---------------------------------->
		<div class="col-md-2">
			<img alt=""
				src="https://nsa39.casimages.com/img/2018/11/22/181122100630255004.png"
				width="80%"> <br> <br> <br> <br> <br>
			<br> <img alt=""
				src="https://nsa39.casimages.com/img/2018/11/22/181122100829654656.png"
				width="110%">
		</div>
		<!-------------------------------------------------------------------------->



	</div>


	<!---------------------------- FOOTER -------------------------------------->
	<div class="container-fluid footer" align="center">
		<br> <br> <br> <br> <br> <br> <br>
		<br>
		<div class="footer2">
			<a href="${pageContext.request.contextPath}/en/"><img alt=""
				src="http://image.noelshack.com/fichiers/2018/47/4/1542886624-drapeaua.jpg"></a>
			<a href="${pageContext.request.contextPath}/fr/"><img alt=""
				src="http://image.noelshack.com/fichiers/2018/47/4/1542886624-drapeaufrance.jpg"></a>

			<br> <a href="<%=request.getContextPath()%>/home"><spring:message
					code="footer.deconnexion" /></a> <br> <br> <br>

			<p align="center">&copy; Le royaume de la gourmandise 2018</p>
		</div>
	</div>
	<!-------------------------------------------------------------------------->
</body>
</html>