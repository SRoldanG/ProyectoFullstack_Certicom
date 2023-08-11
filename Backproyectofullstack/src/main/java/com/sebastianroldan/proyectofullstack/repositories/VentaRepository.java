package com.sebastianroldan.proyectofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sebastianroldan.proyectofullstack.entities.Venta;

import java.util.Date;
import java.util.List;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long>{

    List<Venta> findByFechaBetween(Date fechaInicio, Date fechaFin);
    List<Venta> findByClienteId(Long clienteId);


}
