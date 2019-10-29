/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpolimorfismo;

/**
 *
 * @author Angel BG
 */
public class EjPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", 1000);
        imprimirDetalles(emp);
        Gerente ger = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetalles(ger);
    }
    /* Observamos que el tipo que recibe el metodo es de tipo padre (Empleado)
       Sin embargo al momento de ejecutar el metodo, se ejecuta el del hijo (Gerente)
       eso es el polimorfismo, multiples formas pero en tiempo de ejecucion
    */
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
