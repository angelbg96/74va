/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcpatrones;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDAO;
import personas.jdbc.PersonaDaoJDBC;
/**
 *
 * @author Angel BG
 */
public class JDBCpatrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Se utiliza el tipo interface como referencia a una clase concreta */
        PersonaDAO personaDao = new PersonaDaoJDBC();
        /* Se crea un nuevo registro. Se hacemos uso de la clase personaDTO,
           la cual se usa para transferir la informacion entre las capas
           no es necesario especificar la llave primaria, ya que en este caso
           es de tipo autonumerico y la BD se encarga de asignarle un nuevo valor
        */
        PersonaDTO persona = new PersonaDTO();
        persona.setNombre("Mario");
        persona.setApellido("Lopez01");
        /* Se utiliza la capa DAO para persistir el objeto DTO */
        try {
            //personaDao.insert(persona);
            /* Eliminamos un registro, el id 3 */
            //personaDao.delete( new PersonaDTO(3));
            /* Actualizamos un registro */
            PersonaDTO personaTmp = new PersonaDTO();
            personaTmp.setId_persona(2);//actualizamos el registro 2
            // personaTmp.setNombre("Mario");
            // personaTmp.setApellido("lopez02");
            // personaDao.update(personaTmp);
            /* Se seleccionan todos los registros */
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO personaDTO : personas) {
                System.out.print( personaDTO );
                System.out.println();
            }
        } catch(SQLException e){
            System.out.println("Excepcion en la capa de prueba");
            e.printStackTrace();
        }
    }
    
}
