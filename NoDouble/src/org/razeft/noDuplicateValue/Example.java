package org.razeft.noDuplicateValue;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"}, {}};

        String[] uniqueLenguajes = Arrays.stream(lenguajes)
                .flatMap(Stream::of)
                .distinct()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(uniqueLenguajes));
    }
}
