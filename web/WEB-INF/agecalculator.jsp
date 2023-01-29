<%-- 
    Document   : agecalculator
    Created on : 28-Jan-2023, 6:03:30 PM
    Author     : howard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aga Calculator</title>
    </head>
    <body>
        <h1>Aga Calculator</h1><br>
        <form method="post" action="age" >
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>    
            <p><i>${message}</i></p>
            <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
