package com.tecsup.S2_merino_api2.controller;

import com.tecsup.S2_merino_api2.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    // Inyección de dependencias mediante el constructor
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/lista")
    public String verProductos(Model model) {
        // Obtenemos los productos de la BD y los guardamos en el modelo
        model.addAttribute("productos", productoService.listarProductos());

        // Retorna el nombre exacto del archivo HTML (sin el .html)
        return "productos";
    }
}