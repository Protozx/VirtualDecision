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

public class RegistrosEscuela {

    ArrayList<Escuela> guardado = new ArrayList<>();

    ArrayList<Escuela> leer() {
        try {
            ObjectInputStream objLectura = new ObjectInputStream(new FileInputStream("school.dat"));
            guardado = (ArrayList<Escuela>) objLectura.readObject();
        } catch (IOException | ClassNotFoundException e) {
            
        }
        return guardado;
    }
    
    void Guardar(ArrayList<Escuela> ListaSeriar){
        try{
            ObjectOutputStream objGrabar = new ObjectOutputStream(new FileOutputStream("school.dat"));
            objGrabar.writeObject(ListaSeriar);
            objGrabar.close();
        }
        catch (IOException e){
        }
    }
}
