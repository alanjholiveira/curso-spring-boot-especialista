package org.curso.java.service;

import org.curso.java.model.Client;
import org.curso.java.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Client cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Client cliente) {
        //aplica validações
    }

}
