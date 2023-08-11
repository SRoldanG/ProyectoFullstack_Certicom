package com.sebastianroldan.proyectofullstack.controllers;

import com.sebastianroldan.proyectofullstack.entities.Venta;
import com.sebastianroldan.proyectofullstack.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @CrossOrigin(origins = "http://localhost:5173")


    @GetMapping
    public List<Venta> getAllVentas() {
        return ventaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> getVentaById(@PathVariable Long id) {
        return ventaService.findById(id)
                .map(venta -> ResponseEntity.ok().body(venta))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/por-fecha")
    public List<Venta> getVentasPorFecha(
            @RequestParam("fechaInicio") Date fechaInicio,
            @RequestParam("fechaFin") Date fechaFin) {
        return ventaService.findByFechaBetween(fechaInicio, fechaFin);
    }

    @GetMapping("/por-cliente/{clienteId}")
    public List<Venta> getVentasPorCliente(@PathVariable Long clienteId) {
        return ventaService.findByCliente(clienteId);
    }

    @PostMapping
    public Venta createVenta(@RequestBody Venta venta) {
        return ventaService.save(venta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> updateVenta(@PathVariable Long id, @RequestBody Venta venta) {
        if (!ventaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        venta.setId(id);
        return ResponseEntity.ok(ventaService.save(venta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVenta(@PathVariable Long id) {
        if (!ventaService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        ventaService.delete(id);
        return ResponseEntity.ok().build();
    }

    // Puedes añadir más endpoints si es necesario

}
