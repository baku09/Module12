package com.kodilla.good.patterns.challenges;

public class Main2 {
    public static void main(String[] args) {
        User user = new User("Kuba_bak");
        Product product = new Product("Deska Snowboardowa");
        int quantity = 1;

        InformationService informationService = new EmailInformationService();
        OrderService orderService = new ProductOrderServiceImplementation();
        OrderRepository orderRepository = new ProductOrderRepository();

        ProductOrderService productOrderService = new ProductOrderService(informationService, orderService, orderRepository);
        OrderRequest orderRequest = new OrderRequest(user, product, quantity);

        OrderDto orderDto = productOrderService.process(orderRequest);

        if (orderDto.isOrdered()) {
            System.out.println("Order successful for user: " + orderDto.getUser().getUsername());
        } else {
            System.out.println("Order failed for user: " + orderDto.getUser().getUsername());
        }
    }
}
