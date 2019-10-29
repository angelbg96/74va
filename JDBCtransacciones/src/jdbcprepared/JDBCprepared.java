/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcprepared;

import datos.PersonasJDBC;
import datos.Conexion;
import java.sql.*;
import java.util.*;
import domain.Persona;

/**
 *
 * @author Angel BG
 */
public class JDBCprepared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se crea un obj conexion, se va a compartir para
           todos los queries que se ejecuten
        */
        Connection conn = null;
        try{
            conn = Conexion.getConnection();
            /* Se revisa si la conexion esta en modo autocomit */
            if(conn.getAutoCommit())
                conn.setAutoCommit(false);
            /* Se crea un obj PersonasJDBC y se asigna la conexion */
            PersonasJDBC personasJDBC = new PersonasJDBC(conn);
            /* Se empiezan a ejecutar sentencias
               una transaccion agrupa varias sentencias SQL
            si ocurre una falla, no se realizan los cambios en la BD
            */
            muestraReg(personasJDBC);
            personasJDBC.update(2, "Regreso2", "Regreso");
            personasJDBC.insert("Miguel2",
                "Ayala12341234123412341234123412341234123412341234123412341234123412341234123412341234");
                //"Ayala");
            conn.commit();
            muestraReg(personasJDBC);
        } catch(SQLException e){
            /* Se hace rollback en caso de error */
            try{
                System.out.println("Entramos al rollback");
                e.printStackTrace();
                /* Se hace el rollback */
                conn.rollback();
                
            } catch(SQLException el){
                el.printStackTrace();
            }
        }
        
    }
    
    public static void muestraReg(PersonasJDBC personasJDBC) throws SQLException {
        List<Persona>personas = personasJDBC.select();
        for(Persona persona:personas) {
            System.out.print(persona);
            System.out.println("");
        }
    }
    
}
