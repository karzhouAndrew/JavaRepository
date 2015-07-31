
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Registration form</h1>
<form action="RegistrationServlet" method="get">
    <span>Enter you name:</span>
    <input type="text" name="name" placeholder="Name" required><br>
    <span>Enter you e-mail:</span>
    <input type="email" name="e-mail" placeholder="e-mail" pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"><br>
    <span>Enter you telephone number:</span>
    <input type="text" name="telephone" placeholder=" 375 29 123 45 67" pattern="[0-9]{12}"><br>
    <input type="submit" value="Send">
</form>
</body>
</html>
