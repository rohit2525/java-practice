package com.example.string;

import java.util.stream.Stream;

public class SortString {
    public static void main(String[] args) {
        String input ="Selenium Learning 123";
        Stream.of(input.split(" ")).sorted().forEach(op->System.out.print(op+" "));
    }
}
