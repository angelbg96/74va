/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones2;

import datos.*;
import excepciones.*;
/**
 *
 * @author Angel BG
 */
public class ManejoExcepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(true);
        ejecutar(datos,"listar");
        
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos,"insertar");
    }
    
    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            try{
                datos.listar();
            }
            /* Si se van a procesar varias excepciones
               siempre se debe procesar primero la excepcion de menor jerarquia
               y posteriormente la de mayor jerarquia
            */
            catch(LecturaDatosEx ex){
                System.out.println("Error lectura: Procesa la excepcion mas especifica de lectura de datos");
            } catch (AccesoDatosEx ex){
                System.out.println("Error Acceso datos: Procesa la excepcion mas generica de acceso a datos");
            } catch(Exception ex){
                System.out.println("Error general");
            } finally {
                System.out.println("Procesando finally, siempre se ejecutara sin importar si hubo error o no");
            }
        } else if("insertar".equals(accion)){
            try{
                datos.insertar();
            } catch(AccesoDatosEx ex){
                System.out.println("Error acceso datos: Podemos procesar solo la excepcion mas generica");
            } finally{
                System.out.println("Procesando finally, siempre se ejecutara sin importar si hubo error o no");
            }
        } else System.out.println("No se proporciono ninguna accion conocida");
    }
}
