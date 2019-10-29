/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sga.servicio;

import javax.inject.Inject;
import java.util.List;
import javax.ejb.Stateless;
import com.sga.domain.Persona;
import com.sga.eis.PersonaDAO;
/**
 *
 * @author Angel BG
 */
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
    @Inject
    private PersonaDAO personaDao;
    
    @Override
    public List<Persona> listarPersonas(){
        return personaDao.findAllPersonas();
    }
    @Override
    public Persona encontrarXid(Persona persona){
        return personaDao.findPersonaById(persona);
    }
    @Override
    public Persona encontrarXemail(Persona persona){
        return personaDao.findPersonaByEmail(persona);
    }
    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }
    @Override
    public void modificarPersona(Persona persona){
        personaDao.updatePersona(persona);
    }
    @Override
    public void eliminarPersona(Persona persona){
        personaDao.deletePersona(persona);
    }
}
