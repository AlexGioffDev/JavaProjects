package com.razeft.example;

import com.razeft.models.Manager;

public class ExampleProject {
    public static void main(String[] args) {
        Manager manager = new Manager("Razeft", "Doe", "1245521", "Via. Duan Jaar, 5", 45.00, 500.00);
        System.out.println(manager);
    }
}
