<%-- 
    Document   : notas
    Created on : 29-abr-2015, 9:56:15
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
         <% request.setCharacterEncoding("UTF-8"); %>
        <h3> tu primera nota es: </h3>
<% out.print(request.getParameter("nota1"));%>
<% int nota1java = 0; %>
  <%    nota1java = Integer.parseInt(request.getParameter("nota1"));    %>      
 <% request.setCharacterEncoding("UTF-8"); %>
        <h3> tu segunda nota es: </h3>
<% out.print(request.getParameter("nota2"));%>
<% int nota2java = 0; %>
  <%    nota2java = Integer.parseInt(request.getParameter("nota2")); %>
  <% request.setCharacterEncoding("UTF-8"); %>
        <h3> tu tercera nota es: </h3>
<% out.print(request.getParameter("nota3"));%>
        <% int nota3java = 0; %>
  <%    nota3java = Integer.parseInt(request.getParameter("nota3")); %>

<%
int suma = 0;  
suma = nota1java + nota2java + nota3java;

out.println("<h1>la suma total es:  " + suma + "</h1>");


double media = 0;

media = suma / 3;

out.println("<h1>la media de las notas es:  " + media + "</h1>");

%>




    </body>
</html>
