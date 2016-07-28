<%-- 
    Document   : cliente
    Created on : 28-apr-2016, 17.47.49
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
    <body>
        <jsp:include page="header.jsp"/>
         <!--Sezione navigazione-->
        <jsp:include page="navbar.jsp"/>
        
        
         <!--Tabella oggetti in vendita.-->
        
                
        <div id="tabella">
        <p class="saldo"> Il tuo conto è di ${Math.floor(Utente.saldo.getSaldo())} &euro;<p>
        <h2>Oggetto inserito con successo!</h2>
        <p>Come da lei richiesto, è stato messo in vendita l' oggetto con le seguenti specifiche: </p>
        <table>
            <tr>
                 <th>Nome </th>
                 <th>Foto </th>
                 <th>Descrizione</th>
                 <th>Quantità disponibile</th>
                 <th>Prezzo</th>
            </tr>
            
                <tr>
                    <td> ${submitted.getName()} </td>
                    <td> <img title="${submitted.getName()}" alt="${chosen.getName()}" 
                         src="${submitted.getUrl()}" width="100" height="100"></td>
                    <td> ${submitted.getDescrizione()}</td>
                    <td> ${submitted.getDisponibili()}</td>
                    <td> &euro; ${submitted.getPrezzo()}</td>
                    
                </tr>
            
                
        </table>
        
    </div>
    </body>
</html>

