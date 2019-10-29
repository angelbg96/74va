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
public class OpException extends Exception {
    public OpException(String msj){
        // Se inicial el msj de error de la clase padre
        super(msj);
    }
}
