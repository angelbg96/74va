/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocoleeciones;
import java.util.*;

/**
 *
 * @author Angel BG
 */
public class ManejoColeeciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List miLista = new ArrayList();
        /* al no especificarle algun tipo a la lista, por default es object */
        miLista.add(1);
        miLista.add("2");
        miLista.add("2");
        miLista.add(3.1416);
        imprimir("Lista",miLista);
        
        Set miSet = new HashSet();
        miSet.add(100);
        miSet.add("200");
        miSet.add("200");
        miSet.add(314.16);
        imprimir("Set",miSet);
        
        Map miMapa = new HashMap();
        /* put( llave , valor ) */
        miMapa.put("1","Juan");
        miMapa.put(2.48,2);
        miMapa.put("3", 3);
        miMapa.put("3", "3ro"); // sobreecribe al valor pasado
        miMapa.put(3, "Angel");
        miMapa.put("last",1.68);
        imprimir("Llaves de mapa",miMapa.keySet());
        imprimir("Valores de mapa",miMapa.values());
    }
    
    private static void imprimir(String tipo, Collection coleccion){
        System.out.println(tipo + ": ");
        /* List, Set y Map descienden de Collection, se usa concepto polimorfismo */
        for(Object elemento : coleccion){
            System.out.print(elemento + " ");
        }
        System.out.println("\n");
    }
}
