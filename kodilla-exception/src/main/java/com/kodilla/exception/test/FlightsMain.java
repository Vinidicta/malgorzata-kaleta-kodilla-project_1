package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightsMain {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw");
        Flight flight2 = new Flight("Cracow");
        Flight flight3 = new Flight("London");
        Flight flight4 = new Flight("Berlin");

        List<String> airportsListWarsaw = flight1.getFlightsList();
        airportsListWarsaw.add("Frankfurt");
        airportsListWarsaw.add("Paris");
        airportsListWarsaw.add("London");
        airportsListWarsaw.add("Milan");
        airportsListWarsaw.add("Vienna");

        List<String> airportsListCracow = flight2.getFlightsList();
        airportsListCracow.add("Frankfurt");
        airportsListCracow.add("Paris");
        airportsListCracow.add("London");
        airportsListCracow.add("Madrid");
        airportsListCracow.add("Vienna");
        airportsListCracow.add("Cairo");

        List<String> airportsListLondon = flight3.getFlightsList();
        airportsListLondon.add("Frankfurt");
        airportsListLondon.add("Paris");
        airportsListLondon.add("London");
        airportsListLondon.add("Milan");
        airportsListLondon.add("Vienna");
        airportsListLondon.add("Dubai");

        HashMap<String, List<String>> flightsMap = new HashMap<>();
        flightsMap.put(flight1.getAirport(), flight1.getFlightsList());
        flightsMap.put(flight2.getAirport(), flight1.getFlightsList());
        flightsMap.put(flight3.getAirport(), flight1.getFlightsList());

        try {
            FlightsFinder flightsFinder = new FlightsFinder(flightsMap);
            flightsFinder.flightFinder(flight4);
        }
        catch (RouteNotFoundException r){
            System.out.println(r);
        }
        finally {
            System.out.println("Searching has been completed");
        }
    }
}
