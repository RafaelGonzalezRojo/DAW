<%-- 
    Document   : euroconver
    Created on : 29-abr-2015, 10:32:39
    Author     : alumno
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
              <% request.setCharacterEncoding("UTF-8"); %>
        <h3> tu cantidad enviada es: </h3>
<% out.print(request.getParameter("euro") + " €");%>
<% double euro1java = 0; %>
  <%    euro1java = Double.parseDouble(request.getParameter("euro"));    %> 
  
  <% double resultado = 0;
  
  
  resultado = euro1java * 166.39;
  
  %>
            <h3> La con version a pesetas es: </h3>
            <%
DecimalFormat formatoPesetas = new DecimalFormat("0.00");
out.print(formatoPesetas.format(resultado) + " pesetas.");
         %>   
  
  
  
    </body>
</html>
