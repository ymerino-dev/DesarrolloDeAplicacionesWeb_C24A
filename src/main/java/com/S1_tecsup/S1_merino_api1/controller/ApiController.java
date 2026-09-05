package com.S1_tecsup.S1_merino_api1.controller;

import com.S1_tecsup.S1_merino_api1.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Esta es la ruta principal
public class ApiController {

    @GetMapping("/mi-info") // Esta es la sub-ruta
    public Persona obtenerInfoApi() {

        // Creamos de nuevo tu objeto con tus datos
        Persona miInfo = new Persona("Ana", "Merino", "Lima", "951191394");

        // Al retornar el objeto directamente, @RestController lo convierte a JSON automáticamente
        return miInfo;
    }
}