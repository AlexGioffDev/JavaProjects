package com.razeft.models;

public class Person {
    private String firstName;
    private String lastName;
    private String fiscalNumber;
    private String address;


    public Person(String firstName, String lastName, String fiscalNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fiscalNumber = fiscalNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFiscalNumber() {
        return fiscalNumber;
    }

    public void setFiscalNumber(String fiscalNumber) {
        this.fiscalNumber = fiscalNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===================================================\n")
                .append("Firstname: ")
                .append(firstName)
                .append("\nLastname: ")
                .append(lastName)
                .append("\nFiscal Number: ")
                .append(fiscalNumber)
                .append("\nAddress: ")
                .append(address);
        return sb.toString();
    }
}
