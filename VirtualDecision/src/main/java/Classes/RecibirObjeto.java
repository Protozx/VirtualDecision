/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;
import java.net.*;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eidan Plata
 */
public class RecibirObjeto {

    public static void main(String args[])throws IOException, ClassNotFoundException {
        RegistrosEscuela ejecutar = new RegistrosEscuela();
        Escuela pack = new Escuela();
        try {
            final int puerto = 6000;

            Socket socket = new Socket("192.168.1.82", puerto);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Key sKey;

            final int puerto1 = 7000;

            Socket socket1 = new Socket("192.168.1.82", puerto1);

            ObjectInputStream flujo = new ObjectInputStream(socket1.getInputStream());

            sKey = (Key) flujo.readObject();


//Read the sealed object
            SealedObject so = (SealedObject) ois.readObject();
            ArrayList<Escuela> car = (ArrayList<Escuela>) so.getObject(sKey);
            ejecutar.Guardar(car);
            System.out.println("Lo guardé");
            System.out.println("Lo leí");
            System.out.println(car.get(0).getNombre());
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
