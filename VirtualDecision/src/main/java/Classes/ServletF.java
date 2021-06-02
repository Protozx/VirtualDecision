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
public class ServletF extends HttpServlet {

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
            if (base.Final() == 0) {
                int valor = Integer.parseInt(request.getParameter("bal"));
                int area = base.areaA();
                switch (area) {
                    case 1:
                        base.Hummanidades(valor);
                        break;
                    case 2:
                        base.Empresarial(valor);
                        break;
                    case 3:
                        base.Artes(valor);
                        break;
                    case 4:
                        base.Ciencias(valor);
                        break;
                    case 5:
                        base.Ingenierias(valor);
                        break;
                }
                base.siguiente();
                response.sendRedirect("ServletE");

            } else {

                int valor = Integer.parseInt(request.getParameter("bal"));
                int area = base.areaA();
                switch (area) {
                    case 1:
                        base.Hummanidades(valor);
                        break;
                    case 2:
                        base.Empresarial(valor);
                        break;
                    case 3:
                        base.Artes(valor);
                        break;
                    case 4:
                        base.Ciencias(valor);
                        break;
                    case 5:
                        base.Ingenierias(valor);
                        break;
                }

                out.println("<html><head><title>Virtual Decision</title><link rel=\"stylesheet\" href=\"pasi.css\"><style></style></head><body><div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton7\" href=\"editarfaqs.html\">CREAR FAQS</a></td><td class=\"botones\"><a class=\"boton8\" href=\"http://25.3.189.208:8080/VirtualDecision/FAQDisplay\">VER FAQS</a></td><td class=\"botones\"><a class=\"boton9\" href=\"index.jsp\">PAGINA DE INICIO</a></td><td><a class=\"boton4\" href=\"usuarios.jsp\">SESION</a></td><input type=\"hidden\" name=\"cambiar\" value=\"2\"></tr></table></div><div id=\"cuerpo\"><br><center><table class=\"tabla\"><tr><td class=\"txt3\" colspan=\"3\">RESULTADOS<br><br></td></tr><tr>");
                out.println("<td class=\"txt1\">HUMANIDADES: " + base.PHu() + "%<br><br>EMPRESARIAL: " + base.PEm() + "%<br><br>ARTISTICAS: " + base.PAr() + "%<br><br>CIENCIAS: " + base.PCi() + "%<br><br>INGENIERIAS: " + base.PIn() + "%<br><br></td><td class=\"txt3\" colspan=\"2\" rowspan=\"2\"><div class=\"chart-wrap horizontal\"><div class=\"grid\">");

                out.println("<div class=\"bar\" style=\"--bar-value:" + base.PHu() + "%;\" data-name=\"HUMANIDADES\" title=\"HUMANIDADES\"></div>");
                out.println("<div class=\"bar\" style=\"--bar-value:" + base.PEm() + "%;\" data-name=\"EMPRESARIAL\" title=\"EMPRESARIAL\"></div>");
                out.println("<div class=\"bar\" style=\"--bar-value:" + base.PAr() + "%;\" data-name=\"ARTISTICAS\" title=\"ARTISTICAS\"></div>");
                out.println("<div class=\"bar\" style=\"--bar-value:" + base.PCi() + "%;\" data-name=\"CIENCIAS\" title=\"CIENTIFICAS\"></div>");
                out.println("<div class=\"bar\" style=\"--bar-value:" + base.PIn() + "%;\" data-name=\"INGENIERIAS\" title=\"INGENIERIAS\"></div></div></div></td></tr><tr>");

                out.println("<td class=\"txt4\">MAYOR PUNTAJE:<br>" + base.Mayor() + "</td></tr></table></center><br></div></body></html>");
            }

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
