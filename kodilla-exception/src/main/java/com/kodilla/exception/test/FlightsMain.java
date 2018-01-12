package com.kodilla.exception.test;

public class FlightsMain {

    public static void main(String[] args) {

        Airport airport1 = new Airport("Warsaw");
        airport1.addNewDirection("Frankfurt");
        airport1.addNewDirection("Paris");
        airport1.addNewDirection("London");
        airport1.addNewDirection("Milan");
        airport1.addNewDirection("Vienna");

        Airport airport2 = new Airport("Cracow");
        airport2.addNewDirection("Frankfurt");
        airport2.addNewDirection("Paris");
        airport2.addNewDirection("London");
        airport2.addNewDirection("Madrid");
        airport2.addNewDirection("Vienna");
        airport2.addNewDirection("Cairo");

        Airport airport3 = new Airport("London");
        airport3.addNewDirection("Frankfurt");
        airport3.addNewDirection("Paris");
        airport3.addNewDirection("London");
        airport3.addNewDirection("Milan");
        airport3.addNewDirection("Vienna");
        airport3.addNewDirection("Dubai");

        Airport airport4 = new Airport("Berlin");

        FlightsFinder flightsFinder = new FlightsFinder();
        flightsFinder.registerNewAirports(airport1, airport2, airport3, airport4);


        try {
            flightsFinder.flightFinder("Berlin", "Paris");
        } catch (RouteNotFoundException r) {
            System.out.println(r);
        } finally {
            System.out.println("Searching has been completed");
        }
    }
}
