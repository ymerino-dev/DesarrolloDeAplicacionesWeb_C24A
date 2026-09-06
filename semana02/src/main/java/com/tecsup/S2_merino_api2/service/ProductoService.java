package com.tecsup.S2_merino_api2.service;

import com.tecsup.S2_merino_api2.model.Producto;
import com.tecsup.S2_merino_api2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
}