<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script type="text/javascript">
	function validateForm() {
		var username = document.forms["loginForm"]["username"].value;
		var password = document.forms["loginForm"]["password"].value;
		if ((username == "" || username == null)
				&& (password == "" || password == null)) {
			alert("username and password are required");
			return false;
		} else if (username == "" || username == null) {
			alert("username is required");
			return false;
		} else if (password == "" || password == null) {
			alert("password is required");
			return false;
		} else 
			return true;
	}
</script>
</head>
<body>
	<h1 align="center">Welcome! Please Login to continue</h1>
	<form:form method="post" modelAttribute="user" action="login"
		name="loginForm" onsubmit="return validateForm()">
		<table align="center">
			<tbody>
				<tr>
					<td colspan="2" align="center"><font color="red">
							${error}</font></td>
				</tr>
				<tr>
					<td>Username:</td>
					<td><form:input path="username" id="username" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" id="password"></form:password>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Login"></td>
				</tr>

			</tbody>
		</table>
	</form:form>
</body>
</html>