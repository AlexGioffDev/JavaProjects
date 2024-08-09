package org.razeft.maxValue;

import java.util.Arrays;
import java.util.function.Function;

public class ExampleMaxValue {
    public static void main(String[] args) {
        Integer[] numbers = {30,32,45,2,4,1,120,540,42,90,200,420};
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (a, e) -> a > e ? a : e);

        int maxValue = max.apply(numbers);

        System.out.println("The max value is: " + maxValue);
    }






}
