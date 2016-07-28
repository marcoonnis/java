<%-- 
    Document   : login
    Created on : 27-apr-2016, 17.26.41
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
        <!--Form di accesso.-->
        <div class="login">
        <h2>Accesso Utenti</h2>
        
        <form class="login" method="post" action="login.html">
            <c:if test="${error == 0}">
                <p class="error"> Inserire credenziali corrette <p>
            </c:if>
            
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
