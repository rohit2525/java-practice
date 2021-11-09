package com.example.list;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class listWithStream {


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("2", "3", "5", "7", "11", "13", "17", "19", "23", "29", "31", "37", "41", "43",
                "47", "53", "59", "61", "67", "71", "73", "79", "83", "89", "97");
        strings.stream().filter(e -> Integer.parseInt(e) <= 18).forEach(e -> System.out.print(e + "  "));


        System.out.println("\n-------------------------------------------------------");

        strings.stream().limit(10).forEach(e -> System.out.print(e + "  "));
        System.out.println("\n-------------------------------------------------------");
        strings.stream().map(Integer::parseInt).reduce((a, b) -> a < b ? a : b).ifPresent(System.out::print);
        System.out.println("\n-------------------------------------------------------");
        strings.stream().reduce((str1, str2) -> str1 + " - " + str2).ifPresent(System.out::print);
        System.out.println("\n-------------------------------------------------------");
        System.out.print(strings.stream().map(Integer::parseInt).reduce(Integer::sum).get());
    }
}
