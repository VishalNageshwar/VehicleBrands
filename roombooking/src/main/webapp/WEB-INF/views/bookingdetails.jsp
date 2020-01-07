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
<form action="/update" method="post">
<table>
<tr>
<th>BookingID</th>
<th>BookingFrom</th>
<th>BookingTo</th>
<th>DateOFJourney</th>
<th>Distance</th>
<th>bookingPrice</th>
</tr>
<c:forEach var="B" items="${booking}">
<tr>
<td>${B.bookingId}</td>
<td>${B.bookingFrom}</td>
<td>${B.bookingTo}</td>
<td>${B.DOJ}</td>
<td>${B.bookingDistance}</td>
<td>${B.bookingPrice}</td>
</c:forEach>
</table>
<h1 style="color: royalblue" align="center">
			<a href="/updatedetails">update</a>
		</h1>
</form>
</body>
</html>