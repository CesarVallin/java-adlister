<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/28/23
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%! int customers = 0;
    boolean methodIsGet = false;
%> <!-- Declare variables -->
<% customers ++;
    if (request.getMethod().equalsIgnoreCase("GET")) {
        methodIsGet = true;
    }
%> <!-- Java logic  & implicit objects -->
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp"%> <!-- We are pulling a template from somewhere else (only for JSP files)-->
    <h1>We have had <%= customers %> customers visit our shop!</h1> <!-- Think of this as template literal -->
<%-- this is a JSP comment, you will *not* see this in the html  --%>
<!-- this is an HTML comment, you will see this in the html -->

    <p>The coffee parameter is currently ${param.coffee}</p> <!-- Implicit objects, expression language -->
    <p>The method is get> <%= methodIsGet %></p>

    <form method="POST" action="coffee-example.jsp"> <!-- This is a post form to the same page -->
        <input type="text" name="coffeename" placeholder="Enter a coffee">
        <input type="text" name="username" placeholder="Enter your name">
        <label for="caramel-checkbox"></label>
        <input type="checkbox" id="caramel-checkbox" name="addons" value="Caramel">
        <label for="creamer-checkbox">Creamer</label>
        <input type="checkbox" id="creamer-checkbox" name="addons" value="Creamer">
        <label for="sugar">Sugar</label>
        <input type="checkbox" id="sugar" name="addons" value="Sugar">
        <button type="submit">Submit</button>
    </form>

    <!-- JSTL portion -->
    <!-- If else -->
    <c:choose>
        <c:when test="${param.coffeename != null}">
            <c:if test="${param.coffeename != null}">
                <p>Coffee chosen: ${param.coffeename}</p>
            </c:if>
            <c:if test="${param.username != null}">
                <p>User: ${param.username}</p>
            </c:if>
            <c:if test="${paramValues.addons != null}">
                <c:forEach var="addon" items="${paramValues.addons}"> <!-- You get into the loop and you declare a variable that represents a single value within that collection -->
                    <p>${addon}</p> <!-- Single value in the collection being accessed. -->
                </c:forEach>
            </c:if>
        </c:when>
        <c:otherwise>
            <p>please fill out the form</p>
        </c:otherwise>
    </c:choose>





<script src="example.js"></script>
</body>
</html>
