package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order from ExtraFoodShop");
        return true;
    }
}

