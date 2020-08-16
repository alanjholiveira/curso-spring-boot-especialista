package org.curso.java.domain.repositorio;

import org.curso.java.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);

    /**
     * Exemplo Query Methods
     */
    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);
    Cliente findOneByNome(String nome);
    boolean existsByNome(String nome);

    /**
     *Trabalhando com @Query()
     */
    //    @Query(value = " select * from cliente c where c.nome like '%nome%' ", nativeQuery = true)
    @Query(value = " select c from Cliente c where c.nome like :nome ")
    List<Cliente> encontrarPorNome( @Param("nome") String nome);

    @Query("delete from Cliente c where c.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);
}
