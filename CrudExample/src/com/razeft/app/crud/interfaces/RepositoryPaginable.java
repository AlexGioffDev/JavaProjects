package com.razeft.app.crud.interfaces;

import com.razeft.app.crud.models.Client;

import java.util.List;

public interface RepositoryPaginable {
    List<Client> all(int from, int to);
}
