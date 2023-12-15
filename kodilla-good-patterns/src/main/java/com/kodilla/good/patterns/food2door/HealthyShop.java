package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order from HealthyShop");
        return true;
    }
}

