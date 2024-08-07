package org.razeft.wordMostUsed;

import org.razeft.wordMostUsed.interfaces.IMostUsedWord;

import java.util.Collections;
import java.util.Map;

public class wordMostUsed {
    public static void main(String[] args) {
        IMostUsedWord mostUsedWord = sentence -> {
            String[] words = sentence.replaceAll("[.,]", "").toLowerCase().split(" ");

            int max = 0;
            String word = null;
            for(int i = 0; i < words.length; i++) {
                int valor = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        valor++;
                    }
                }

                if(valor > max){
                    max = valor;
                    word = words[i];
                }
            }

            return Collections.singletonMap(word, max);
        };

        mostUsedWord.findMostUsedWord("Yo ni te conozco, ni te he visto, ni se tu nombre, ni te hablaré, ni me interesas.")
                .forEach((k, v) -> System.out.println("Most used word -> " + k + ": " + v));
    }


}
