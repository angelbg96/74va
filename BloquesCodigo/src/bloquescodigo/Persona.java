/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquescodigo;

/**
 *
 * @author Angel BG
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    /* Bloque de inicialización estático*/
    static {
        System.out.println("Ejecucion de bloque estatico");
        contadorPersonas=10;
    }
    /* Bloque de codigo para inicializar atributos de la clase
       el bloque se copia a cada constructor de la clase
    */
    {
        System.out.println("Ejecucion bloque inicilizador");
    }
    
    Persona(){
        System.out.println("Ejecuta constructor");
        idPersona = ++contadorPersonas;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
}
