/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm;

import amm.m3.Classi.Venditore;
import amm.m3.Classi.Utente;
import amm.m3.Classi.UtentiFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alessandro
 */
@WebServlet(name = "Login", urlPatterns = {"/login.html"})
public class Login extends HttpServlet {

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
        
        HttpSession session = request.getSession(true);
        
        if(session!=null){
            if(session.getAttribute("utente")== "cliente"){
                request.getRequestDispatcher("cliente.html")
                        .forward(request, response);
            }
            else if(session.getAttribute("utente")=="venditore"){
                request.getRequestDispatcher("venditore.html")
                        .forward(request, response);            
            }
        }
        
        if(request.getParameter("Submit") != null)
        {
            String username = request.getParameter("username");
            String password = request.getParameter("psw");
            
            ArrayList<Utente> listaUtenti = UtentiFactory.getInstance()
                    .getUtentiList();
            
            for(Utente u : listaUtenti)
            {
                if(u.getUsername().equals(username) && 
                        u.getPassword().equals(password))
                {
                    session=request.getSession(true);
                    session.setAttribute("Utente", u);
                    if(u instanceof Venditore)
                    {
                        
                        session.setAttribute("utente", "venditore");
                        request.getRequestDispatcher("venditore.html")
                                .forward(request, response);
                    }
                    else
                    {
                        session.setAttribute("utente", "cliente");
                        request.getRequestDispatcher("cliente.html")
                                .forward(request, response);
                    }
                }
            }
            
        }
        
        if(request.getParameter("username")!=null && request.getParameter("psw")!=null ) {
            request.setAttribute("error", 0);
        }
            request.getRequestDispatcher("login.jsp")
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
