package org.curso.java;

import org.curso.java.domain.entity.Cliente;
import org.curso.java.domain.entity.Pedido;
import org.curso.java.domain.repository.Clientes;
import org.curso.java.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(
            @Autowired Clientes clientes,
            @Autowired Pedidos pedidos) {
        return args -> {
            System.out.println("Salvando clientes");
            Cliente client = new Cliente("Alan");
            clientes.save(client);

            Pedido p = new Pedido();
            p.setCliente(client);
            p.setDataPedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(100));
            pedidos.save(p);

//            Cliente clienteFetchPedidos = clientes.findClienteFetchPedidos(client.getId());
//            System.out.println(clienteFetchPedidos);
//            System.out.println(clienteFetchPedidos.getPedidos());

            pedidos.findByCliente(client).forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
