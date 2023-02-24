/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.controller;

import ch.qos.logback.core.model.Model;
import Tienda.entity.Pais;
import Tienda.entity.Persona;
import Tienda.service.IPaisService;
import Tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jvlan
 */
public class PersonaController {

    @Autowired
    private IPaisService paisService;

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/persona")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPerona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String crearPerona (Model model) {
        List<Pais> listaPaises = paisService.liscountry();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises ", listaPaises);
        return "crear";
    }
}
