package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String departureCity; // miasto wylotu
    private String transferCity; // miasto przez które leci
    private String destinationCity; // miasto przylotu

    public Flight(String departureCity,  String destinationCity) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
    }

    public Flight(String departureCity, String transferCity, String destinationCity) {
        this.departureCity = departureCity;
        this.transferCity = transferCity;
        this.destinationCity = destinationCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getTransferCity() {
        return transferCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureCity, flight.departureCity) && Objects.equals(transferCity, flight.transferCity) && Objects.equals(destinationCity, flight.destinationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, transferCity, destinationCity);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureCity='" + departureCity + '\'' +
                ", transferCity='" + transferCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                '}';
    }
}
