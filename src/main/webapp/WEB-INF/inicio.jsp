<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="cl.dojo.models.Estudiante" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
	

</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><h2>Estudiantes</h2></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
       </ul>
     </div>
  </div>
</nav>

<div class="container" style="margin-top: 30px">
	<div class="row">
		<div class="col-sm-3"></div>
	</div>
		<br>
	
<div class="row">
	<form action="home" method="post">
		<div class="col-sm-3">
			<label><h3>Curso</h3></label> <select class="form-select"
				aria-label="Default select example" name="curso">
					<option selected value=0>Elija un Curso</option>
						<c:forEach items="${cursos}" var="elemento">
							<option value="<c:out value="${elemento.codigoCurso}"/>">
							<c:out value="${elemento.codigoCurso}" /></option>
					    </c:forEach>
			</select> <br>
		</div>
			<br>

<div class="col-sm-3">
	<label><h3>Region</h3></label> <select class="form-select"
		aria-label="Default select example" name="region">
			<option selected value=0>Elija una Region</option>
				<c:forEach items="${regiones}" var="elemento">
					<option value="<c:out value="${elemento.codigoRegion}"/>">
					<c:out value="${elemento.nombre}" /></option>
			    </c:forEach>
	</select> <br> <br>
		<button type="submit" class="btn btn-secondary btn-lg">Filtrar</button>
</div>
	<br>
	</form>
	
<div class="col-sm-12">
	<div class="table-responsive">
		<br>
			<table class="table table-dark table-striped">
				<thead>
					<tr>
						<th scope="col">Rut</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido Paterno</th>
						<th scope="col">Apellido Materno</th>
						<th scope="col">Código Curso</th>
						<th scope="col">Descripción Curso</th>
					</tr>
				</thead>
					<tbody>
						<c:forEach items="${regioncursos}" var="elemento">
							<tr>
								<td><c:out value="${elemento.rut}" /></td>
								<td><c:out value="${elemento.nombre}" /></td>
								<td><c:out value="${elemento.apellidoPat}" /></td>
								<td><c:out value="${elemento.apellidoMat}" /></td>
								<td><c:out value="${elemento.codigoCurso}" /></td>
								<td><c:out value="${elemento.descripcion}" /></td>
							</tr>
						</c:forEach>
					</tbody>
			</table>
	</div>
</div>
</div>
</div>
</body>
</html>