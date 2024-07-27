package org.razeft.flight;

import org.razeft.flight.models.Flight;

import java.util.*;

public class FindMyFlight {
    public static void main(String[] args) {

        List<Flight> flights = new LinkedList<>();
        flights.add(new Flight("AAL 933", "New York", "Santiago",
                new Date(121, 7, 29, 5, 39), 62));
        flights.add(new Flight("LAT 755", "Sao Paulo", "Santiago",
                new Date(121, 7, 31, 4, 45), 47));
        flights.add(new Flight("SKU 621", "Rio De Janeiro", "Santiago",
                new Date(121, 7, 30, 16, 0), 52));
        flights.add(new Flight("DAL 147", "Atlanta", "Santiago",
                new Date(121, 7, 29, 13, 22), 59));
        flights.add(new Flight("AVA 241", "Bogota", "Santiago",
                new Date(121, 7, 31, 14, 5), 25));
        flights.add(new Flight("AMX 10", "Mexico City", "Santiago",
                new Date(121, 7, 31, 5, 20), 29));
        flights.add(new Flight("IBE 6833", "Londres", "Santiago",
                new Date(121, 7, 30, 8, 45), 55));
        flights.add(new Flight("LAT 2479", "Frankfurt", "Santiago",
                new Date(121, 7, 29, 7, 41), 51));
        flights.add(new Flight("SKU 803", "Lima", "Santiago",
                new Date(121, 7, 30, 10, 35), 48));
        flights.add(new Flight("LAT 533", "Los Ángeles", "Santiago",
                new Date(121, 7, 29, 9, 14), 59));
        flights.add(new Flight("LAT 1447", "Guayaquil", "Santiago",
                new Date(121, 7, 31, 8, 33), 31));
        flights.add(new Flight("CMP 111", "Panama City", "Santiago",
                new Date(121, 7, 31, 15, 15), 29));
        flights.add(new Flight("LAT 705", "Madrid", "Santiago",
                new Date(121, 7, 30, 8, 14), 47));
        flights.add(new Flight("AAL 957", "Miami", "Santiago",
                new Date(121, 7, 29, 22, 53), 60));
        flights.add(new Flight("ARG 5091", "Buenos Aires", "Santiago",
                new Date(121, 7, 31, 9, 57), 32));
        flights.add(new Flight("LAT 1283", "Cancún", "Santiago",
                new Date(121, 7, 31, 4, 0), 35));
        flights.add(new Flight("LAT 579", "Barcelona", "Santiago",
                new Date(121, 7, 29, 7, 45), 61));
        flights.add(new Flight("AAL 945", "Dallas-Fort Worth", "Santiago",
                new Date(121, 7, 30, 7, 12), 58));
        flights.add(new Flight("LAT 501", "París", "Santiago",
                new Date(121, 7, 29, 18, 29), 49));
        flights.add(new Flight("LAT 405", "Montevideo", "Santiago",
                new Date(121, 7, 30, 15, 45), 39));


        Collections.sort(flights);
        Flight flightWithFewestPassengers = Collections.min(flights, (f1, f2) -> f1.getNumberPassengers().compareTo(f2.getNumberPassengers()));

        System.out.println("....sorted flights by ascending arrival date...");
        System.out.println("The last flight to arrive is " + flights.getLast().getName() + ": " +
                flights.getLast().getOrigin() + ", arriving on " + flights.getLast().getDate());

        System.out.println("The flight with the fewest passengers is " + flightWithFewestPassengers.getName() + ": " + flightWithFewestPassengers.getOrigin()
         + ", with " + flightWithFewestPassengers.getNumberPassengers() + " passengers.");

    }
}
