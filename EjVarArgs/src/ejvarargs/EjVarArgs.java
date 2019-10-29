/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejvarargs;

/**
 *
 * @author Angel BG
 */
public class EjVarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirNum(15, 20, 3, 61, 75, 18, 10);
        System.out.println("");
        
        imprimirNumForeach(15,20,3,61,75,18,10);
        System.out.println("");
        
        variosParam("Angel",true,15,20,14);
        System.out.println("");
        
        System.out.println("Enviando un arreglo tambien funciona");
        int []arrayInt = {1,2,3,4,5};
        imprimirNumForeach(arrayInt);
    }
    
    public static void imprimirNum(int... numeros){
        int elemento;
        for(int i=0; i<numeros.length; i++){
            elemento = numeros[i];
            System.out.println("Elemento " + i + ": " + elemento);
        }
    }
    public static void imprimirNumForeach(int... numeros){
        for(int numero: numeros){
            System.out.println("El numero es: " + numero);
        }
    }
    public static void variosParam(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Valido: " + valido);
        for(int numero: numeros){
            System.out.println("El numero es: " + numero);
        }
    }
}
