package com.razeft.catalogo;

import com.razeft.catalogo.models.Book;
import com.razeft.catalogo.models.Comics;
import com.razeft.catalogo.models.IPhone;
import com.razeft.catalogo.models.TvLcd;
import com.razeft.catalogo.models.abstracts.Product;
import com.razeft.catalogo.models.interfaces.IElectronic;
import com.razeft.catalogo.models.interfaces.IProduct;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ExampleCatalogo {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        IProduct[] products = new Product[6];

        products[0] = new TvLcd(500, "Samsung", 42);
        products[1] = new IPhone(1000, "Apple", "iPhone 14", "Black");
        products[2] = new Book(20, new Date(120, 5, 1), "J.K. Rowling", "Harry Potter", "Bloomsbury");
        products[3] = new Comics(15, new Date(121,7, 1), "Stan Lee", "Spiderman", "Marvel", "Spider-man");
        products[4] = new TvLcd(600, "LG", 55);
        products[5] = new IPhone(1100, "Apple", "iPhone 14 Pro", "White");

        for(IProduct product: products) {
            System.out.println("Details: " + product.getClass().getSimpleName());
            if(product instanceof IElectronic) {
                System.out.println("Manufacturer: " + ((IElectronic) product).getManufacturer());
                if(product instanceof TvLcd) {
                    System.out.println("Inch: " + ((TvLcd) product).getInch());
                }
                if(product instanceof IPhone) {
                    System.out.println("Model: " + ((IPhone) product).getModel());
                    System.out.println("Color: " + ((IPhone) product).getColor());
                }
            }

            if(product instanceof Book) {
                System.out.println("Author: " + ((Book) product).getAuthor());
                System.out.println("Title: " + ((Book) product).getTitle());
                System.out.println("Publisher: " + ((Book) product).getPublisher());
                System.out.println("Date: " + dateFormat.format(((Book) product).getPublicationDate()));

                if(product instanceof Comics) {
                    System.out.println("Character: " + ((Comics) product).getCharacter());
                }
            }
            System.out.println("Price: " + product.getPrice() + "$");
            System.out.println("Price on Sale: " + product.getSalePrice() + "$");
            System.out.println("--------------------------------------------------");

        }
    }
}
