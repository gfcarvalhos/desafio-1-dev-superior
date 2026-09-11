package com.gabrielsilva.desafio.services;


import com.gabrielsilva.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    private Double total(Order order) {
        return order.getBasic() - (order.getBasic() * (
                order.getDiscount()/ 100)) + shippingService.shipment(order);
    }


    public String ToString(Order order){
        return String.format("Pedido código %s \nValor total: R$ %.2f", order.getCode(), this.total(order));
    }
}
