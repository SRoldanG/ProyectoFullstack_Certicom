package com.sebastianroldan.proyectofullstack.controllers;

import com.sebastianroldan.proyectofullstack.entities.DetalleVenta;
import com.sebastianroldan.proyectofullstack.services.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/detalleventas")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @CrossOrigin(origins = "http://localhost:5173")


    @GetMapping
    public List<DetalleVenta> getAllDetalleVentas() {
        return detalleVentaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> getDetalleVentaById(@PathVariable Long id) {
        return detalleVentaService.findById(id)
                .map(detalleVenta -> ResponseEntity.ok().body(detalleVenta))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetalleVenta createDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.save(detalleVenta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleVenta> updateDetalleVenta(@PathVariable Long id, @RequestBody DetalleVenta detalleVenta) {
        if (!detalleVentaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        detalleVenta.setId(id);
        return ResponseEntity.ok(detalleVentaService.save(detalleVenta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDetalleVenta(@PathVariable Long id) {
        if (!detalleVentaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        detalleVentaService.delete(id);
        return ResponseEntity.ok().build();
    }



}
