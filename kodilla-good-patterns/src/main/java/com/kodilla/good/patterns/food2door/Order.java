package com.kodilla.good.patterns.food2door;

public class Order {
    private String producerName;
    private String product;
    private int quantity;

    public Order(String producerName, String product, int quantity) {
        this.producerName = producerName;
        this.product = product;
        this.quantity = quantity;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

