package com.sebastianroldan.proyectofullstack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
import java.util.Date;
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;

    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detallesVenta;


    public void setId(Long id) {
    }
}
