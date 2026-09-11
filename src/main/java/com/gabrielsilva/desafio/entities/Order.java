package com.gabrielsilva.desafio.entities;


public class Order {

    private Integer code;
    private Double basic;
    private Double discount;

    public Order(int code, Double basic, Double discount){
        this.code = code;
        this.discount = discount;
        this.basic = basic;
    }

    public int getCode() {
        return code;
    }

    public Double getBasic() {
        return basic;
    }

    public Double getDiscount() {
        return discount;
    }
}
