/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpolimorfismo;

/**
 *
 * @author Angel BG
 */
public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    /*Se sobreescribe el metodo padre que se hereda */
    public String obtenerDetalles(){
        // se usa el metodo padre para no reescribir codigo
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }
    public String getDepto(){
        return departamento;
    }
    public void setDepto(String departamento){
        this.departamento = departamento;
    }
}
