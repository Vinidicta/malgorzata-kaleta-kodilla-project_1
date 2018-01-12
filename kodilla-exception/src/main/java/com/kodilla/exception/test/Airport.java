package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private final String name;
    private final List<String> directions = new ArrayList<>();

    public Airport(String airport) {
        this.name = airport;
    }

    public void addNewDirection(String name) {
        this.directions.add(name);
    }

    public String getName() {
        return name;
    }

    public List<String> getDirections() {
        return directions;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airport='" + name + '\'' +
                ", flightsList=" + directions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        if (!name.equals(airport.name)) return false;
        return directions.equals(airport.directions);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + directions.hashCode();
        return result;
    }
}
