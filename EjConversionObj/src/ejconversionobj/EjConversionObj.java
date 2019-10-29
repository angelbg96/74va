/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejconversionobj;

/**
 *
 * @author Angel BG
 */
public class EjConversionObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Creamos un tipo de mas alta jerarquia
        Empleado empleado;
        /* Asignamos una referencia de un objeto de menor jerarquia
           Esto es upcasting, no hay necesidad de una notacion especial
        */
        empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);
        /* Sin embargo si quisieramos acceder al detalle de la clase Escritor
           No es posible, ya que esas caracteristicas no están en comun
           entre todas las clases de la jerarquia de clases
        */
        imprimirDetalles(empleado);
        //2. Podemos hacer lo mismo con la clase Gerente
        //Esto es upcasting, por lo que no requiere una sintaxis especial
        empleado = new Gerente("Laura", 18000, "Sistemas");
        /* Pero si queremos acceder directo por la variable empleado
           al detalle del objeto Gerente no es posible
        */
        imprimirDetalles(empleado);
    }
    
    private static void imprimirDetalles(Empleado empleado) {
        String resultado = null;
        /* Imprimir detalles es general para todos ya que es por polimorfismo
           no se necesita de ninguna conversion
        */
        System.out.println("\nDetalle: " + empleado.obtenerDetalles());
        //Pero los detalles de cada clase debemos hacer un downcasting
        if(empleado instanceof Escritor) {
            //Convertimos el objeto al tipo inferior deseado
            Escritor escritor = (Escritor) empleado;
            //Finalmente podemos acceder a los metodosde la clase Escritor
            resultado = escritor.tipoE.getDescripcion();
            System.out.println("resultado tipo Escritura: "+resultado);
        } else if(empleado instanceof Gerente) {
            /* Otra forma es hacer downcasting es en la misma linea de codigo.
               para evitar la creacionde variables innecesarias
            */
            resultado =((Gerente) empleado).getDepto();
            System.out.println("resultado departamento: "+resultado);
        }
    }
    
}
