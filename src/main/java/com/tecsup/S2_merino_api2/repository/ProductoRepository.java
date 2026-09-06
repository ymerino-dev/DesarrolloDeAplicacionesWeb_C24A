package com.tecsup.S2_merino_api2.repository;

import com.tecsup.S2_merino_api2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
