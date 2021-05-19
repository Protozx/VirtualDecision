/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eidan Plata
 */
@WebServlet(name = "ServletR", urlPatterns = {"/ServletR"})
public class ServletR extends HttpServlet {

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

            Jefe base = new Jefe();
            ArrayList<usuario> BUser = new ArrayList<>();
            ArrayList<Reporte> BReporte = new ArrayList<>();

            try {
                if (request.getParameter("cambiar").equals("CAMBIAR")) {
                    
                    
                    BUser = base.devoler();
                    BReporte = base.devolerR();
                    
                    int k = Integer.parseInt(request.getParameter("loc"));
                    int i = 0;
                    

                    out.println("<!DOCTYPE html>");
                    out.println("<html><head><title>Virtual Decision</title><link rel=\"stylesheet\" href=\"jose.css\"></head><body><div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton5\" href=\"ServletR\">CREAR REPORTE</a></td><td class=\"botones\"><a class=\"boton6\" href=\"buscador.html\">VER REPORTES</a></td><td class=\"botones\"><a class=\"boton3\" href=\"index_1.jsp\">PAGINA INICIO</a></td><td><a class=\"boton4\" href=\"usuarios.jsp\">SESION</a></td></tr></table></div><br><div id=\"cuerpo\"><br><center><table class=\"tabla\"><tr><td class=\"txt3\">AGREGAR REPORTE</td></tr></table></center><br></div><br><div id=\"cuerpo\"><form action=\"ServletD\" method=\"post\"><br><center><table class=\"tabla\"><tr><td class=\"txt4\">USUARIO</td></tr>");
                    out.println("<tr><td class=\"txt4\"><select name=\"usuario\">");
                    out.println("<option value=\"" + k + "\">" + BReporte.get(k).getIdU() + " - " + BReporte.get(k).getNombreU() + "</option>");
                    
                    while (BUser.size() > i) {
                        out.println("<option value=\"" + i + "\">" + (1110 + i) + " - " + BUser.get(i).getNombre() + "</option>");
                        i++;
                    }
                    out.println("</select></td></tr><tr><td class=\"txt4\">FECHA</td></tr>");
                    out.println("");
                    out.println("<tr><td class=\"txt4\"><input type=\"text\" name=\"fecha\" value=\"" + BReporte.get(k).getFecha() + "\"></td></tr><tr><td class=\"txt4\">DESCRIPCIÓN</td></tr>");
                    out.println("<tr><td class=\"txt4\"><input type=\"text\" name=\"descripcion\" value=\"" + BReporte.get(k).getDescripcion() + "\"></td></tr>");
                    out.println("<tr><td class=\"txt4\"><input type=\"submit\" id=\"guardar\" name=\"guardar\" value=\"CAMBIAR\"></td></tr></table></center><br>");
                    out.println("<input type=\"hidden\" id=\"iden\" name=\"iden\" value=\"" + k + "\"></form></div></body></html>");

                } else {

                }

            } catch (Exception e) {
                int i = 0;
                BUser = base.devoler();

                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>Virtual Decision</title><link rel=\"stylesheet\" href=\"jose.css\"></head><body><div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton5\" href=\"ServletR\">CREAR REPORTE</a></td><td class=\"botones\"><a class=\"boton6\" href=\"buscador.html\">VER REPORTES</a></td><td class=\"botones\"><a class=\"boton3\" href=\"index_1.jsp\">PAGINA INICIO</a></td><td><a class=\"boton4\" href=\"usuarios.jsp\">SESION</a></td></tr></table></div><br><div id=\"cuerpo\"><br><center><table class=\"tabla\"><tr><td class=\"txt3\">AGREGAR REPORTE</td></tr></table></center><br></div><br><div id=\"cuerpo\"><form action=\"ServletD\" method=\"post\"><br><center><table class=\"tabla\"><tr><td class=\"txt4\">USUARIO</td></tr>");
                out.println("<tr><td class=\"txt4\"><select name=\"usuario\"><option disabled selected value=\"ejemplo\">Seleccione un usuario</option>");

                while (BUser.size() > i) {
                    out.println("<option value=\"" + i + "\">" + (1110 + i) + " - " + BUser.get(i).getNombre() + "</option>");
                    i++;
                }
                out.println("</select></td></tr><tr><td class=\"txt4\">FECHA</td></tr>");
                out.println("");
                out.println("<tr><td class=\"txt4\"><input type=\"date\" name=\"fecha\"></td></tr><tr><td class=\"txt4\">DESCRIPCIÓN</td></tr>");
                out.println("<tr><td class=\"txt4\"><input type=\"text\" name=\"descripcion\"></td></tr>");
                out.println("<tr><td class=\"txt4\"><input type=\"submit\" id=\"guardar\" name=\"guardar\" value=\"GUARDAR\"></td></tr></table></center><br>");
                out.println("<input type=\"hidden\" id=\"iden\" name=\"iden\" value=\"x\"></form></div></body></html>");
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
