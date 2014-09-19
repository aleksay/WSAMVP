<%-- 
    Document   : AggiungiPiatto
    Created on : 18-set-2014, 14.45.30
    Author     : cloud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aggiungi Piatto</title>
    </head>
    <body>

        <%
            System.out.println("rim piatto");
            RequestDispatcher rd = request.getRequestDispatcher("MenuController");
            request.setAttribute("type", "REM_MENU_ID");
            request.setAttribute("_id", request.getParameter("_id"));
            rd.forward(request, response);
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>