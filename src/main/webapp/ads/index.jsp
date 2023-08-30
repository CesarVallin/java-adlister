<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/30/23
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>All daos.Ads</title>
</head>
<body>
    <h1>All ads</h1>
    <ul>
        <c:forEach var="ad" items="${ads}">
            <li>${ad.title}: ${ad.description}</li>
        </c:forEach>
    </ul>

</body>
</html>
