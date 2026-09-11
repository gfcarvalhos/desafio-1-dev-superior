package com.gabrielsilva.desafio;

import com.gabrielsilva.desafio.entities.Pedido;
import com.gabrielsilva.desafio.services.PedidoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    private PedidoService pedidoService;

    public DesafioApplication(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        Pedido pedidoUm = new Pedido(1034, 150.00, 20.0);
        System.out.println(pedidoService.pedidoFinal(pedidoUm));
    }
}
