package org.curso.java.domain.repository;

import org.curso.java.domain.entity.Cliente;
import org.curso.java.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
