package org.curso.java.service.impl;

import org.curso.java.domain.repository.Pedidos;
import org.curso.java.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
