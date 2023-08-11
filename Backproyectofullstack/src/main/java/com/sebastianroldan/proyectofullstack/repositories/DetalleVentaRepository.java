package com.sebastianroldan.proyectofullstack.repositories;


import org.springframework.stereotype.Repository;
import com.sebastianroldan.proyectofullstack.entities.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long>{

}
