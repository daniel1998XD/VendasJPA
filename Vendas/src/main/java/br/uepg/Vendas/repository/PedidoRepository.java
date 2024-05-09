package br.uepg.Vendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uepg.Vendas.model.Pedido;
import javax.xml.crypto.Data;


public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    List<Pedido> findByData_pedido(Integer id_pedido);

    List<Pedido> findByData_remessa(Data data_remessa);
}
