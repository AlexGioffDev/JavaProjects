package com.razeft.catalogo.models.interfaces;

import java.util.Date;

public interface IBook {
    Date getPublicationDate();
    String getAuthor();
    String getTitle();
    String getPublisher();
}
