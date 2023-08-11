package com.sebastianroldan.proyectofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sebastianroldan.proyectofullstack.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{



    // Métodos CRUD básicos ya proporcionados por JpaRepository
    // Puedes añadir métodos personalizados si es necesario
}
