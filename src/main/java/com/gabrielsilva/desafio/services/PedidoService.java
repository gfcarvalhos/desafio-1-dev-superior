package com.gabrielsilva.desafio.services;


import com.gabrielsilva.desafio.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private FreteService freteService;

    public PedidoService(FreteService freteService) {
        this.freteService = freteService;
    }

    private Double valorTotal(Double valorBasico, Double porcentagemDesconto) {
        return valorBasico - (valorBasico * (porcentagemDesconto / 100)) + freteService.valorDeFrete(valorBasico);
    }


    public String pedidoFinal(Pedido pedido){
        return String.format("Pedido código %s \nValor total: %.2f", pedido.getCodigo(), this.valorTotal(pedido.getvalorBasico(), pedido.getPorcentagemDesconto()));
    }
}
