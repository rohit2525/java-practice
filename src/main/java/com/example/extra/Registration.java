package com.example.extra;

import java.util.Spliterator;
import java.util.stream.IntStream;

public class Registration {

    public static void main(String[] args) {
        int registrationCount=5;
        int registationEntries=11223;

        int[] ints = IntStream.of(registationEntries).toArray();

        System.out.println(ints);

    }
}
