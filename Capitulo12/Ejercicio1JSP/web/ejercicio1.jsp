<%-- 
    Document   : ejercicio1
    Created on : 29-abr-2015, 8:48:52
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
        <h1>Hello World!</h1>
         <%
        String nombre = "Rafa";
        out.println("<h1>Datos Personales de " + nombre + "</h1>");
        out.println("<b> Rafael Gonzalez Rojo</b>");
        out.println("<i> vive en Málaga </i>");
        out.println("<h2>Tipo Sanguineo: 0+</h2>");
        
        
        %>
        
        
    </body>
</html>
