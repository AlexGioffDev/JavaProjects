package com.razeft.app.crud.repository;

import com.razeft.app.crud.interfaces.CrudRepository;
import com.razeft.app.crud.interfaces.RepositoryOrdenable;
import com.razeft.app.crud.interfaces.RepositoryPaginable;
import com.razeft.app.crud.models.Client;
import com.razeft.app.crud.utility.Direction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientListRepository implements CrudRepository, RepositoryOrdenable, RepositoryPaginable {

    private List<Client> dataSource;

    public ClientListRepository() {
        this.dataSource = new ArrayList<Client>();
    }

    @Override
    public List<Client> all() {
        return dataSource;
    }

    @Override
    public List<Client> all(String attribute, Direction direction) {
        List<Client> orderList = new ArrayList<>(this.dataSource);
        orderList.sort(new Comparator<Client>() {
            @Override
            public int compare(Client a, Client b) {
                int resultado = 0;
                if(direction == Direction.ASC) {
                    resultado = this.ordenar(a, b);
                } else if (direction == Direction.DESC) {
                   resultado = this.ordenar(b, a);
                }
                return resultado;
            }

            private int ordenar(Client a, Client b) {
                int resultado = 0;
                switch (attribute) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "firstName" ->
                            resultado = a.getFirstName().compareTo(b.getFirstName());
                    case "lastName" ->
                            resultado = a.getLastName().compareTo(b.getLastName());
                }

                return resultado;
            }
        });
        return orderList;
    }

    @Override
    public List<Client> all(int from, int to) {
        return dataSource.subList(from, to);
    }

    @Override
    public Client byID(Integer id) {
        Client c = null;
        for(Client cli: dataSource) {
            if(cli.getId() != null && cli.getId().equals(id)){
                c = cli;
                break;
            }
        }
        return c;
    }

    @Override
    public void create(Client client) {
        this.dataSource.add(client);
    }

    @Override
    public void edit(Client client) {
        Client c = this.byID(client.getId());
        c.setFirstName(client.getFirstName());
        c.setLastName(client.getLastName());
    }

    @Override
    public void delete(Integer id) {
        this.dataSource.remove(this.byID(id));
    }
}
