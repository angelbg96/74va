/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones1;

import domain.*;
/**
 *
 * @author Angel BG
 */
public class ManejoExcepcionesArg {
/* Para poner en funcionamiento este Main, se debe dar click derecho en el nombre del proyecto
 * propiedades > run > Main Class: [click en Browse] y seleccionar este MainArgs
 * en el cuadro de texto de texto Argumentos, poner los argumentos deseados separados por un espacio
*/
    public static void main(String args[]) throws OpException {
        try{
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1,op2);
            div.visualizarOp();
        } catch(ArrayIndexOutOfBoundsException aie){
            System.out.print("Ocurrió una excepción: ");
            System.out.println("Hubo un error al acceder un elemento fuera de rango");
            aie.printStackTrace();
        } catch(NumberFormatException nfe){
            System.out.print("Ocurrió una excepción: ");
            System.out.println("Uno de los argumentos no es entero");
            nfe.printStackTrace();
        } catch(OpException oe){
            System.out.print("Ocurrió una excepción: ");
            System.out.println("Se trató de realizar una operación erronea");
            oe.printStackTrace();
        } finally {
            System.out.println("Fin del proceso de ");
        }
    }
}
