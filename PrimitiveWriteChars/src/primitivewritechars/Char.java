package primitivewritechars;

import java.io.*;
public class Char {
    public static void Escribir(){
        File direc;
        String linea="hola.....";
        DataOutputStream salida=null;
        direc=new File("texto.dat");
        try{
            salida=new DataOutputStream(new FileOutputStream(direc));
            for(int i=0;i<2;++i){
                System.out.println("Escribiendo cadena: " + linea);
                salida.writeChars(linea);
                System.out.println("Espacio string: " +linea.length() + " caracteres");
                System.out.println("Se escribieron: " + salida.size() + " Bytes");
            }
            
        }catch(IOException e){
            System.out.println("Error operando archivo");
        }finally{
            if(salida != null){
                try{
                    salida.close();
                }catch(IOException e2){
                    System.out.println("Hubo un error al cerrar el archivo");
                }
            }
        }
    }
    public static void leer(){
        File direc;
        DataInputStream entrada=null;
        String linea="";
        direc=new File("texto.dat");
        
        try{
            entrada=new DataInputStream(new FileInputStream(direc));
            while(entrada.available()!=0){
                for(int i=0;i<19;i++){
                    linea=linea+entrada.readChar();
                }
                System.out.println("cadena leida: " + linea);
                System.out.println("Quedan: " + entrada.available() + " bytes por leer");
                linea="";
                }
        }catch(IOException e){
            System.out.println("Error al operar con el archivo");
        }finally{
            if(entrada != null){
                try{
                    entrada.close();
                }catch(IOException e2){
                    System.out.println("Hubo un error al cerrar el archivo");
                }
            }
        }
    }
}
