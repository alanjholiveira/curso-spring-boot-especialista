package org.curso.java.service;

import org.curso.java.domain.entity.Pedido;
import org.curso.java.domain.enums.StatusPedido;
import org.curso.java.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
