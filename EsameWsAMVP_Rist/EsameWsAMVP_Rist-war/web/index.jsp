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
        <h1>Hello Ristorante DA VITO!</h1>
        <% System.out.println("qqqwtrtq"); %>
        <div class="menu">    
            <frame name="menu_frame" src="displayMenu.jsp?id_rist=1">            
        </div>
        <div>
            <form>
                <input type="button" onclick="AddForm()" value="Aggiungi piatto" >
                <% System.out.println("qqqq"); %>
            </form>
        </div>
    </body>
</html>
