<%-- 
    Document   : arithmeticCalculator
    Created on : 28-Jan-2023, 10:46:15 PM
    Author     : howard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        First: <input type="text" name="number1" value="${number1}"><br>
        Second: <input type="text" name="number2" value="${number2}"><br>
        <input type="submit" value="+">
        <input type="submit" value="-">
        <input type="submit" value="*">
        <input type="submit" value="%"><br><br>
        <p><i>Result: ${message}</i></p>
        <a href="age">Aga Calculator</a>
        
    </body>
</html>
