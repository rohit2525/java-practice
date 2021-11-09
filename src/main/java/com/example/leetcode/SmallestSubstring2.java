package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;

public class SmallestSubstring2 {
    // substring occurring only once
    static String smallestSubstring(String input) {
        // Stores all occurrence's
        HashMap<String, Integer> map = new HashMap<>();
        // Generate all the substrings
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                // Avoid multiple occurrence
                if (i != j) {
                    String subString = input.substring(i, j);
                    // single character i.e a,b,c,y,z should be ignored
                    if (subString.length() > 1) {
                        if (map.containsKey(subString)) {
                            int value = Optional.ofNullable(map.get(subString)).orElse(0) + 1;
                            map.put(subString, value);
                        } else {
                            map.put(subString, 1);
                        }
                    }
                }
            }
        }
       /* return map.keySet().stream() //map to stream
                .filter(s -> map.get(s) == 1) //get single occurrence of substring
                .min(Comparator.comparingInt(String::length)).get();*/ // get minimum length string*/

       ArrayList<String> list = new ArrayList();
        for (String key : map.keySet())
            if (map.get(key) == 1)
                list.add(key);
        System.out.println("list: "+list);

        HashMap<String, Integer> uniqueHashMap = new HashMap<>();
        for (String s : list)
            uniqueHashMap.put(s, s.length());
        return Collections.min(uniqueHashMap.keySet());

    }

    public static void main(String[] args) {
        System.out.println(smallestSubstring("abaaba"));
        System.out.println(smallestSubstring("zyzyzyz"));
    }
}
