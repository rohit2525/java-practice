package com.example.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomInt1 {

    public static void main(String[] args) {
        String s="12345";

        Integer[] integers = Arrays.stream(Stream.of(s.split(""))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new))
                .map(i -> i * i * i).toArray(Integer[]::new);

        System.out.println(Arrays.toString(integers));
    }
}
