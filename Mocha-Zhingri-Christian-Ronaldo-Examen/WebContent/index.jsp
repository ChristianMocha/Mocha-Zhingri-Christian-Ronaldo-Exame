<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<!-- Google Fonts -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.0/css/mdb.min.css"
	rel="stylesheet">
<title>Tickets</title>
</head>
<body>



	<div class="container">
		<!-- Material input -->
		<div class="md-form">
			<input type="text" id="form1" class="form-control"> <label
				for="form1">Cedula Cliente</label>
		</div>

		<!-- Material input -->
		<div class="md-form">
			<input type="text" id="form1" class="form-control"> <label
				for="form1">Placa Del Vehiculo</label>
		</div>

		<!-- Material input -->
		<div class="md-form">
			<input type="text" id="form1" class="form-control"> <label
				for="form1">Marca Del Vehiculo</label>
		</div>


		<!-- Material input -->
		<div class="md-form">
			<input type="text" id="form1" class="form-control"> <label
				for="form1">Modelo Del Vehiculo</label>
		</div>


		<!-- Material input -->
		<div class="md-form">
			<input type="text" id="form1" class="form-control"> <label
				for="form1">Numero Del Ticket</label>
		</div>



		<!-- Material input -->
		<div class="md-form">
			<input type="date"><label for="form1">Fecha de
				entrada</label>
		</div>

		<br>

		<!-- Material input -->
		<div class="md-form">
			<input type="time" name="hora"> <label for="form1">Hora
				de entrada</label>
		</div>



		<!-- Material input -->
		<div class="md-form">
			<input type="date"> <label for="form1">Fecha de
				Salida</label>
		</div>

		<br>

		<!-- Material input -->
		<div class="md-form">
			<input type="time" name="hora"> <label for="form1">Hora
				de Salida</label>
		</div>

		<button type="button" class="btn btn-dark">Consultar</button>


		<!-- JQuery -->
		<script type="text/javascript"
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<!-- Bootstrap tooltips -->
		<script type="text/javascript"
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
		<!-- Bootstrap core JavaScript -->
		<script type="text/javascript"
			src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
		<!-- MDB core JavaScript -->
		<script type="text/javascript"
			src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.0/js/mdb.min.js"></script>
</body>
</html>