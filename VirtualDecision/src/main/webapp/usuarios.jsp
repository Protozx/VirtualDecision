<%-- 
    Document   : usuarios
    Created on : May 9, 2021, 3:39:36 PM
    Author     : Eidan Plata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesion</title>
        <link rel="stylesheet" href="estilo.css">
    </head>
    <body>
        <div id="cabecera"><br><table><tr><td class="botones"><a class="boton1" href=" ">FOROS DE USUSARIOS</a></td><td class="botones"><a class="boton2" href="buscador.html">DATOS DE ESCUELAS</a></td><td class="botones"><a class="boton3" href=" ">EXAMEN DE APTITUD</a></td><td><a class="boton4" href=" ">SESION</a></td></tr></table></div>
        <div id="cuerpo">
            <br>
            <center>
                <table class="tabla">
                    <tr>
                        <td class="txt3">INICIO DE SESION</td>
                        <td class="txt3">REGISTRO</td>
                    </tr>
                    <tr>
                        <td>
                            <form action="ServletU" method="post">
                            <p>USUARIO<br><input type="text" id="usuario" name="usuario" size="60" placeholder=" "></p>
                            <p>CONTRASEÑA<br><input type="password" id="contra" name="contra" size="60" placeholder=" "></p>
                            <br><input type="submit" id="guardar" name="guardar" value="Ingresar">
                            </form>
                        </td>
                        <td>
                            <form action="ServletU" method="post">
                            <p>USUARIO<br><input type="text" name="usuario2" size="60" placeholder=" "></p>
                            <p>CONTRASEÑA<br><input type="password" name="contra2" size="60" placeholder=" "></p>
                            <p>CONFIRMAR CONTRASEÑA<br><input type="password" name="ccontra" size="60" placeholder=" "></p>
                            <br><input type="submit" id="guardar" name="guardar" value="Guardar">
                            </form>
                        </td>
                    </tr>
                   
                </table>
                <br>
                </div>
                </body>
                </html>
