<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/updatebooking" method="post">
		<div class="form-group">
			<table>
				<tr align="center">
					<td>User</td>
					<td><select name="bookingId">
							<c:forEach var="book" items="${booking}">
								<option value="${book.bookingId}">${book.bookingId}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			</div>
			<div class="form-group">
			<label for="">bookingFrom</label> <input type="text"
				class="form-control" id="bookingFrom" name="bookingFrom"
				placeholder="Booking from">
		</div>
		<div class="form-group">
			<label for="">bookingTo</label> <input type="text"
				class="form-control" id="bookingTo"
				name="bookingTo" placeholder="Booking To">
		</div>
		<div class="form-group">
			<label for="">DateOfJourney</label> <input type="date"
				class="form-control" id="DOJ" name="DOJ"
				placeholder="Enter date of journey">
		</div>
		<div class="form-group">
			<label for="">bookingDistance</label> <input type="number"
				class="form-control" id="bookingDistance" name="bookingDistance"
				placeholder="Enter booking distance">
		</div>
		<button type="submit" class="btn btn-primary">UpdateDetails</button>
	</form>


</body>
</html>