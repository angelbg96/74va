/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecgenericas;
import java.util.*;
/**
 *
 * @author Angel BG
 */
public class ManejoColecGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Lista de tipo Double */
        List<Double> miLista = new ArrayList<Double>();
        miLista.add(1.0);
        miLista.add(2.0);
        miLista.add(3.0);
        miLista.add(3.0);
        imprimir("Lista",miLista);
        
        /* Set de tipo String Se utiliza la inferencia del tipo del lado derecho */
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimir("Set",miSet);
        
        Map<Integer, String> miMapa = new HashMap<>();
        miMapa.put(1,"juan");
        miMapa.put(2,"Carlos");
        miMapa.put(3,"Angel");
        miMapa.put(4,"Rosario");
        imprimir("Llaves de mapa",miMapa.keySet());
        imprimir("Valores de mapa",miMapa.values());
        
    }
    /* El metodo imprimir se mantiene de forma general para utilizarlo en los tres casos
       independientemente del tipo de coleccion que se haya especificado en el generics
    */
    private static void imprimir(String tipo, Collection coleccion){
        System.out.println(tipo + ": ");
        /* List, Set y Map descienden de Collection, se usa concepto polimorfismo */
        for(Object elemento : coleccion){
            System.out.print(elemento + " ");
        }
        System.out.println("\n");
    }

}
