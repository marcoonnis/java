<%-- 
    Document   : venditore
    Created on : 28-apr-2016, 18.19.00
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
            <a href="descrizione.html"> Descrizione </a>
            <a href="login.html"> Login </a>
        </nav>
        
        <div class="login">
        <h2>Vendita di un nuovo oggetto</h2>
        <p>Inserire le informazioni richieste nei form per poter inserire l' oggetto nel nostro shop.</p>
         <!--Form per mettere in vendita.-->
        
        <form id="login" method="get">
            <div class="riga">
            <label for="oggetto">Nome oggetto:</label>
            <input type="text" name="oggetto" id="oggetto" />
            </div> 
            <div class="riga">
            <label for="img">Url immagine:</label>
            <input type="url" name="img" id="img" />
            </div>
            <div class="riga">
            <label for="descrizione">Descrizione:</label>
            <textarea rows="5" cols="20" id="descrizione"></textarea>
            </div>
            <div class="riga">
            <label for="disponibili">Disponibili:</label>
            <input type="number" name="disponibili" id="disponibili" />
            </div>
            <div class="riga">
            <label for="prezzo">Prezzo (Euro):</label>
            <input type="number" name="prezzo" id="prezzo" />
            </div>
            
            <a class="bottone">Metti in vendita!</a>
            
        </form>
        </div>
    </body>
</html>
