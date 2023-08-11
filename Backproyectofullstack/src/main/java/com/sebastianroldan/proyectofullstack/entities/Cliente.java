package com.sebastianroldan.proyectofullstack.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

//import javax.persistence.Entity;
//import javax.persistence.GneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String email;


    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;

    public void setId(Long id) {
    }

    // getters, setters, constructores, etc.
}
