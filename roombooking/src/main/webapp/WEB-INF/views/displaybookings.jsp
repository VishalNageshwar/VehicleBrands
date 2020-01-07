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
<form action="/showbookingdetails" method="post">
<div class="form-group">
			<table>
				<tr align="center">
					<td>User</td>
					<td><select name="userName">
							<c:forEach var="user" items="${user}">
								<option value="${user.userName}">${user.userName}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			</div>
			<button type="submit" class="btn btn-primary">ShowDetails</button>
			</form>

</body>
</html>