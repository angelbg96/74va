/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Angel BG
 */
public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(String tipoFig){
        super(tipoFig);
    }
    public void dibujar() {
        //Comportamiento de la subclase
        System.out.println("Aquí debería dibujar un:" + this.getClass().getSimpleName());
    }
}
