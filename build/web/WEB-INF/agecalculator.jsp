<%-- 
    Document   : agecalculator
    Created on : 4-Feb-2022, 8:09:47 PM
    Author     : timgo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="Calculators" >
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <br><br>
           
            <input type="submit" value="Age next birthday">   
        </form>
        <p>${message}</p>
    </body>
</html>
