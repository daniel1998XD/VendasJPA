package br.uepg.Vendas.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.uepg.Vendas.model.Pedido;
import br.uepg.Vendas.model.Produto;
import br.uepg.Vendas.model.Pedido_produto;
import br.uepg.Vendas.repository.PedidoRepository;
import br.uepg.Vendas.repository.ProdutoRepository;
import br.uepg.Vendas.repository.Pedido_produtoRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VendasController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private Pedido_produtoRepository pedido_produtoRepository;

    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> getAllProdutos(@RequestParam(required = false) Integer id_produto) {
        try {
            List<Produto> la = new ArrayList<Produto>();

            if (id_produto == null)
                produtoRepository.findAll().forEach(la::add);
            else
                produtoRepository.findById_Produto(id_produto).forEach(la::add);

            if (la.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(la, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Pedido>> getAllPedidos(@RequestParam(required = false) Integer id_pedido) {
        try {
            List<Pedido> la = new ArrayList<Pedido>();

            if (id_pedido == null)
                pedidoRepository.findAll().forEach(la::add);
            else
                pedidoRepository.findByData_pedido(id_pedido);

            if (la.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(la, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Pedido_produto>> getAllPedidos_produtos(
            @RequestParam(required = false) Integer id_pedido) {
        try {
            List<Pedido_produto> la = new ArrayList<Pedido_produto>();

            if (id_pedido == null)
                pedido_produtoRepository.findAll().forEach(la::add);
            else
                pedido_produtoRepository.findById_pedido(id_pedido);

            if (la.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(la, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * @param pr
     * @return
     */
    @PostMapping("/produtos")
    public ResponseEntity<Produto> createProduto(@RequestBody Produto pr){
        try{
            Produto _pr = produtoRepository.save(new Produto(pr.getCodigo(), pr.getDescricao(), pr.getValor_custo(), pr.getValor_venda()));

            return new ResponseEntity<>(_pr, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}