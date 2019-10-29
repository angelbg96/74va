/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcpool;

import capaDatos.pool.PoolMySQL;
import capaDatos.pool.PoolOracle;
import java.sql.*;
/**
 *
 * @author Angel BG
 */
public class TestJDBCPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            /* Se implementa el pool de MySQL */
            conn = PoolMySQL.getConexion();
            System.out.println("Utilizando el pool de conexiones de MySQL");
            stmt = conn.prepareStatement("SELECT * FROM persona");
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.print(" " + rs.getInt(1));//id_persona
                System.out.print(" " + rs.getString(2));//nombre
                System.out.println(" " + rs.getString(3));//apellido
            }
            conn.close();
            /* Se implementa el pool de Oracle */
            /* conn = PoolOracle.getConexion();
            System.out.println("Utilizamos el pool de conexiones de Oracle");
            stmt  =conn.prepareStatement("SELECT * FROM employees WHERE employee_idin(100,101,102)");
            rs = stmt.executeQuery();
            while(rs.next()){
                System.out.print(" "+rs.getInt(1));//empleado_id
                System.out.print(" "+rs.getString(2));//nombre
                System.out.println(" "+rs.getString(3));//apellido
            }
            /* Se cierra la conexion para regresarla al pool */
            // conn.close();
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
