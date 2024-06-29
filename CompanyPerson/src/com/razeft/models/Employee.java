package com.razeft.models;

public class Employee extends  Person {
    private Double remuneration;
    private int employeeID;
    private static int ultimoID;


    public Employee(String firstName, String lastName, String fiscalNumber, String address, Double remuneration) {
        super(firstName, lastName, fiscalNumber, address);
        this.remuneration = remuneration;
        this.employeeID = ++ultimoID;
    }

    public void increaseRemuneration(int percentage) {
        this.remuneration += this.remuneration * percentage/100;
    }

    public Double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(Double remuneration) {
        this.remuneration = remuneration;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nEmployee ID: ")
                .append(employeeID)
                .append("\nRemuneration: ")
                .append(String.format("%.2f", remuneration));
        return sb.toString();
    }
}
