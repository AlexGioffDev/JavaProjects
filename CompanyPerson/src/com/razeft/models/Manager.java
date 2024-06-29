package com.razeft.models;

public class Manager extends  Employee{
    private Double budget;

    public Manager(String firstName, String lastName, String fiscalNumber, String address, Double remuneration, Double budget) {
        super(firstName, lastName, fiscalNumber, address, remuneration);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("\nBudget: ")
                .append(budget);
        return sb.toString();
    }
}
