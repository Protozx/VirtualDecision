<%-- 
    Document   : index
    Created on : Dec 19, 2020, 2:20:58 PM
    Author     : Eidan Plata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Virtual Decision</title>
        <link rel="stylesheet" href="dona_1.css">
    </head>
    <body>
        <div id="cabecera">
            <br>
            <table>
                <tr>
                    <td class="botones"><a class="boton7" href="editarfaqs.html">CREAR FAQS</a></td>
                    <td class="botones"><a class="boton8" href="http://25.3.189.208:8080/VirtualDecision/FAQDisplay">VER FAQS</a></td>
                    <td class="botones"><a class="boton9" href=" ">PAGINA DE INICIO</a></td>
                    <td><a class="boton4" href="usuarios.jsp">SESION</a></td>
                <input type="hidden" name="cambiar" value="2">
                </tr>
            </table>
        </div>
        <div id="cuerpo">
            <br>
            <center>
                <table class="tabla">
                    <tr>
                        <td class="txt1">BIENVENIDO</td>
                        <td> </td>
                        <td class="txt2">Virtual Decision es una herramienta para facilitar la elección de una profesión o escuela basándose en los intereses y aptitudes del aspirante.
                        </td>
                    </tr>
                    <tr>
                        <td><img src="Imagen1.png" width="350" height="350"></td>
                        <td class="txtg">Revisa estadísticas de diversas escuelas a nivel medio superior y superior junto con datos sobre sus especialidades.
                        </td>
                        <td><img src="Imagen2.png" width="350" height="350"></td>
                    </tr>
                    <tr>
                        <td class="txtg">Revisa foros creados por la comunidad en donde puedes relacionarte con otros estudiantes de diversas carreras.
                        </td>
                        <td><img src="Imagen3.png" width="350" height="350"></td>
                        <td class="txtg">Realiza un test de intereses y aptitudes que al final muestra<br> recomendaciones profesionales personalizadas para ti.
                        </td>
                    </tr>
                </table>
            </center>
            <br>
        </div>
    </body>
</html>