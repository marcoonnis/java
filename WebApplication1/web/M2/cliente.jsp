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
        <nav id="esterni"> 
            <a href="descrizione.html">Descrizione</a>
            <a href="login.html">Login</a>
        </nav>
        
        
         <!--Tabella oggetti in vendita.-->
        <div id="tabella">
        <h2>Oggetti in vendita.</h2>
        <table>
             <!--Titolo articoli-->
            <c:forEach var="oggetto" items="${objectSale}">
            <tr>
                <th>Floppy Disk1</th>
                <td class="img"><img title="floppy" alt="foto di un floppy blu" 
                         src="img/8-inch-floppy.jpg"
                         width="100" height="100"></td>
                <td>Floppy GIGANTE, per chi non si accontenta ;)</td>
                <td>Disponibili: 2</td>
                <td>10 Euro</td>
                
                
                <td><a class="bottone" href="cliente.html">Aggiungi al carrello</a></td>
            </tr>
            
            <tr class="pari">
                 <!--Immagini articoli-->
                <th>CD-ROM</th>
                
                <td class="img"><img title="cdrom" alt="foto di un pacco di cd" 
                         src="img/verbatim_vinyl_cd.jpg"
                         width="100" height="100"></td>
                <td>Confezione contenente 16 CD-ROM vergini.</td>
                <td>Disponibili: 200</td>
                <td>7 Euro</td>
                
                
                <td><a class="bottone" href="cliente.html">Aggiungi al carrello</a></td>
            </tr>
            
            <tr>
                 <!--Descrizione prodotti-->
                <th>HDD 1TB</th>
                <td class="img"><img title="hdd" alt="foto di un hard disk" 
                         src="img/Western-Digital-500GB.jpg"
                         width="100" height="100"></td>
                
                
                <td>Un Hard disk esterno da 1 TeraByte, SATA3. </td>
                
                
                <td>Disponibili: 50</td>
                <td>40 Euro</td>
                
                <td><a class="bottone" href="cliente.html">Aggiungi al carrello</a></td>
            </tr>
            
            <tr class="pari">
                 <!--Disponibilità quantità prodotti-->
                <th>Pendrive</th>
                <td class="img"><img title="pendrive" alt="foto di una pennina usb" 
                         src="img/pen_drive_usb_virus.gif"
                         width="100" height="100"></td>
                <td>Pennina USB da 32 GB conforme alle leggi dello stato cinese. </td>
                
                
                <td>Disponibili: 100</td>
                <td>20 Euro</td>
                <td><a class="bottone" href="cliente.html">Aggiungi al carrello</a></td>
            </tr>
            
            <tr>
                 <!--Prezzo prodotti-->
                <th>Floppy Disk2</th>
                <td class="img"><img title="floppy2" alt="foto di un floppy rosa" 
                         src="img/sku_173335_3.jpg"
                         width="100" height="100"></td>
                <td>Floppy Rosa: rimanenze dall' 8/03, ora in SALDO!</td>
                <td>Disponibili: 15</td>
                <td>1 Euro</td>
                <td><a class="bottone" href="cliente.html">Aggiungi al carrello</a></td>
            </tr>
            
        </table>
    </div>
    </body>
</html>

