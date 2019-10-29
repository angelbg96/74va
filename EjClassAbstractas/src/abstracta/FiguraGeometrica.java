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
public abstract class FiguraGeometrica {
    protected String tipoFig;
    
    protected FiguraGeometrica(String tipoFig){
        this.tipoFig = tipoFig;
    }
    
    public abstract void dibujar();
    
    public String getTipoFig(){
        return tipoFig;
    }
    public void setTipoFig(String tipoFig){
        this.tipoFig = tipoFig;
    }
    @Override
    public String toString(){
        return "Tipo de Figura: " + this.tipoFig;
    }
}
