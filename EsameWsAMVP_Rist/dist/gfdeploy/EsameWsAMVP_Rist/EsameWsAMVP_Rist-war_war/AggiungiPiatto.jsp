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
        <script type="text/javascript">
            function AddMenu(){
                var piatto = document.getElementById("nome_piatto").textContent;
                window.location = "AggiungiPiattoWS.jsp?id_rist=1&piatto=" + piatto;
                return false;
            }
        </script>
    </head>
    <body>
        <h1>Nuovo Piatto</h1>
        <div>
            <span>Nome piatto:</span>&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" style="width: 300px;" id="nome_piatto">
            <br/><br/>
            <input type="button" value="Aggiungi">
        </div>
    </body>
</html>
