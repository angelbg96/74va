/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjdbc;
import java.sql.*;
/**
 *
 * @author Angel BG
 */
public class IntroJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cadena de conexión de MySql, el parametro useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
        // Se carga el driver de mysql
        try{
            Class.forName("com.mysql.jdbc.Driver");
            /* Se crea el objeto conexion */
            Connection conexion = (Connection) DriverManager.getConnection(url,"root","admin");
            /* Se crea el objeto Statement */
            Statement instruccion = conexion.createStatement();
            /* Se crea el query */
            String sql = "select id_persona,nombre,apellido from persona";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()){
                System.out.print("Id: " + result.getInt(1));
                System.out.print(" Nombre: " + result.getString(2));
                System.out.println(" Apeliido: " + result.getString(3));
            }
            /* Cerrar cada objeto utilizado */
            result.close();
            instruccion.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
}
