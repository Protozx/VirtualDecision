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
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;

public class Distribuido {

    ArrayList<Escuela> LEscuela = new ArrayList<>();
    RegistrosEscuela ejecutar = new RegistrosEscuela();
    
    public ArrayList<Escuela> traer() {
        LEscuela = ejecutar.leer();
        return LEscuela;
    }
}
