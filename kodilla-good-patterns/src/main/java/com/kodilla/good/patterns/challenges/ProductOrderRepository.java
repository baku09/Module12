package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product, int quantity) {
        System.out.println("Creating order for user: " + user.getUsername() +
                ", product: " + product.getName() +
                ", quantity: " + quantity);
    }
}
