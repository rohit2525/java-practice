package com.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class DuplicateOccurenceString {
    public static void main(String[] args) {
        getCount("I love coding");
    }

    public static void getCount(String sample) {

        char[] sampleArray = sample.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : sampleArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();

        for (Map.Entry<Character, Integer> s : set) {

            out.print(s.getKey() + " : " + s);

        }
    }
}
