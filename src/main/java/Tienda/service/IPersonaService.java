/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.service;

import Tienda.entity.Pais;
import Tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author jvlan
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona (Persona Persona);
    public void delete (long id);

    public List<Pais> liscountry();

    public List<Pais> getAllPerona();
}
