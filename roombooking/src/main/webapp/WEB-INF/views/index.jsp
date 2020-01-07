<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<title>Title</title>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body { .this { background-image:url('banner.jpg');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	background-size: 100%;
	/* Set a specific height */
	min-height: 500px;
	/* Create the parallax scrolling effect */
	background-attachment: fixed;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

}
.header {
	background-color: green;
	padding: 30px;
	text-align: center;
	font-size: 35px;
	border: 3px solid rgb(4, 7, 0);
	color: rgb(0, 0, 0);
}
</style>
</head>
<body>


	<div class="this">
		<header>
			<h2 style="color: rgb(235, 78, 11)" align="center">Travel
				Booking</h2>
		</header>
		<form name="cust" action="/insertuser" method="post"
			onsubmit="alphanumeric(document.cust.userName)">

			<div class="form-group" align="center"></div>
			<div class="form-group" align="center">
				<label style="color: orangered" for="">USER NAME</label> <input
					type="text" class="form-control" id="userName" name="userName"
					placeholder="Enter user name">
			</div>
			<div class="form-group" align="center">
				<label style="color: orangered" for="">CUSTOMER AGE </label> <input
					type="number" class="form-control" id="userAge" name="userAge"
					placeholder="Enter user age">
			</div>
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br> <br> <br>
			<div align="center">
				<button type="submit" class="btn btn-primary">Register</button>
			</div>
			<br> <br>
		</form>
		<h1 style="color: royalblue" align="center">
			<a href="travellingbooking"><button>Booking</button></a>
		</h1>
		<h1 style="color: royalblue" align="center">
			<a href="bookingdetails"><button>ShowBooking's</button></a>
		</h1>
		
	</div>
	<script type="text/javascript">
		function alphanumeric(txt) {
			var letters = /^[0-9a-zA-Z]+$/;
			if (!txt.value.match(letters)) {

				alert('Please input alphanumeric characters only');
				document.cust.userName.focus();
				return true;

			} else {
				alert('Your registration is correct ');
				return false;
			}
			return false;
		}
	</script>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>