package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceImplementation implements OrderService {
    @Override
    public boolean order(User user, Product product, int quantity) {

        System.out.println("Order placed for user: " + user.getUsername() +
                ", product: " + product.getName() + ", quantity: " + quantity);
        return true;
    }
}
