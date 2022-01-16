package com.example.string;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;

@Log4j2
public class countChar {
    public static void main(String[] args) {
        String input = "aabccdghhgaa";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                int temp = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), temp);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
