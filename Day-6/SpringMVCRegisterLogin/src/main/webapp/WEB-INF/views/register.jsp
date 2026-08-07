<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

<h2>User Registration</h2>

<form action="registerUser" method="post">

    Name :
    <input type="text" name="name">

    <br><br>

    Email :
    <input type="email" name="email">

    <br><br>

    Password :
    <input type="password" name="password">

    <br><br>

    <input type="submit" value="Register">

</form>

</body>
</html>