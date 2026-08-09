<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - My Greetings App</title>
</head>

<body>

    <h1>My Greetings App</h1>

    <h2>Register</h2>

    <!-- General Error -->
    <% if (request.getAttribute("error") != null) { %>
        <p style="color:red;">
            <%= request.getAttribute("error") %>
        </p>
    <% } %>

    <form action="${pageContext.request.contextPath}/register" method="post">

        <!-- Name -->
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"
               value="${user.name}">
        <br>

        <% if (request.getAttribute("errors") != null
                && ((java.util.Map)request.getAttribute("errors")).get("name") != null) { %>
            <span style="color:red;">
                <%= ((java.util.Map)request.getAttribute("errors")).get("name") %>
            </span>
        <% } %>

        <br><br>


        <!-- Email -->
        <label for="email">Email:</label>
        <input type="text" id="email" name="email"
               value="${user.email}">
        <br>

        <% if (request.getAttribute("errors") != null
                && ((java.util.Map)request.getAttribute("errors")).get("email") != null) { %>
            <span style="color:red;">
                <%= ((java.util.Map)request.getAttribute("errors")).get("email") %>
            </span>
        <% } %>

        <br><br>


        <!-- Username -->
        <label for="username">Username:</label>
        <input type="text" id="username" name="username"
               value="${user.username}">
        <br>

        <% if (request.getAttribute("errors") != null
                && ((java.util.Map)request.getAttribute("errors")).get("username") != null) { %>
            <span style="color:red;">
                <%= ((java.util.Map)request.getAttribute("errors")).get("username") %>
            </span>
        <% } %>

        <br><br>


        <!-- Password -->
        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <br>

        <% if (request.getAttribute("errors") != null
                && ((java.util.Map)request.getAttribute("errors")).get("password") != null) { %>
            <span style="color:red;">
                <%= ((java.util.Map)request.getAttribute("errors")).get("password") %>
            </span>
        <% } %>

        <br><br>


        <button type="submit">Register</button>

    </form>

    <br>

    <a href="${pageContext.request.contextPath}/login">
        Already have an account? Login
    </a>

</body>
</html>