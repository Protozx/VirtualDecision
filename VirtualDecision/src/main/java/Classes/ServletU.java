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
@WebServlet(name = "ServletU", urlPatterns = {"/ServletU"})
public class ServletU extends HttpServlet {

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
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletU</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletU at " + request.getContextPath() + "</h1>");

            Jefe base = new Jefe();
            ArrayList<usuario> BUser = new ArrayList<>();
            if (request.getParameter("guardar").equals("Guardar")) {

                int sise = 0;
                out.println("<p>Si</p>");
                String nombre = request.getParameter("usuario2");
                out.println("<p>Si " + nombre + "</p>");
                String contraseña = request.getParameter("contra2");
                out.println("<p>Si " + contraseña + "</p>");
                int tipo = 2;

                base.registrar(nombre, contraseña, tipo);
                out.println("<p>Hecho</p>");

                BUser = base.devoler();
                int i = 0;
                while (i < BUser.size()) {
                    out.println("<p>" + BUser.get(i).getNombre() + " " + BUser.get(i).getContraseña() + " " + BUser.get(i).getTipo() + "</p>");
                    i++;
                }
                out.println("<p>Ahora " + base.nombreA() + " esta ativo</p>");

            } else {
                String nombre = request.getParameter("usuario");
                out.println("<p>Si " + nombre + "</p>");

                base.ingresar(nombre, nombre);

                if (nombre.equals(base.nombreA())) {
                    if (base.tipoA() == 3) {
                        response.sendRedirect("index_1.jsp");
                    } else {
                        if (base.tipoA() == 2) {
                            response.sendRedirect("index_1_1.jsp");
                        } else {
                            response.sendRedirect("index.jsp");
                        }
                    }
                } else {
                    response.sendRedirect("noexiste.html");
                }

                out.println("<p>Ahora " + base.nombreA() + " esta ativo</p>");
                //

            }

            //
            out.println("</body>");
            out.println("</html>");
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
