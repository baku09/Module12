package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order from GlutenFreeShop");
        return true;
    }
}

