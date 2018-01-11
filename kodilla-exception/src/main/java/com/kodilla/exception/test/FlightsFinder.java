package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;

public class FlightsFinder {

    private final HashMap<String, List<String>> flightMap;

    public FlightsFinder(HashMap<String, List<String>> flightMap) {
        this.flightMap = flightMap;
    }

    public HashMap<String, List<String>> getFlightMap() {
        return new HashMap<>(flightMap);
    }

    public void flightFinder(Flight flight) throws RouteNotFoundException {
        if (flightMap.containsKey(flight.getAirport())){
            getFlightMap().entrySet().stream()
                    .filter(f -> f.getKey().equals(flight.getAirport()))
                    .forEach(System.out::println);

        } else {
            throw new RouteNotFoundException("Result not fund");
        }
    }
}
