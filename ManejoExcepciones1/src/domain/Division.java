/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Angel BG
 */
public class Division {
    private int numerador;
    private int denominador;
    
    public Division(int numerador, int denominador) throws OpException {
        this.numerador = numerador;
        if(denominador == 0)
            throw new OpException("Denominador igual a cero");
        this.denominador = denominador;
    }
    
    public void visualizarOp(){
        System.out.println("El resultado de la division es = " + numerador/denominador);
    }
}
