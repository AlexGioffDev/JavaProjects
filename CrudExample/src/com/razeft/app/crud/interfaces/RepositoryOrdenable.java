package com.razeft.app.crud.interfaces;

import com.razeft.app.crud.models.Client;
import com.razeft.app.crud.utility.Direction;

import java.util.List;

public interface RepositoryOrdenable {
    List<Client> all(String attribute, Direction direction);
}
