<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/28/23
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<% if (request.getMethod().equalsIgnoreCase("POST"))  {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
        response.sendRedirect("/profile.jsp");
    }
}%>

<%--<c:if test="${param.username.equalsIgnoreCase('admin')}">--%>
<%--    --%>

<%--</c:if>--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="POST" action="/login.jsp">
        <label for="username">Username</label>
        <input type="text" name="username" id="username" placeholder="Enter your username">
        <label for="password">Password</label>
        <input type="text" name="password" id="password" placeholder="Enter your password">
        <button type="submit">Submit</button>
    </form>

</body>
</html>
