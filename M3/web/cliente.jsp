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
        
                 
        <div id="tabella">
            <p class="saldo"> Il tuo conto è di ${Math.floor(Utente.saldo.getSaldo())} &euro;<p>
        <h2>Oggetti in vendita.</h2>
        <c:if test="${saldo == 0}">
                <p class="error"> Non si dispone di abbastanza credito per procedere. Si prega
                                  di scegliere un altro oggetto o ricaricare il proprio conto.
                <p>
            </c:if>
        <table>
            <tr>
                 <th>Nome </th>
                 <th>Foto </th>
                 <th>Descrizione</th>
                 <th>Quantità disponibile</th>
                 <th>Prezzo</th>
            </tr>
            <c:forEach var="oggetto" items="${oggetto}">
                <tr <c:if test="${(oggetto.getId())%2==0}"> class="pari" </c:if> >
                    <td> ${oggetto.getName()} </td>
                    <td> <img title="${oggetto.getName()}" alt="${oggetto.getName()}" 
                         src="${oggetto.getUrl()}" width="100" height="100"></td>
                    <td> ${oggetto.getDescrizione()}</td>
                    <td> ${oggetto.getDisponibili()}</td>
                    <td> &euro; ${oggetto.getPrezzo()}</td>
                    <td> <a class="bottone" href="cliente.html?idOggetto=${oggetto.getId()}"> Aggiungi al carrello </a> </td>
                </tr>
            </c:forEach>
                
        </table>
    </div>
    </body>
</html>

