<%-- 
    Document   : venditore
    Created on : 28-apr-2016, 18.19.00
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
        
        <div class="login">
        <p class="saldo"> Il tuo conto è di ${Math.floor(Utente.saldo.getSaldo())} &euro;<p>
        <h2>Vendita di un nuovo oggetto</h2>
        <p>Inserire le informazioni richieste nei form per poter inserire l' oggetto nel nostro shop.</p>
         <!--Form per mettere in vendita.-->
        <c:if test="${error == 1}">
                <p class="error"> L' inserimento non è andato a buon fine. Si prega di inserire unicamente
                                  informazioni valide.
                <p>
            </c:if>
        <form id="login" method="post" action="venditore.html">
            <div class="riga">
            <label for="oggetto">Nome oggetto:</label>
            <input type="text" name="nomeOggetto" id="oggetto" />
            </div> 
            <div class="riga">
            <label for="img">Url immagine:</label>
            <input type="url" name="urlImg" id="img" />
            </div>
            <div class="riga">
            <label for="descrizione">Descrizione:</label>
            <textarea rows="5" cols="20" id="descrizione" name="descrizione"></textarea>
            </div>
            <div class="riga">
            <label for="disponibili">Disponibili:</label>
            <input type="number" name="disponibili" id="disponibili" />
            </div>
            <div class="riga">
            <label for="prezzo">Prezzo (Euro):</label>
            <input type="number" name="prezzo" id="prezzo" />
            </div>
            
            <button type="submit" name="Submit">Metti in vendita</button>
            
        </form>
        </div>
    </body>
</html>
