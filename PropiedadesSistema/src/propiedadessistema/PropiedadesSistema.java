/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadessistema;
import java.util.*;

/**
 *
 * @author Angel BG
 */
public class PropiedadesSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties propiedades = System.getProperties();
        Enumeration nombreProps = propiedades.propertyNames();
        while(nombreProps.hasMoreElements()){
            String nombreProp = (String) nombreProps.nextElement();
            String valorProp = propiedades.getProperty(nombreProp);
            System.out.println("Llave: " + nombreProp + " = " + valorProp);
        }
    }
    
}
