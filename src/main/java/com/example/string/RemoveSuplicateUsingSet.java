package com.example.string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class RemoveSuplicateUsingSet {

    public static Set<Character> removeDup(String input) {
        Set<Character> set = new LinkedHashSet<>();
        for (Character ch : input.toLowerCase(Locale.ROOT).toCharArray())
            set.add(ch);

        return set;
    }

    public static void main(String[] args) {
        String input = "Nishantt";
        removeDup(input).forEach(System.out::print);

        Set<String> set = new HashSet<>();
        set.add("hellos");
        System.out.println(set);
    }
}
