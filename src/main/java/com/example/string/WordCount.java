package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String input = "344556";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                int temp = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), temp);
            } else {
                map.put(input.charAt(i), 1);
            }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> printData(e));
    }

    static void printData(Map.Entry<Character, Integer> e) {
        for(int i=0;i< e.getValue();i++)
            System.out.print(e.getKey()+" ");

    }
}
