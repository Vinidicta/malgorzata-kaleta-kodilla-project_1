package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsFinder {

    private final Map<String, List<String>> flightMap = new HashMap<>();

    public void registerNewAirports(Airport... airports) {
        for (Airport airport : airports) {
            this.flightMap.put(airport.getName(), airport.getDirections());
        }
    }

    public HashMap<String, List<String>> getFlightMap() {
        return new HashMap<>(flightMap);
    }

    public void flightFinder(String from, String to) throws RouteNotFoundException {
        if (flightMap.containsKey(from)) {
            getFlightMap()
                    .get(from).stream()
                    .filter((destination) -> destination.equals(to))
                    .findAny()
                    .orElseThrow(() -> new RouteNotFoundException("Cannot find flight from " + from + " to " + to));
            System.out.println("Flight from " + from + " to " + to + " has been found.");
        } else {
            throw new RouteNotFoundException("Cannot find flight from " + from + " to " + to);
        }
    }
}
