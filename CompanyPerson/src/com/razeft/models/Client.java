package com.razeft.models;

public class Client extends  Person {
    private int clientID;
    private static int ultimoID;

    public Client(String firstName, String lastName, String fiscalNumber, String address) {
        super(firstName, lastName, fiscalNumber, address);
        this.clientID = ++ultimoID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nClient ID: ")
                .append(clientID);
        return super.toString();
    }
}
