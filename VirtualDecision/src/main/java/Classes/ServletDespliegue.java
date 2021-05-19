/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.SealedObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diego Vazquez http://26.50.157.99:8080/VirtualDecision/
 */
public class ServletDespliegue extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Distribuido mano = new Distribuido();
    ArrayList<Escuela> LEscuela = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Datos de escuelas</title><link rel=\"stylesheet\" href=\"estilo.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=\"cabecera\"><br><table><tr><td class=\"botones\"><a class=\"boton1\" href=\" \">FOROS DE USUSARIOS</a></td><td class=\"botones\"><a class=\"boton2\" href=\"buscador.html\">DATOS DE ESCUELAS</a></td><td class=\"botones\"><a class=\"boton3\" href=\" \">EXAMEN DE APTITUD</a></td><td><a class=\"boton4\" href=\"http://26.50.164.7:8080/VirtualDecision/session.jsp\">SESION</a></td></tr></table></div>");
            String nombre = "";
            String carreras = "";
            String estudiantes = "";
            String publicaciones = "";

            RegistrosEscuela ejecutar = new RegistrosEscuela();
            Escuela pack = new Escuela();
            try {
                final int puerto = 6000;

                Socket socket = new Socket("26.50.157.99", puerto);

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

                Key sKey;

                final int puerto1 = 7000;

                Socket socket1 = new Socket("26.50.157.99", puerto1);

                ObjectInputStream flujo = new ObjectInputStream(socket1.getInputStream());

                sKey = (Key) flujo.readObject();

//Read the sealed object
                SealedObject so = (SealedObject) ois.readObject();
                ArrayList<Escuela> car = (ArrayList<Escuela>) so.getObject(sKey);
                LEscuela = car;

            } catch (Exception e) {

                System.out.println(e);
            }

            String Saldo = request.getParameter("Historial");
            switch (Saldo) {
                case "VALORES ANAHUAC":

                    nombre = LEscuela.get(0).getNombre();
                    carreras = LEscuela.get(0).getCarreras();
                    estudiantes = LEscuela.get(0).getEstudiantes();
                    publicaciones = LEscuela.get(0).getPublicaciones();
                    break;
                case "VALORES TDM":
                    nombre = LEscuela.get(1).getNombre();
                    carreras = LEscuela.get(1).getCarreras();
                    estudiantes = LEscuela.get(1).getEstudiantes();
                    publicaciones = LEscuela.get(1).getPublicaciones();
                    break;
                case "VALORES UNAM":
                    nombre = LEscuela.get(2).getNombre();
                    carreras = LEscuela.get(2).getCarreras();
                    estudiantes = LEscuela.get(2).getEstudiantes();
                    publicaciones = LEscuela.get(2).getPublicaciones();
                    break;
                case "VALORES UVM":
                    nombre = LEscuela.get(3).getNombre();
                    carreras = LEscuela.get(3).getCarreras();
                    estudiantes = LEscuela.get(3).getEstudiantes();
                    publicaciones = LEscuela.get(3).getPublicaciones();
                    break;
            }
            out.println("<div id=\"cuerpo2\"><div id=\"txt\">DATOS</div>	<center><div id=\"contenedor\"><div id=\"bloque2\">	NOMBRE: " + nombre + "	</div>	<div id=\"bloque3\">	CARRERAS DISPONIBLES: " + carreras + "</div><div id=\"bloque4\">NUMERO DE ALUMNOS: " + estudiantes + "</div><div id=\"bloque5\">	NUMERO DE PUBLICACIONES: " + publicaciones + "</div>\n" + "");
            out.println("</div></center>      </div>");
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
