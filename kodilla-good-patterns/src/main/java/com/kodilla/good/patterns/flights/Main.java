package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        FlightService flightService = new FlightService(List.of(
                new Flight("Rzeszów", "Warszawa"),
                new Flight("Rzeszów", "Kraków", "Warszawa"),
                new Flight("Warszawa", "Gdańsk"),
                new Flight("Kraków", "Warszawa", "Gdańsk")
        ));
        System.out.println("Flight from Rzeszów");
        flightService.findFlightFromCity("Rzeszów").forEach(System.out::println);

        System.out.println("Flight to Gdańsk");
        flightService.findFlightToCity("Gdańsk").forEach(System.out::println);






    }
}
