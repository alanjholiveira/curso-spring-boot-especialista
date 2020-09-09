package org.curso.java.service;

import org.curso.java.domain.entity.Pedido;
import org.curso.java.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

}
