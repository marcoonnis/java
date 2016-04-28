<%-- 
    Document   : login
    Created on : 27-apr-2016, 17.26.41
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <jsp:include page="header.jsp"/>
         <!--Sezione navigazione-->
        <nav id="esterni"> 
            <a href="descrizione.html">Descrizione</a>
            <a href="cliente.html">Cliente</a>
            <a href="venditore.html">Venditore</a>
        </nav>
        <!--Form di accesso.-->
        <div class="login">
        <h2>Accesso Utenti</h2>
        <form class="login" method="post" action="Login">
            
            <div class="riga">
            <label for="username">Username:</label>
            <input type="text" name="username" id="username" value="username" />
            </div>
            <div class="riga">
            <label for="psw">Password:</label>
            <input type="password" name="psw" id="psw" value="psw" />
            </div>
            
            <button type="submit" name="Submit" value="Login"> Accedi </button>
            
        </form>
        </div>   
    </body>
</html>
