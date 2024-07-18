package com.razeft.app.crud.interfaces;

import com.razeft.app.crud.models.Client;

import java.util.List;

public interface CrudRepository {
    List<Client> all();
    Client byID(Integer id);
    void create(Client client);
    void edit(Client client);
    void delete(Integer id);
}
