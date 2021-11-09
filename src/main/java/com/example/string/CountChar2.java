package com.example.string;

import com.google.common.collect.Multimap;

import java.util.HashMap;
import java.util.Map;

public class CountChar2 {
    public void countcharsSerially(String input) {
        
        Map<Character, Integer> map = new HashMap<>();
        char tempchar = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                tempchar = input.charAt(i);
                map.put(input.charAt(i), 1);
            } else {
                tempchar = input.charAt(i - 1);
                if (tempchar == input.charAt(i)) {
                    System.out.println(i);
                    int temp = map.get(input.charAt(i)) + 1;
                    map.put(input.charAt(i), temp);
                }
                else
                {
                    System.out.println(i);
                    map.put(input.charAt(i), 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "wwwaabbccdd";
        new CountChar2().countcharsSerially(input);
    }
}
