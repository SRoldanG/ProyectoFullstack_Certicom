package com.sebastianroldan.proyectofullstack.services;

import org.springframework.stereotype.Service;
import com.sebastianroldan.proyectofullstack.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.sebastianroldan.proyectofullstack.entities.Venta;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    public List<Venta> findByFechaBetween(Date fechaInicio, Date fechaFin) {
        return ventaRepository.findByFechaBetween(fechaInicio, fechaFin);
    }

    public List<Venta> findByCliente(Long clienteId) {
        return ventaRepository.findByClienteId(clienteId);
    }

    public Optional<Venta> findById(Long id) {
        return ventaRepository.findById(id);
    }

    public Venta save(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void delete(Long id) {
        ventaRepository.deleteById(id);
    }

}

