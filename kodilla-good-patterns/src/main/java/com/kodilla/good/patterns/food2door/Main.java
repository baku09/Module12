package com.kodilla.good.patterns.food2door;

public class Main {
    public static void main(String[] args) {
        Food2DoorService food2DoorService = new Food2DoorService();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        food2DoorService.addProducer("ExtraFoodShop", extraFoodShop);
        food2DoorService.addProducer("HealthyShop", healthyShop);
        food2DoorService.addProducer("GlutenFreeShop", glutenFreeShop);

        // Przykładowe zamówienie dla ExtraFoodShop
        Order order1 = new Order("ExtraFoodShop", "Banana", 5000);
        food2DoorService.placeOrder(order1);

        // Przykładowe zamówienie dla HealthyShop
        Order order2 = new Order("HealthyShop", "Rice", 21);
        food2DoorService.placeOrder(order2);

        // Przykładowe zamówienie dla nieistniejącego producenta
        Order order3 = new Order("Żabka", "Water", 10);
        food2DoorService.placeOrder(order3);
    }
}
