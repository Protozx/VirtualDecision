/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Eidan Plata
 */
public class Jefe {

    ArrayList<usuario> BUser = new ArrayList<>();
    ArrayList<Reporte> BReporte = new ArrayList<>();
    ArrayList<Pregunta> Examen = new ArrayList<>();
    RegistrosUsuario base = new RegistrosUsuario();
    usuario vivo = new usuario();
    Respuestas galleta = new Respuestas();

    Jefe() {
        BUser = base.leer();
        BReporte = base.leerR();
        Examen = base.leerE();
        galleta = base.actual();
    }

    public void crearP(String texto, int area) {
        Pregunta temp = new Pregunta();
        temp.setTexto(texto);
        temp.setArea(area);
        Examen.add(temp);
        base.GuardarE(Examen);
    }

    public void registrar(String nombre, String contraseña, int tipo) {

        usuario temp = new usuario();
        temp.setNombre(nombre);
        temp.setContraseña(contraseña);
        temp.setTipo(tipo);
        BUser.add(temp);
        base.Guardar(BUser);
    }

    public void registrarR(String idU, String idA, String nombreU, String nombreA, String fecha, String descripcion) {

        Reporte temp = new Reporte();
        temp.setDescripcion(descripcion);
        temp.setFecha(fecha);
        temp.setIdA(idA);
        temp.setIdU(idU);
        temp.setNombreA(nombreA);
        temp.setNombreU(nombreU);
        temp.setEstado(1);
        BReporte.add(temp);
        base.GuardarR(BReporte);
    }

    public void ingresar(String nombre, String contraseña) {
        int i = 0;
        while (i < BUser.size()) {
            String name = BUser.get(i).getNombre();
            if (nombre.equals(name)) {
                base.login(BUser.get(i));
                System.out.println("Inicio correcto");
                break;
            } else {
                System.out.println(nombre + " no es el " + i + " " + BUser.get(i).getNombre());
                i++;
            }
        }
    }

    public String nombreA() {
        vivo = base.usar();
        return vivo.getNombre();
    }

    public int lugarA() {
        vivo = base.usar();
        int i = 0;
        int j = 0;
        while (BUser.size() > i) {
            if (vivo.getNombre().equals(BUser.get(i).getNombre())) {
                j = i;
                break;
            } else {
                i++;
            }
        }
        return j;
    }

    public int tipoA() {
        vivo = base.usar();
        return vivo.getTipo();
    }

    public ArrayList<usuario> devoler() {
        return BUser;
    }

    public ArrayList<Reporte> devolerR() {
        return BReporte;
    }

    public ArrayList<Pregunta> devolerE() {
        return Examen;
    }

    public void cambiar(int pos, String idU, String idA, String nombreU, String nombreA, String fecha, String descripcion) {
        BReporte.get(pos).setDescripcion(descripcion);
        BReporte.get(pos).setFecha(fecha);
        BReporte.get(pos).setIdA(idA);
        BReporte.get(pos).setIdU(idU);
        BReporte.get(pos).setNombreA(nombreA);
        BReporte.get(pos).setNombreU(nombreU);
        base.GuardarR(BReporte);
    }

    public void borrar(int pos) {
        BReporte.remove(pos);
        base.GuardarR(BReporte);
    }

    public void resolver(int pos, int estado, String solucion) {
        vivo = base.usar();
        BReporte.get(pos).setEstado(estado);
        BReporte.get(pos).setSolucion(solucion);
        BReporte.get(pos).setNombreA(vivo.getNombre());
        base.GuardarR(BReporte);
    }

    public void siguiente() {
        int pos = 1 + galleta.getPos();
        galleta.setPos(pos);
        base.actualizar(galleta);
    }

    public void Hummanidades(int respuesta) {
        int alor = galleta.getHu() + respuesta;
        galleta.setHu(alor);
        base.actualizar(galleta);
    }

    public void Empresarial(int respuesta) {
        int alor = galleta.getEm() + respuesta;
        galleta.setEm(alor);
        base.actualizar(galleta);
    }

    public void Artes(int respuesta) {
        int alor = galleta.getAr() + respuesta;
        galleta.setAr(alor);
        base.actualizar(galleta);
    }

    public void Ciencias(int respuesta) {
        int alor = galleta.getCi() + respuesta;
        galleta.setCi(alor);
        base.actualizar(galleta);
    }

    public void Ingenierias(int respuesta) {
        int alor = galleta.getIn() + respuesta;
        galleta.setIn(alor);
        base.actualizar(galleta);
    }

    public int areaA() {
        int area = Examen.get(galleta.getPos()).getArea();
        return area;
    }

    public int PHu() {
        int porcen = 5 * (galleta.getHu());
        return porcen;
    }

    public int PAr() {
        int porcen = 5 * (galleta.getAr());
        return porcen;
    }

    public int PEm() {
        int porcen = 5 * (galleta.getEm());
        return porcen;
    }

    public int PCi() {
        int porcen = 5 * (galleta.getCi());
        return porcen;
    }

    public int PIn() {
        int porcen = 5 * (galleta.getIn());
        return porcen;
    }

    public void Resetear() {
        galleta.setPos(0);
        galleta.setAr(0);
        galleta.setCi(0);
        galleta.setEm(0);
        galleta.setHu(0);
        galleta.setIn(0);
        base.actualizar(galleta);
    }

    public int Final() {
        int pos = galleta.getPos();
        if ((pos + 1) == Examen.size()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int Position() {
        return galleta.getPos();
    }

    public String Mayor() {
        String area = "";
        int max = 20;
        int T = 1;
        while (T == 1) {
            if (galleta.getAr() > max) {
                area = "ARTISTICAS";
                T = 0;
            } else {
                if (galleta.getHu() > max) {
                    area = "HUMANISTICAS";
                    T = 0;
                } else {
                    if (galleta.getCi() > max) {
                        area = "CIENCIAS";
                        T = 0;
                    } else {
                        if (galleta.getIn() > max) {
                            area = "INGENIERIAS";
                            T = 0;
                        } else {
                            if (galleta.getEm() > max) {
                                area = "EMPRESARIALES";
                                T = 0;
                            } else {
                                int res = max - 1;
                                max = res;
                            }
                        }
                    }
                }
            }
        }
        return area;
    }

}
