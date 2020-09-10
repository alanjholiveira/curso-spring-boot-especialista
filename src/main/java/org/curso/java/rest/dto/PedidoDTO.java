package org.curso.java.rest.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.curso.java.validatior.NotEmpyList;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    @NotNull(message = "Informe o código do cliente")
    private Integer cliente;

    @NotNull(message = "campo Total do pedido é obrigatorio.")
    private BigDecimal total;

    @NotEmpyList(message = "Pedido não pode ser realizado sem itens.")
    private List<ItemPedidoDTO> items;
}
