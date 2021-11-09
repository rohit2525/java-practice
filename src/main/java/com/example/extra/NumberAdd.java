package com.example.extra;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberAdd {


    public static void main(String[] args) {
        String input2 = "1485631";
        System.out.println(input2+": "+add(input2));
    }
    public static int add(String input) {
        int[] array = Arrays.asList(input.split("")).stream().mapToInt(Integer::parseInt).toArray();
        int sum = IntStream.of(array).sum();
        return (sum/10)==0? sum: add(String.valueOf(sum));
    }
}
