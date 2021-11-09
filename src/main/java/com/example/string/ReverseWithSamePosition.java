package com.example.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWithSamePosition {
    /*Reverse the string with same position
    Input : ABC DEF GHI
    Output: CBA FED IHG*/
    public static void main(String[] args) {
        String input="ABC DEF GHI";
        String collect = Arrays.stream(input.split(" "))
                .map(s -> s.toString().replaceFirst("(.)(.)(.)", "$3$2$1"))
                .collect(Collectors.joining(" "));
        System.out.print(collect);
    }

}
