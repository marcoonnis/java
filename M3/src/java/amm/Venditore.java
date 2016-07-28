/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm;

import amm.m3.Classi.Oggetto;
import java.io.IOException;

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
@WebServlet(name = "Venditore", urlPatterns = {"/venditore.html"})
public class Venditore extends HttpServlet {

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
        
        if(session.getAttribute("utente")!= "venditore") {
            request.getRequestDispatcher("error.jsp")
                    .forward(request, response);
        } 
        if(request.getParameter("Submit")!= null) {
            
                     

            if( request.getParameter("nomeOggetto")!=null &&
                request.getParameter("urlImg")!=null &&
                request.getParameter("descrizione")!=null &&
                request.getParameter("disponibili")!=null &&
                request.getParameter("prezzo")!=null
                ) {
        
                Oggetto submitted = new Oggetto();
                
                if(!(request.getParameter("nomeOggetto").isEmpty()) &&
                        !(request.getParameter("urlImg").isEmpty()) &&
                        !(request.getParameter("descrizione").isEmpty())
                    ) {
                submitted.setName(request.getParameter("nomeOggetto"));
                submitted.setUrl(request.getParameter("urlImg"));
                submitted.setDescrizione(request.getParameter("descrizione"));
                } else {
                    request.setAttribute("error", 1);
                }
                
        
        
                Integer disponibili;
                if (request.getParameter("disponibili").isEmpty()) {
                    disponibili=0;
                } else {
                    disponibili=Integer.parseInt(request.getParameter("disponibili"));
                }
                
                submitted.setDisponibili(disponibili);
                
                Integer prezzo;
                if (request.getParameter("prezzo").isEmpty()) {
                    prezzo=0;
                } else {
                    prezzo=Integer.parseInt(request.getParameter("prezzo"));
                }
                
                submitted.setPrezzo(prezzo);
                
                if(prezzo>0 && disponibili>0) {
                    request.setAttribute("submitted", submitted);
                    request.getRequestDispatcher("submitted.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", 1);
                }
                
            }
            
            
        }
        
        request.getRequestDispatcher("venditore.jsp").forward(request, response);
        
        
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
