package com.razeft.app.crud;

import com.razeft.app.crud.interfaces.CrudRepository;
import com.razeft.app.crud.interfaces.RepositoryOrdenable;
import com.razeft.app.crud.interfaces.RepositoryPaginable;
import com.razeft.app.crud.models.Client;
import com.razeft.app.crud.repository.ClientListRepository;
import com.razeft.app.crud.utility.Direction;

import java.util.List;

public class ExampleRepository {
    public static void main(String[] args) {
        CrudRepository repo = new ClientListRepository();
        repo.create(new Client("Jano", "Perez"));
        repo.create(new Client("Bea", "Gonzaled"));
        repo.create(new Client("Luci", "Matinez"));
        repo.create(new Client("Andres", "Guzman"));

        List<Client> clients = repo.all();
        clients.forEach(System.out::println);

        System.out.println("----------------------------PAGINABLE-----------------------------------");
        List<Client> paginable = ((RepositoryPaginable)repo).all(1,4);
        paginable.forEach(System.out::println);

        System.out.println("----------------------------ORDENAR ASC-----------------------------------");
        List<Client> clientsASC =((RepositoryOrdenable)repo).all("firstName", Direction.ASC);
        clientsASC.forEach(System.out::println);

        System.out.println("----------------------------ORDENAR ASC-----------------------------------");
        List<Client> clientsDESC =((RepositoryOrdenable)repo).all("lastName", Direction.DESC);
        clientsDESC.forEach(System.out::println);

        System.out.println("----------------------------EDITAR-----------------------------------");
        Client beaActualizar = new Client("Bea", "Mena");
        beaActualizar.setId(2);
        repo.edit(beaActualizar);

        Client bea = repo.byID(2);
        ((RepositoryOrdenable)repo).all("lastName", Direction.DESC).forEach(System.out::println);

        System.out.println("----------------------------Eliminar-----------------------------------");
        repo.delete(2);
        repo.all().forEach(System.out::println);
    }
}
