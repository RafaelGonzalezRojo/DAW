<%-- 
    Document   : ejercicio4
    Created on : 29-abr-2015, 9:54:34
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1>Pasanme la primera nota</h1>
                <form method="post" action="notas.jsp">

                        Por Favor introduzca su nota1:
                        <input type="text" name="nota1">
                        <br>
                        Por Favor introduzca su nota2:
                        <input type="text" name="nota2">
                        <br>

                        Por Favor introduzca su nota3:
                        <input type="text" name="nota3">
                        <input type="submit" value="OK">
                        <br>

                </form>
    </body>
</html>
