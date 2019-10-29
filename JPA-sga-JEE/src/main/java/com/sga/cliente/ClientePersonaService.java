/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sga.cliente;

import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import com.sga.domain.Persona;
import com.sga.servicio.PersonaServiceRemote;
/**
 *
 * @author Angel BG
 */
public class ClientePersonaService {
    
    public static void main(String[] args){
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try{
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            for(Persona persona : personas){
                System.out.println(persona);
            }
            System.out.println("\nFin de llamada al EJB desde cliente\n");
        } catch(NamingException e){
            e.printStackTrace();
        }
    }
}
