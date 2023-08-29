<%--
  Created by IntelliJ IDEA.
  User: cesarvallin
  Date: 8/29/23
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pizza-order</title>
</head>
<body>
    <form action="/pizza-order" method="POST">
        <div>
            <h2>Crust</h2>
            <select id="crustType" name="crustType">
                <option></option>
                <option value="thinCrust">Thin Crust</option>
                <option value="regularCrust">Regular Crust</option>
            </select>
        </div>

        <div>
            <h2>Select your sauce</h2>
            <select id="sauceType" name="sauceType">
                <option></option>
                <option value="tomato">Tomato</option>
                <option value="marinara">Marinara</option>
                <option value="alfredo">Alfredo</option>
            </select>
        </div>

        <div>
            <h2>Toppings</h2>
            <input type="checkbox" id="green-peppers" name="toppings" value="green-peppers">
            <label for="green-peppers">Green Peppers</label>

            <input type="checkbox" id="meatballs" name="toppings" value="meatballs">
            <label for="meatballs">Meatballs</label>

            <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
            <label for="pepperoni">Meatballs</label>
        </div>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
