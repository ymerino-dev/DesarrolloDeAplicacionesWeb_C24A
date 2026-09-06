package com.S1_tecsup.S1_merino_api1.controller;

import com.S1_tecsup.S1_merino_api1.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/mi-perfil")// Esta es la URL en la que entraremos
    public String mostrarPerfil(Model model){
        Persona miInfo = new Persona("Ana", "Merino", "Lima","951191394");
    model.addAttribute("Persona", miInfo);
    return "perfil";
    }
}
