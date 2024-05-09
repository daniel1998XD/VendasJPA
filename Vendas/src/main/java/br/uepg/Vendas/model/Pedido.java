package br.uepg.Vendas.model;

import javax.xml.crypto.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")

public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_pedido;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_funcionario;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;

    @Column
    private Data data_pedido;
    
    @Column
    private Data data_remessa;

    public Pedido(){

    }

    public Pedido(Data data_pedido, Data data_remessa){
        this.data_pedido = data_pedido;
        this.data_remessa = data_remessa;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Data getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Data data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Data getData_remessa() {
        return data_remessa;
    }

    public void setData_remessa(Data data_remessa) {
        this.data_remessa = data_remessa;
    }   

}
