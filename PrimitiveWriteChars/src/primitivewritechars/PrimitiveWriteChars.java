/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivewritechars;

import java.io.*;

/**
 *
 * @author YO
 */
public class PrimitiveWriteChars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Char.Escribir();
        Char.leer();
        
        /*try {
        //Para no sobreescribir hay que poner true aumentando su tamaño, con false sobreescribe
           DataInputStream leer =new DataInputStream(new BufferedInputStream(new FileInputStream("texto.txt")));
           DataOutputStream escribir =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("texto.txt")));

           int c;
            //Hay que escribir primero para luego leer. No es como en los ficheros de los ej. anteriores
            escribir.writeChars("hace frio");
            escribir.writeChars("hace frio");
            escribir.close();
            //Mientras tenga algo que leer que escriba
            while ((c = leer.available())!=0 ) {
               char cadea = leer.readChar();     
               System.out.print(cadea);
            } 
            leer.close();
            
        } catch (Exception e) {
        }*/
    }
    
}
