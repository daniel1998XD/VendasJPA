package br.uepg.Vendas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido_produto")

public class Pedido_produto {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @Column
    private int quantidade;

    @Column
    private double preco_unitario;

    @Column
    private double desconto;

    public Pedido_produto(){

    }

    public Pedido_produto(int quantidade, float preco_unitario, float desconto){
        this.quantidade=quantidade;
        this.preco_unitario=preco_unitario;
        this.desconto=desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    
}
