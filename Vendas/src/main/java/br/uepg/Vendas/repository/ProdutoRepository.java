package br.uepg.Vendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uepg.Vendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
    List<Produto> findByValor_custo(float valor_custo);

    List<Produto> findById_Produto(float id_produto);

}
