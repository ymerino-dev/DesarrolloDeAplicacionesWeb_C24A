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

    // Inyectamos el Service mediante el constructor
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Creamos la ruta web para listar los productos
    @GetMapping("/lista")
    public String verProductos(Model model) {
        // Obtenemos los productos y los enviamos al HTML con el nombre "productos"
        model.addAttribute("productos", productoService.listarProductos());

        // Retornamos el nombre exacto de la vista HTML (productos.html)
        return "productos";
    }
}