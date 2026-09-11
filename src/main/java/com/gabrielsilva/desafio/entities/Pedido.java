package com.gabrielsilva.desafio.entities;


public class Pedido {

    private int codigo;
    private Double valorBasico;
    private Double porcentagemDesconto;

    public Pedido(int codigo, Double valorBasico, Double porcentagemDesconto){
        this.codigo = codigo;
        this.porcentagemDesconto = porcentagemDesconto;
        this.valorBasico = valorBasico;
    }

    public int getCodigo() {
        return codigo;
    }

    public Double getvalorBasico() {
        return valorBasico;
    }

    public Double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }
}
