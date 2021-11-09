package com.example.extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
Input : aabccdghhgaa
Output : a=2,b=0,c=1,g=0,h=1*/
public class RandomInterview1 {
    public static void main(String[] args) {
        String input = "aabccdghhgaa";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                int value = Optional.ofNullable(map.get(input.charAt(i))).orElse(0) + 1;
                map.put(input.charAt(i), value);
                i++;
            } else {
                map.put(input.charAt(i), 0);
            }
        }
        System.out.println(map);
    }
}
