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
        <h2>Riepilogo acquisto.</h2>
        <p>Si prega di ricontrollare i dati prima di procedere con la conferma dell' acquisto.</p>
        <table>
            <tr>
                 <th>Nome </th>
                 <th>Foto </th>
                 <th>Descrizione</th>
                 <th>Quantità disponibile</th>
                 <th>Prezzo</th>
            </tr>
            
                <tr>
                    <td> ${chosen.getName()} </td>
                    <td> <img title="${chosen.getName()}" alt="${chosen.getName()}" 
                         src="${chosen.getUrl()}" width="100" height="100"></td>
                    <td> ${chosen.getDescrizione()}</td>
                    <td> ${chosen.getDisponibili()}</td>
                    <td> &euro; ${chosen.getPrezzo()}</td>
                    <td> <a class="bottone" href="cliente.html?idOggettoAcquisto=${chosen.getId()}&idOggetto=0&acquisto=${chosen.getId()}"> Conferma acquisto </a> </td>

                </tr>
            
                
        </table>
        
    </div>
    </body>
</html>

