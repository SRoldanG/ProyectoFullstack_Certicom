package com.sebastianroldan.proyectofullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sebastianroldan.proyectofullstack.repositories.ClienteRepository;
import com.sebastianroldan.proyectofullstack.entities.Cliente;
import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    // Aquí puedes agregar métodos para operaciones CRUD y cualquier otra lógica de negocio que necesites.
}
