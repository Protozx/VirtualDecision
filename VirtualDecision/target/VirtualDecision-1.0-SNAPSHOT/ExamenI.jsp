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
        <link rel="stylesheet" href="part.css">
    </head>
    <body>
        <div id="cabecera">
            <br>
            <table>
                <tr>
                    <td class="botones"><a class="boton1" href="index_1.jsp">FOROS DE USUSARIOS</a></td>
                    <td class="botones"><a class="boton2" href="buscador.html">DATOS DE ESCUELAS</a></td>
                    <td class="botones"><a class="boton3" href=" ">TEST DE APTITUDES</a></td>
                    <td><a class="boton4" href="usuarios.jsp">SESION</a></td>
                </tr>
            </table>
        </div>
        <div id="cuerpo">
            <br>
            <center>
                <table class="tabla">
                    <tr>
                        <td class="txt1">TEST DE APTITUDES</td>
                    </tr>
                    <tr>
                        <td class="txte"><form action="ServletR" method="post"><input type="submit" value="INICIAR"></form></td>
                    </tr>
                </table>
            </center>
            <br>
        </div>
    </body>
</html>