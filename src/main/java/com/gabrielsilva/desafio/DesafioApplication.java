package com.gabrielsilva.desafio;

import com.gabrielsilva.desafio.entities.Order;
import com.gabrielsilva.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    private OrderService orderService;

    public DesafioApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        Order orderUm = new Order(1034, 150.00, 20.0);
        System.out.println(orderService.ToString(orderUm));
        Order orderDois = new Order(2282, 800.00, 10.0);
        System.out.println(orderService.ToString(orderDois));
        Order orderTres = new Order(1309, 95.90, 0.0);
        System.out.println(orderService.ToString(orderTres));
    }
}
