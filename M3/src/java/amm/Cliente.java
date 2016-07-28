/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm;

import amm.m3.Classi.ObjectSaleFactory;
import amm.m3.Classi.Oggetto;
import amm.m3.Classi.Utente;  
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author root
 */
@WebServlet(name = "Cliente", urlPatterns = {"/cliente.html"})
public class Cliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session=request.getSession(true);
        
        ObjectSaleFactory instance= ObjectSaleFactory.getInstance();
        List<Oggetto> items = instance.getObjectList();
        
        if(session.getAttribute("utente")!= "cliente") {
            request.getRequestDispatcher("error.jsp")
                    .forward(request, response);
        } 
            
            
           
        
        
        
        Integer idOggetto;
        
        
        
        if (request.getParameter("idOggetto")==null || 
                request.getParameter("idOggetto").isEmpty()) {
            idOggetto=0;
            
        } else {
            idOggetto=Integer.parseInt(request.getParameter("idOggetto"));
            
        }
        
        
        
        if(idOggetto>0) {
            if(instance.getObjectSaleById(idOggetto).getDisponibili() > 0) {
                request.setAttribute("chosen", instance.getObjectSaleById(idOggetto));
                request.getRequestDispatcher("riepilogo.jsp")
                        .forward(request, response);
            } else {
                request.setAttribute("disponibile", 0);
                
            }
        }
        
        Integer acquisto;
        
        if (request.getParameter("acquisto")==null || 
                request.getParameter("acquisto").isEmpty()) {
            acquisto=0;
                        
        } else {
            acquisto=Integer.parseInt(request.getParameter("acquisto"));
        }
        
        Integer idOggettoAcquisto;
        
        if (request.getParameter("idOggettoAcquisto")==null || 
                request.getParameter("idOggettoAcquisto").isEmpty()) {
            idOggettoAcquisto=0;
                        
        } else {
            idOggettoAcquisto=Integer.parseInt(request.getParameter("idOggettoAcquisto"));
        }
        
        if(acquisto>0) {
            
            if(session.getAttribute("utente")== "cliente") {
                
                Utente u = (Utente)session.getAttribute("Utente");
                
                if(u.saldo.subSaldo(instance.getObjectSaleById(idOggettoAcquisto).getPrezzo())==false) {
                    request.setAttribute("saldo", 0);
                    
                } else {
                    instance.getObjectSaleById(idOggettoAcquisto).subDisponibili(1);
                    request.getRequestDispatcher("conferma.jsp")
                        .forward(request, response);
                }
            }
        
        }    
        
        
        
        request.setAttribute("oggetto", items);
        request.getRequestDispatcher("cliente.jsp")
                    .forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
