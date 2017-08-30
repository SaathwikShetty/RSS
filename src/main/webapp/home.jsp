<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<div align="center"></div>
	<h1>Login Page</h1>
	<center>
		<h2>Signup Details</h2>
		<form action="LoginCheck.jsp" method="post">
			<br />Username:<input type="text" name="username"> <br />Password:<input
				type="password" name="password"> <br />
			<input type="submit" value="Submit">
		</form>
	</center>
</body>
</html>

Read more:
http://mrbool.com/how-to-create-a-login-form-with-jsp/25685#ixzz4pLFNjOXR
