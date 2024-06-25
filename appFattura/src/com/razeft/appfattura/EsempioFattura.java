package com.razeft.appfattura;

import com.razeft.appfattura.models.Cliente;
import com.razeft.appfattura.models.Fattura;
import com.razeft.appfattura.models.ItemFattura;
import com.razeft.appfattura.models.Prodotto;

import java.util.Scanner;

public class EsempioFattura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNome("Alex");

        Scanner s = new Scanner(System.in);
        System.out.println("Descrizione fattura: ");
        String desc = s.nextLine();
        Fattura fattura = new Fattura(desc, cliente);

        Prodotto prodotto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            prodotto = new Prodotto();
            System.out.print("Aggiungi prodotto n° " + prodotto.getCodigo() + ": ");
            prodotto.setNome(s.nextLine());
            System.out.print("Aggiungi prezzo: ");
            prodotto.setPrezzo(s.nextFloat());
            System.out.print("Aggiungi la quantità: ");

            fattura.addItemFattura(new ItemFattura(s.nextInt(), prodotto));
            System.out.println();
            s.nextLine();
        }
        System.out.println(fattura);

    }
}
