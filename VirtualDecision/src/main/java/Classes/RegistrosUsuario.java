/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RegistrosUsuario {

    ArrayList<usuario> guardado = new ArrayList<>();
    ArrayList<Reporte> salbado = new ArrayList<>();
    ArrayList<Pregunta> seguro = new ArrayList<>();
    usuario activo = new usuario();
    Respuestas ahora = new Respuestas();
    
    ArrayList<usuario> leer() {
        try {
            ObjectInputStream objLectura = new ObjectInputStream(new FileInputStream("C:/Users/Eidan Plata/Desktop/users.dat"));
            guardado = (ArrayList<usuario>) objLectura.readObject();
        } catch (IOException | ClassNotFoundException e) {
            
        }
        return guardado;
    }
    
    void Guardar(ArrayList<usuario> ListaSeriar){
        try{
            ObjectOutputStream objGrabar = new ObjectOutputStream(new FileOutputStream("C:/Users/Eidan Plata/Desktop/users.dat"));
            objGrabar.writeObject(ListaSeriar);
            objGrabar.close();
        }
        catch (IOException e){
        }
    }
    
    ArrayList<Pregunta> leerE() {
        try {
            ObjectInputStream objLectura = new ObjectInputStream(new FileInputStream("C:/Users/Eidan Plata/Desktop/examen.dat"));
            seguro = (ArrayList<Pregunta>) objLectura.readObject();
        } catch (IOException | ClassNotFoundException e) {
            
        }
        return seguro;
    }
    
    void GuardarE(ArrayList<Pregunta> ListaSerial){
        try{
            ObjectOutputStream objGrabar = new ObjectOutputStream(new FileOutputStream("C:/Users/Eidan Plata/Desktop/examen.dat"));
            objGrabar.writeObject(ListaSerial);
            objGrabar.close();
        }
        catch (IOException e){
        }
    }
    
    ArrayList<Reporte> leerR() {
        try {
            ObjectInputStream objLectura = new ObjectInputStream(new FileInputStream("C:/Users/Eidan Plata/Desktop/reports.dat"));
            salbado = (ArrayList<Reporte>) objLectura.readObject();
        } catch (IOException | ClassNotFoundException e) {
            
        }
        return salbado;
    }
    
    void GuardarR(ArrayList<Reporte> paquete){
        try{
            ObjectOutputStream objGrabar = new ObjectOutputStream(new FileOutputStream("C:/Users/Eidan Plata/Desktop/reports.dat"));
            objGrabar.writeObject(paquete);
            objGrabar.close();
        }
        catch (IOException e){
        }
    }
    
    usuario usar() {
        try {
            ObjectInputStream objLectura = new ObjectInputStream(new FileInputStream("C:/Users/Eidan Plata/Desktop/activo.dat"));
            activo = (usuario) objLectura.readObject();
        } catch (IOException | ClassNotFoundException e) {
            
        }
        return activo;
    }
    
    void login(usuario active){
        try{
            ObjectOutputStream objGrabar = new ObjectOutputStream(new FileOutputStream("C:/Users/Eidan Plata/Desktop/activo.dat"));
            objGrabar.writeObject(active);
            objGrabar.close();
        }
        catch (IOException e){
        }
    }
    
    Respuestas actual() {
        try {
            ObjectInputStream objLectura = new ObjectInputStream(new FileInputStream("C:/Users/Eidan Plata/Desktop/respuestas.dat"));
            ahora = (Respuestas) objLectura.readObject();
        } catch (IOException | ClassNotFoundException e) {
            
        }
        return ahora;
    }
    
    void actualizar(Respuestas cookie){
        try{
            ObjectOutputStream objGrabar = new ObjectOutputStream(new FileOutputStream("C:/Users/Eidan Plata/Desktop/respuestas.dat"));
            objGrabar.writeObject(cookie);
            objGrabar.close();
        }
        catch (IOException e){
        }
    }
    
}

