/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import domain.Persona;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Angel BG
 */
public class PersonasJDBC {
    /* Nos apoyamos de la llave primaria autoincrementablede MySql
        por lo que se omite el campo de persona_id
        Se utiliza un prepareStatement, por lo que podemos
        utilizar parametros(signos de ?)
        los cuales posteriormente será sustituidos por el parametro respectivo
    */
    private final String SQL_INSERT = "INSERT INTO persona(nombre,apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT id_persona,nombre,apellido FROM persona ORDER BY id_persona";
    
    public int insert(String nombre, String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null; // no se usa en este ejercicio
        int rows = 0; // registros afectados
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1; // var. para las columnas
            stmt.setString(index++, nombre); // 1er param -> ?
            stmt.setString(index,apellido); // 2do param -> ?
            System.out.println("Ejecutando query: SQL_INSERT");
            rows = stmt.executeUpdate(); // cantidad de registros afectados
            System.out.println("Registros afectados: " + rows);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int update(int id_persona, String nombre, String apellido){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        }catch(SQLException e){
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int delete(int id_persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public List <Persona> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<Persona>();
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            int id_persona;
            String nombre;
            String apellido;
            while(rs.next()){
                id_persona = rs.getInt(1);
                nombre = rs.getString(2);
                apellido = rs.getString(3);
                persona = new Persona();
                persona.setId_perso(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personas.add(persona);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return personas;
    }
}
