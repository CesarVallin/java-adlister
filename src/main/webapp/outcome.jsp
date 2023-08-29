<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/29/23
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Outcome</title>
</head>
<body>
<h1>Hello from outcome</h1>
        <c:choose>
            <c:when test="${win}">
                <h1>You WON!</h1>
            </c:when>
            <c:otherwise>
                <h1>You LOST!</h1>
            </c:otherwise>
        </c:choose>


</body>
</html>
