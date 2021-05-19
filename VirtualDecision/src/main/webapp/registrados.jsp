<%-- 
    Document   : index
    Created on : Dec 19, 2020, 2:20:58 PM
    Author     : Eidan Plata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><title>Virtual Decision</title><link rel="stylesheet" href="dona.css"></head><body><div id="cabecera"><br><table><tr><td class="botones"><a class="boton5" href="ServletR">CREAR REPORTE</a></td><td class="botones"><a class="boton6" href="ServletD">VER REPORTES</a></td><td class="botones"><a class="boton3" href="index_1.jsp">PAGINA INICIO</a></td><td><a class="boton4" href="usuarios.jsp">SESION</a></td></tr></table></div><br><div id="cuerpo1"><br><center><table class="tabla"><tr><td class="txt3">REPORTES REGISTRADOS</td></tr></table></center><br></div><br><div id="cuerpo"><br><center><table class="tabla"><tr><td class="txt4">ID USUARIO</td><td class="txt4">USUARIO</td><td class="txt4">ID AGENTE</td><td class="txt4">AGENTE</td><td class="txt4">FECHA</td><td class="txt4">DESCRIPCION</td><td class="txt4">MODIFICAR</td></tr>

                    <tr><td class="txt5">ID USUARIO</td><td class="txt5">USUARIO</td><td class="txt5">ID AGENTE</td><td class="txt5">AGENTE</td><td class="txt5">FECHA</td><td class="txt6">DESCRIPCION</td>
                        <td class="txt4"><form action="ServletR" method="post"><input type="hidden" name="loc" value="x"><input type="submit" name="cambiar" value="CAMBIAR"></form></td></tr>

                </table></center><br></div></body></html>