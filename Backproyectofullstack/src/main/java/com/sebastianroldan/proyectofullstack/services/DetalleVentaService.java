package com.sebastianroldan.proyectofullstack.services;
import org.springframework.stereotype.Service;
import com.sebastianroldan.proyectofullstack.repositories.DetalleVentaRepository;
import com.sebastianroldan.proyectofullstack.entities.DetalleVenta;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVenta> findAll() {
        return detalleVentaRepository.findAll();
    }

    public Optional<DetalleVenta> findById(Long id) {
        return detalleVentaRepository.findById(id);
    }

    public DetalleVenta save(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    public void delete(Long id) {
        detalleVentaRepository.deleteById(id);
    }

}
