/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejenum;

/**
 *
 * @author Angel BG
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    // atributo de cada elemento en una numeracion
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    public int getPaises(){
        return paises;
    }
}
