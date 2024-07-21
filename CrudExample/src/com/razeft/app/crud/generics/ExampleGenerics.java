package com.razeft.app.crud.generics;

import com.razeft.app.crud.models.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleGenerics {
    public static void main(String[] args) {
        List<Client> clientes = new ArrayList<>();
        clientes.add(new Client("Andres", "Guzman"));

        Client andres = (Client)clientes.iterator().next();

        Client[] ce = {new Client("Luci", "Martienz"), new Client("Andres", "Guzman")};

        Integer[] integers = {1,2,3};

        List<Client> cefromArray = fromArrayToList(ce);
        List<Integer> integerList = fromArrayToList(integers);

        System.out.println(cefromArray);
        System.out.println(integerList);

    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Client> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
}
