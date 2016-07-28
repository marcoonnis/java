<%-- 
    Document   : cliente
    Created on : 28-apr-2016, 17.47.49
    Author     : root
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <jsp:include page="header.jsp"/>
         <!--Sezione navigazione-->
        <jsp:include page="navbar.jsp"/>
        
        
         <!--Tabella oggetti in vendita.-->
        
                
        <div>
            <h2 class="error">ERRORE:</h2>
            <p class="error"> 
                C' è stato un tentativo di accesso a un' area riservata a un altro 
                gruppo di utenti. Per visualizzare correttamente la pagine si prega 
                di accedere con un diverso account.
            <p>
        </div>
    </body>
</html>

