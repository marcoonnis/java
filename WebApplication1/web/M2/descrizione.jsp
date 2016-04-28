<%-- 
    Document   : descrizione
    Created on : 28-apr-2016, 17.46.01
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
            <a href="login.html"> Login </a>
        </nav>
        <!--Sezione navigazione interna alla pagina-->
        <nav class="interni">
        <ul>
            <li><a href="#segnalibro"> I nostri prodotti </a></li>
            <li><a href="#segnalibro2"> Servizi Venditori </a></li>
            <li><a href="#segnalibro3"> Servizi Compratori </a></li>
        </ul>
        </nav>
        <!--Info sui prodotti-->
        <div id="col1">
            <h2 id="segnalibro"> <b>Che cosa è possibile vendere (e comprare) ?</b> </h2>
        
            <p>E' possibile mettere in vendita
                qualsiasi dispositivo di memoria secondaria, quali: </p>
            <ul>
                <li>pennine usb.</li>
                <li>CD-Rom</li>
                <li>Hard-Disk</li>
            </ul>
            <p>Anche se il nostro "piatto forte" sono floppy disk vintage!</p>
        </div>
        <!--Info sui servizi venditori-->
        <div class="h3">
            <h3 id="segnalibro2"> <b>Servizi per i Venditori:</b> </h3>
               
            <p>E' possibile inserire una descrizione del prodotto, scegliere 
                il prezzo di vendita dell' articolo, le modalità di pagamento
                accettate e caricare un' immagine del prodotto.</p>
        </div>
        <!--Info sui servizi compratori.-->
        <div class="h3" id="dx">
            <h3 id="segnalibro3"> <b>Funzionalità per i Compratori:</b> </h3>
        
            <p>Completa gestione del carrello virtuale e del tuo saldo disponibile.</p>
        </div>
    </body>
</html>
