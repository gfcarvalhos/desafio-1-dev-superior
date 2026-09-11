package com.gabrielsilva.desafio.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {
    private Double valor_basico;
    final Double PRIMEIRO_CORTE = 100.0;
    final Double SEGUNDO_CORTE = 200.0;
    final Double FRETE_MAIOR = 20.0;
    final Double FRETE_MENOR = 12.0;
    final Double ISENTO = 0.0;

    public Double valorDeFrete (Double valor_basico){
        if(valor_basico < PRIMEIRO_CORTE){
            return FRETE_MAIOR;
        } else if (valor_basico <= SEGUNDO_CORTE) {
            return FRETE_MENOR;
        }
        return ISENTO;
    }
}
