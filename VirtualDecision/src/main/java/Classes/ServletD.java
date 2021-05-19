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
@WebServlet(name = "ServletD", urlPatterns = {"/ServletD"})
public class ServletD extends HttpServlet {

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
            Jefe base = new Jefe();
            ArrayList<usuario> BUser = new ArrayList<>();
            ArrayList<Reporte> BReporte = new ArrayList<>();
            String caso;

            try {
                if (request.getParameter("guardar").equals("GUARDAR")) {
                    int pos = Integer.parseInt(request.getParameter("usuario"));
                    BUser = base.devoler();
                    BReporte = base.devolerR();
                    
                    String fecha = request.getParameter("fecha");
                    String descripcion = request.getParameter("descripcion");
                    String idU = "" + (1110 + pos);
                    String idA = "" + (1110 + base.lugarA());
                    String nombreU = BUser.get(pos).getNombre();
                    String nombreA = base.nombreA();
                    
                    base.registrarR(idU, idA, nombreU, nombreA, fecha, descripcion);
                    
                } else {
                    int pos = Integer.parseInt(request.getParameter("usuario"));
                    
                    BUser = base.devoler();
                    BReporte = base.devolerR();
                    int paps = Integer.parseInt(request.getParameter("iden"));
                    
                    String fecha = request.getParameter("fecha");
                    String descripcion = request.getParameter("descripcion");
                    String idU = "" + (1110 + pos);
                    String idA = "" + (1110 + base.lugarA());
                    String nombreU = BUser.get(pos).getNombre();
                    String nombreA = base.nombreA();
                    
                    base.cambiar(paps, idU, idA, nombreU, nombreA, fecha, descripcion);
                }
            } catch (Exception e) {
                
            }

            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Virtual Decision</title><link rel=\"stylesheet\" href=\"dona.css\"></head><body><div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton5\" href=\"ServletR\">CREAR REPORTE</a></td><td class=\"botones\"><a class=\"boton6\" href=\"ServletD\">VER REPORTES</a></td><td class=\"botones\"><a class=\"boton3\" href=\"index_1.jsp\">PAGINA INICIO</a></td><td><a class=\"boton4\" href=\"usuarios.jsp\">SESION</a></td></tr></table></div><br><div id=\"cuerpo1\"><br><center><table class=\"tabla\"><tr><td class=\"txt3\">REPORTES REGISTRADOS</td></tr></table></center><br></div><br><div id=\"cuerpo\"><br><center><table class=\"tabla\"><tr><td class=\"txt4\">ID USUARIO</td><td class=\"txt4\">USUARIO</td><td class=\"txt4\">ID AGENTE</td><td class=\"txt4\">AGENTE</td><td class=\"txt4\">FECHA</td><td class=\"txt4\">DESCRIPCION</td><td class=\"txt4\">MODIFICAR</td></tr>");
            
            BReporte = base.devolerR();
            int i = 0;
            
            while(BReporte.size() > i){
            out.println("<tr><td class=\"txt5\">" + BReporte.get(i).getIdU() + "</td><td class=\"txt5\">" + BReporte.get(i).getNombreU() +  "</td><td class=\"txt5\">" + BReporte.get(i).getIdA() + "</td><td class=\"txt5\">" + BReporte.get(i).getNombreA() + "</td><td class=\"txt5\">" + BReporte.get(i).getFecha() + "</td><td class=\"txt6\">" + BReporte.get(i).getDescripcion() + "</td>");
            out.println("<td class=\"txt4\"><form action=\"ServletR\" method=\"post\"><input type=\"hidden\" name=\"loc\" value=\"" + i + "\"><input type=\"submit\" name=\"cambiar\" value=\"CAMBIAR\"></form></td></tr>");
            i++;
            }
            
            
            out.println("</table></center><br></div></body></html>");

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
