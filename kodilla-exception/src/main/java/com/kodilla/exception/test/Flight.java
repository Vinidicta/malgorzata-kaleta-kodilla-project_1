package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public final class Flight {
    private final String airport;
    private final List<String> flightsList= new ArrayList<>();

    public Flight(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    public List<String> getFlightsList() {
        return flightsList;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airport='" + airport + '\'' +
                ", flightsList=" + flightsList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!airport.equals(flight.airport)) return false;
        return flightsList.equals(flight.flightsList);
    }

    @Override
    public int hashCode() {
        int result = airport.hashCode();
        result = 31 * result + flightsList.hashCode();
        return result;
    }
}
