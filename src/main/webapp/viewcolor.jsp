<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/29/23
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            <%--background-color: <%= request.getParameter("backgroundColor") %>;--%>
            background-color: ${backgroundColor};
        }
    </style>
    <title>viewcolor</title>
</head>
<body>
    <h1>View Color</h1>
    <h2>Your color is ${backgroundColor}</h2>

</body>
</html>
