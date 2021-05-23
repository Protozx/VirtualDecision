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
public class ServletE extends HttpServlet {

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

            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Virtual Decision</title><link rel=\"stylesheet\" href=\"paso.css\"></head><body><div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton1\" href=\"index_1.jsp\">FOROS DE USUSARIOS</a></td><td class=\"botones\"><a class=\"boton2\" href=\"buscador.html\">DATOS DE ESCUELAS</a></td><td class=\"botones\"><a class=\"boton3\" href=\" \">TEST DE APTITUDES</a></td><td><a class=\"boton4\" href=\"usuarios.jsp\">SESION</a></td></tr></table></div><div id=\"cuerpo\"><br><center><table class=\"tabla\"><tr>");
            out.println("<td class=\"txt1\" colspan=\"5\"> PREGUNTA X</td></tr><tr>");
            out.println("<td class=\"txt2\" colspan=\"5\">EN CADA ORACION ELIJA UN NUMERO PARA INDICAR QUE TANTO SE IDENTIFICA CON LO PROPUESTO POR LA MISMA</td>");
            out.println("</tr><tr><td class=\"txt3\" colspan=\"5\">-</td></tr><tr><td class=\"txt3\" colspan=\"5\">EJEMPLO DE ORACION NUMERO X CUANDO DISEÑO MAQUINAS</td></tr><tr><td class=\"txt3\" colspan=\"5\">-</td></tr><tr class=\"txte\"><td class=\"txte\"><form action=\"ServletI\" method=\"post\"><input type=\"hidden\" id=\"iden\" name=\"bal\" value=\"1\"><input type=\"submit\" value=\"- 2\"></form></td><td class=\"txte\"><form action=\"ServletI\" method=\"post\"><input type=\"hidden\" id=\"iden\" name=\"bal\" value=\"2\"><input type=\"submit\" value=\"- 1\"></form></td><td class=\"txte\"><form action=\"ServletI\" method=\"post\"><input type=\"hidden\" id=\"iden\" name=\"bal\" value=\"3\"><input type=\"submit\" value=\"0\"></form></td><td class=\"txte\"><form action=\"ServletI\" method=\"post\"><input type=\"hidden\" id=\"iden\" name=\"bal\" value=\"4\"><input type=\"submit\" value=\"+1\"></form></td><td class=\"txte\"><form action=\"ServletI\" method=\"post\"><input type=\"hidden\" id=\"iden\" name=\"bal\" value=\"5\"><input type=\"submit\" value=\"+2\"></form></td></tr></table></center><br></div></body></html>");
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
