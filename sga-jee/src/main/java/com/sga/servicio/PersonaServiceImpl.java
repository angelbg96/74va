/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import com.sga.domain.Persona;
/**
 *
 * @author Angel BG
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    @Override
    public List<Persona> listarPersonas(){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","Suarez","jperez@gmail.com","55667788"));
        personas.add(new Persona(2,"Martha","Suarez","Jimenez","msuarez@gmail.com","55113399"));
        return personas;
    }
    @Override
    public Persona encontrarXid(Persona persona){
        return null;
    }
    @Override
    public Persona encontrarXemail(Persona persona){
        return null;
    }
    @Override
    public void registrarPersona(Persona persona) {}
    @Override
    public void modificarPersona(Persona persona){}
    @Override
    public void eliminarPersona(Persona persona){}
}
