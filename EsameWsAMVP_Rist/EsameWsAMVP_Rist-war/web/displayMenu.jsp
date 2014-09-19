<%-- 
    Document   : displayMenu
    Created on : 19-set-2014, 16.05.28
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
                String id_rist = "1";
                RequestDispatcher rd = request.getRequestDispatcher("MenuController");
                request.setAttribute("type", "DISPLAY_MENU_ID");
                request.setAttribute("_id", id_rist);
                rd.forward(request, response);
                //rd.include(request, response);
            %>
    </body>
</html>
