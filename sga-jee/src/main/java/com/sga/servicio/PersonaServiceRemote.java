/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import com.sga.domain.Persona;

/**
 *
 * @author Angel BG
 */
@Remote
public interface PersonaServiceRemote {
    public List<Persona> listarPersonas();
    public Persona encontrarXid(Persona persona);
    public Persona encontrarXemail(Persona persona);
    public void registrarPersona(Persona persona);
    public void modificarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
}
