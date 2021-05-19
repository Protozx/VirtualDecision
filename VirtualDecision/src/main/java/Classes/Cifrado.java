/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.*;
import java.security.*;
import java.util.ArrayList;
import javax.crypto.*;

/**
 *
 * @author Eidan Plata
 */
public class Cifrado {

    public SealedObject Cifrar(ArrayList<Escuela> LEscuela) throws InvalidKeyException, IOException, NoSuchAlgorithmException, IllegalBlockSizeException, NoSuchPaddingException {

        KeyGenerator gen = KeyGenerator.getInstance("AES");
        gen.init(128);
        Key sKey = gen.generateKey();

        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, sKey);
        SealedObject so = new SealedObject(LEscuela, c);
        try {
//Generate a key

// do the sealing
            SealedObject sello = new SealedObject(LEscuela, c);

        } catch (Exception e) {
            System.out.println(e);
        }
        return so;
    }
}
