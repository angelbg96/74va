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
public class Escritor extends Empleado {
    final TipoEscritura tipoE;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoE){
        super(nombre,sueldo);
        this.tipoE = tipoE;
    }
    
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipo de Escritura: " + tipoE.getDescripcion();
    }
    public TipoEscritura getTipoE(){
        return tipoE;
    }
    public String getTipoETexto(){
        return tipoE.getDescripcion();
    }
    
}
