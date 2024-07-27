package org.razeft.flight.models;

import java.util.Date;

public class Flight implements Comparable<Flight> {
    private String name;
    private String origin;
    private String destination;
    private Date date;
    private Integer numberPassengers;

    public Flight(String name, String origin, String destination, Date date, Integer numberPassengers) {
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numberPassengers = numberPassengers;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDate() {
        return date;
    }

    public Integer getNumberPassengers() {
        return numberPassengers;
    }

    @Override
    public int compareTo(Flight o) {
        return this.date.compareTo(o.date);
    }

    @Override
    public String toString() {
        return this.name + ": " + this.origin + ", " + this.getDate() + ", with "
                + this.getNumberPassengers() + " passengers.";
    }
}
