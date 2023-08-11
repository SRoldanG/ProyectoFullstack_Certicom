package com.sebastianroldan.proyectofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sebastianroldan.proyectofullstack.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos CRUD básicos ya proporcionados por JpaRepository
    // Puedes añadir métodos personalizados si es necesario
}