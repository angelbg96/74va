/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import com.sga.domain.Persona;
import com.sga.servicio.PersonaService;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Angel BG
 */
public class PersonaServiceTest {
    private PersonaService personaServ;
    
    public PersonaServiceTest() {
    }
    
    @Before
    public void setUp() throws Exception{
        EJBContainer contenedor = EJBContainer.createEJBContainer();
        personaServ = (PersonaService) contenedor.getContext().lookup("java:global/classes/PersonaServiceImpl!com.sga.servicio.PersonaService");
    }
    @Test
    public void testEJBPersonaService(){
        System.out.println("\n\n\nIniciando test EJB PersonaService");
        assertTrue(personaServ != null);
        
        assertEquals(2,personaServ.listarPersonas().size());
        System.out.println("El numero de personas es igual a: " + personaServ.listarPersonas().size());
        
        this.desplegarPersonas(personaServ.listarPersonas());
        System.out.println("Fin test EJB PersonaService\n\n\n");
    }
    private void desplegarPersonas(List<Persona> personas){
        for (Persona perso : personas){
            System.out.println(perso);
        }
    }
}
