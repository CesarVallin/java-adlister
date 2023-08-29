<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/29/23
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>guess</title>
</head>
<body>
<c:if test="${param.error == 'invalid'}">
  <h1>Invalid input </h1>
</c:if>

  <form method="POST" action="/guess">
    <label for="guessNumber">Guess a Number from 1 to 3</label>
    <input type="text" name="guessNumber" id="guessNumber">
    <button type="submit">Submit</button>
  </form>

</body>
</html>
