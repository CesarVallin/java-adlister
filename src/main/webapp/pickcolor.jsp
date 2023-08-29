<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/29/23
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pickcolor</title>
</head>
<body>
  <h1>Pick a color</h1>
  <form method="POST" action="/viewcolor">
    <input type="text" placeholder="Enter a color" name="colorInput">
    <button type="submit">Submit</button>
  </form>
</body>
</html>
