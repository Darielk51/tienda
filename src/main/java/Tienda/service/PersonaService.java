/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.service;

import Tienda.entity.Pais;
import Tienda.entity.Persona;
import Tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jvlan
 */
public class PersonaService implements IPersonaService {
@Autowired 
private PersonaRepository personaRepository; 
   
@Override
    public List<Persona> getAllPersona() {
     return (List<Persona>)personaRepository.findAll();
    }

    @Override
    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona Persona) {
         personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
         personaRepository.deleteById(id);
    }

    @Override
    public List<Pais> liscountry() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Pais> getAllPerona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
