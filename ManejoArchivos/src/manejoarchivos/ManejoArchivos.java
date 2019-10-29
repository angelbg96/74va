/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;
import static utileria.Archivos.*;
/**
 *
 * @author Angel BG
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    private static final String NOMBRE_ARCHIVO="C:\\zzzMisCursos\\Java\\pruebaJava.txt";
    public static void main(String[] args) {
        //Crear un archivo
        crearArchivo(NOMBRE_ARCHIVO);
        //Escribir a un archivo
        escribirArchivo(NOMBRE_ARCHIVO);
        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);
        //Anexar informaciona un archivo
        anexarArchivo(NOMBRE_ARCHIVO);
        //Leer de un archivo
        leerArchivo(NOMBRE_ARCHIVO);
    }
    
}
