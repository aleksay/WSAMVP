<%-- 
    Document   : index
    Created on : 18-set-2014, 12.29.21
    Author     : cloud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function AddForm(){
                window.location = "AggiungiPiatto.jsp";
                return false;
            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>srdthewryrtyrtb</p>
        <div class="menu">
            <p>sb</p>
            <% 
                String id_rist = "1";
                RequestDispatcher rd = request.getRequestDispatcher("MenuController");
                request.setAttribute("type", "DISPLAY_MENU_ID");
                request.setAttribute("_id", id_rist);
                rd.forward(request, response);
                
            %>
            <p>srdthb</p>
        </div>
        <div>
            <form>
                <span>btn</span>
                <input type="button" onclick="AddForm()" value="Aggiungi" >
                testo 
                <% System.out.println("qqqq"); %>
            </form>
        </div>
    </body>
</html>
