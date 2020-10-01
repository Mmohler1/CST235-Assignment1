<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Form</title>
</head>
<body>
		<form method="POST" action="TestServlet">
			First Name: <input type="text" name="firstname"/><br> <!-- Input for first name -->
			Last Name: <input type="text" name="lastname"/><br>   <!-- Input for last name -->
			<input type="submit" name="Submit"/>
		</form>
</body>
</html>