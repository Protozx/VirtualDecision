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
    RegistrosUsuario base = new RegistrosUsuario();
    usuario vivo = new usuario();

    Jefe() {
        BUser = base.leer();
        BReporte = base.leerR();
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
    
    public void cambiar(int pos, String idU, String idA, String nombreU, String nombreA, String fecha, String descripcion) {
        BReporte.get(pos).setDescripcion(descripcion);
        BReporte.get(pos).setFecha(fecha);
        BReporte.get(pos).setIdA(idA);
        BReporte.get(pos).setIdU(idU);
        BReporte.get(pos).setNombreA(nombreA);
        BReporte.get(pos).setNombreU(nombreU);
        base.GuardarR(BReporte);
    }

}
