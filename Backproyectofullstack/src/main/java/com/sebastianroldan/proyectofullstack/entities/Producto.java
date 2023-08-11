package com.sebastianroldan.proyectofullstack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;


    @OneToMany(mappedBy = "producto")
    private List<DetalleVenta> detallesVenta;

    public void setId(Long id) {
    }

    // getters, setters, constructores, etc.
}
