package com.kodilla.good.patterns.food2door;



import java.util.HashMap;
import java.util.Map;

public class Food2DoorService {
    private Map<String, Producer> producers;

    public Food2DoorService() {
        this.producers = new HashMap<>();
    }

    public void addProducer(String producerName, Producer producer) {
        producers.put(producerName, producer);
    }

    public boolean placeOrder(Order order) {
        Producer producer = producers.get(order.getProducerName());

        if (producer != null) {
            return producer.process(order);
        } else {
            System.out.println("Producer not found: " + order.getProducerName());
            return false;
        }
    }
}
