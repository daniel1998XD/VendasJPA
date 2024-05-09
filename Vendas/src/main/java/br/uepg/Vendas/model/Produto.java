package br.uepg.Vendas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_produto;

    @Column
    private String codigo;

    @Column
    private String descricao;

    @Column
    private Double valor_custo;

    @Column
    private Double valor_venda;

    public Produto() {

    }

    public Produto(String codigo, String descricao, Double valor_custo, Double valor_venda) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_custo = valor_custo;
        this.valor_venda = valor_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor_custo() {
        return valor_custo;
    }

    public void setValor_custo(Double valor_custo) {
        this.valor_custo = valor_custo;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    

    

}