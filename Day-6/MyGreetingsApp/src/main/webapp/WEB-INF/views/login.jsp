<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Login - My Greetings App</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

    <h1>My Greetings App</h1>

    <h2>Login</h2>

    <!-- Login Error -->
    <% if (request.getAttribute("error") != null) { %>

        <p class="error">
            <%= request.getAttribute("error") %>
        </p>

    <% } %>

    <form action="${pageContext.request.contextPath}/login" method="post">

        <label for="username">Username:</label>

        <input type="text"
               id="username"
               name="username"
               required>

        <br><br>

        <label for="password">Password:</label>

        <input type="password"
               id="password"
               name="password"
               required>

        <br><br>

        <button type="submit">Login</button>

    </form>

    <br>

    <a href="${pageContext.request.contextPath}/register">
        Don't have an account? Register
    </a>

</div>

</body>

</html>