<%--
alumno: Rafael Gonzalez Rojo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="ejercicio2css.css"> 
    </head>
    <body>
        <h1>Ejercicio 2</h1>
        
        <div id="caja">
          <%
        String nombre = "Rafa";
        out.println("<h1>Datos Personales de " + nombre + "</h1>");
        out.println("<b> Rafael Gonzalez Rojo</b>");
        out.println("<i> vive en Málaga </i>");
        out.println("<h2>Tipo Sanguineo: 0+</h2>");
       
        
        %>
        
         </div>
        
    </body>
</html>
