/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejclassabstractas;
import abstracta.*;

/**
 *
 * @author Angel BG
 */
public class EjClassAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        System.out.println("");
        System.out.println(circulo);
    }
    
}
