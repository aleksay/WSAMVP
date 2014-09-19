<%-- 
    Document   : AggiungiPiattoWS
    Created on : 19-set-2014, 14.40.34
    Author     : cloud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Frameset//EN" "http://www.w3.org/TR/REC-html40/frameset.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
            RequestDispatcher rd = request.getRequestDispatcher("MenuController");
            request.setAttribute("type", "ADD_MENU");
            request.setAttribute("id_rist", request.getParameter("id_rist"));
            request.setAttribute("piatto", request.getParameter("piatto"));
            rd.forward(request, response);
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
