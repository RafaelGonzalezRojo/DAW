<%-- 
    Document   : nombre.jsp
    Created on : 29-abr-2015, 9:36:54
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
        <h3> tu nombre es: </h3>
<% out.print(request.getParameter("cadenaIntro"));%>
        
    </body>
</html>
