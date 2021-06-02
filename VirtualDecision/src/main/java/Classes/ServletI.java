/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eidan Plata
 */
public class ServletI extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            
            Jefe base = new Jefe();
            
            base.Resetear();
            out.println("<html><head><title>Virtual Decision</title><link rel=\"stylesheet\" href=\"part.css\"></head><body><div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton1\" href=\"index_1.jsp\">FOROS DE USUSARIOS</a></td><td class=\"botones\"><a class=\"boton2\" href=\"buscador.html\">DATOS DE ESCUELAS</a></td><td class=\"botones\"><a class=\"boton3\" href=\" \">TEST DE APTITUDES</a></td><td><a class=\"boton4\" href=\"usuarios.jsp\">SESION</a></td></tr></table></div><div id=\"cuerpo\"><br><center><table class=\"tabla\"><tr><td class=\"txt1\">TEST DE APTITUDES</td></tr><tr><td class=\"txte\"><form action=\"ServletE\" method=\"post\"><input type=\"submit\" value=\"INICIAR\"></form></td></tr></table></center><br></div></body></html>");
            base.Resetear();
        }
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
