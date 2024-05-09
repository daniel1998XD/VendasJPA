package br.uepg.Vendas.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uepg.Vendas.model.Pedido_produto;
public interface Pedido_produtoRepository extends JpaRepository<Pedido_produto, Integer> {
    List<Pedido_produto> findById_pedido(Integer id_pedido);

    List<Pedido_produto> findById_produto(String id_produto);

}
