/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utileria;
import java.io.*;
/**
 *
 * @author Angel BG
 */
public class Archivos {
    public static void crearArchivo(String nombreA){
        File archivo = new File(nombreA);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void escribirArchivo(String nombreA){
        File archivo = new File(nombreA);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido + "\n");
            salida.println("Fin de Escritura\n");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void leerArchivo(String nombreA){
        File archivo = new File(nombreA);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("Lecturas: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void anexarArchivo(String nombreA){
        File archivo = new File(nombreA);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando informacion al archivo";
            salida.println(contenido + "\n");
            salida.println("Fin de anexar\n");
            salida.close();
            System.out.println("Se ha anexado ña informacion correctamente");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
