package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private List<Flight> flights;

    public FlightService(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightFromCity(String departureCity) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equalsIgnoreCase(departureCity))
                .collect(Collectors.toList());
    }
    public List<Flight> findFlightToCity(String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equalsIgnoreCase(destinationCity))
                .collect(Collectors.toList());
    }
    public List<Flight> findFlightThroughCity(String transferCity) {
        return flights.stream()
                .filter(flight -> flight.getTransferCity().equalsIgnoreCase(transferCity))
                .collect(Collectors.toList());
    }
}
