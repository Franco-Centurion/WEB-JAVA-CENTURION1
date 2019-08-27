<%-- 
    Document   : PantallaPrincipal
    Created on : 15-ago-2019, 14:47:23
    Author     : DesarrolloWeb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pantalla Principal</h1>
        <h1>Bienvenido<%= request.getParameter("nombre") %></h1>
        <h2>el numero es:<%=request.getParameter("numero")%> </h2>
        <h2>la cantidad de intentos es= <%= request.getParameter("intento")%> </h2>
                
    </body>
</html>
