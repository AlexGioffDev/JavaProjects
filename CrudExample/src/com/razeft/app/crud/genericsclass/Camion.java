package com.razeft.app.crud.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T>  implements Iterable<T>{

    private List<T> objects;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objects = new ArrayList();
    }

    public void add(T ob) {
        if(this.objects.size() <= max) {
            this.objects.add(ob);
        } else {
            throw new RuntimeException("No hay mas espacio.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objects.iterator();
    }
}
