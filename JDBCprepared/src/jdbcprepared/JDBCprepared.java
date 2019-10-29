/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcprepared;

import datos.PersonasJDBC;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Angel BG
 */
public class JDBCprepared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonasJDBC personasJDBC = new PersonasJDBC();
        
        muestraReg(personasJDBC);
        //Prueba del metodo insert
        personasJDBC.insert("Alberto", "Juarez");
        muestraReg(personasJDBC);
        //Prueba del metodo update
        personasJDBC.update(2, "Nombre3", "Apellido3");
        muestraReg(personasJDBC);
        //Prueba del metodo delete
        personasJDBC.delete(1);
        muestraReg(personasJDBC);
        //Prueba del metodo select
        //Uso de un objeto persona para encapsular la informacion
        //de un registro de base de datos
        
    }
    
    public static void muestraReg(PersonasJDBC personasJDBC){
        List<Persona>personas = personasJDBC.select();
        for(Persona persona:personas) {
            System.out.print(persona);
            System.out.println("");
        }
    }
    
}
