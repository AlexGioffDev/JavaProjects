package org.razeft.stringReplace;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<String, String> replaceValue = text -> text
                .replaceAll("[ ,.]", "")
                .toUpperCase();

        String example = "Hola mundo, que tal? Yo todo bien.";
        String output = replaceValue.apply(example);
        System.out.println(output);

    }
}
