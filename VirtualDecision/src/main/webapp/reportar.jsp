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
        <link rel="stylesheet" href="jose.css">
    </head>
    <body>
        <div id="cabecera">
            <br>
            <table>
                <tr>
                    <td class="botones"><a class="boton5" href="ServletR">CREAR REPORTE</a></td>
                    <td class="botones"><a class="boton6" href="buscador.html">VER REPORTES</a></td>
                    <td class="botones"><a class="boton3" href="index_1.jsp">PAGINA INICIO</a></td>
                    <td><a class="boton4" href="usuarios.jsp">SESION</a></td>
                </tr>
            </table>
        </div>

        <br>
        <div id="cuerpo">
            <br>
            <center>
                <table class="tabla">
                    <tr>
                        <td class="txt3">REPORTES REGISTRADOS</td>
                    </tr>

                </table>
            </center>
            <br>
        </div>
        <br>

        <div id="cuerpo">
            <form action="ServletR" method="post">
                <br>
                <center>
                    <table class="tabla">
                        <tr>
                            <td class="txt4">USUARIO</td>
                        </tr>
                        <tr>
                            <td class="txt4"><select name="usuario">
                                    <option disabled selected value="ejemplo">Seleccione un usuario</option>
                                    <option value="volvo">Volvo XC90</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td class="txt4">FECHA</td>
                        </tr>
                        <tr>
                            <td class="txt4"><input type="date" name="fecha"></td>
                        </tr>
                        <tr>
                            <td class="txt4">DESCRIPCIÓN</td>
                        </tr>
                        <tr>
                            <td class="txt4"><input type="text" name="descripcion"></td>
                        </tr>
                        <tr>
                            <td class="txt4"><input type="submit" name="guardar" value="GUARDAR"></td>
                        </tr>
                    </table>
                </center>
                <br>
                <input type="hidden" id="iden" name="iden" value="x">
            </form>
        </div>
    </body>
</html>