package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SmallestSubstring {

    // substring occurring only once
    static String smallestSubstring(String input) {
        System.out.println("Input String: " + input);
        // Stores all occurrence's
        ArrayList<String> subString = new ArrayList<>();

        // Generate all the substrings
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {

                // Avoid multiple occurences
                if (i != j)
                    // Append all substrings
                    subString.add(input.substring(i, j));
            }
        }
        System.out.println("All the perm&com substrings: " + subString);

        // Take into account all the substrings
        HashMap<String, Integer> countSubString = new HashMap<>();
        for (String s : subString)
            countSubString.put(s, countSubString.getOrDefault(s, 0) + 1);

        System.out.println("count of substrings: " + countSubString);

        ArrayList<String> uniqueSubString = new ArrayList<>();

        // Iterate over all unique substrings
        for (String s : countSubString.keySet()) {
            if (countSubString.get(s) == 1)
                uniqueSubString.add(s);
        }
        System.out.println("Unique substring: " + uniqueSubString);
        // Initialize a dictionary
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : uniqueSubString) {
            // Append the keys
            map.put(s, s.length());
        }
        System.out.println("map: " + map);
        return Collections.min(map.keySet());
    }

    // Driver Code
    public static void main(String[] args) {
        //System.out.println(smallestSubstring("abaaba"));
        System.out.println(smallestSubstring("zyzyzyz"));
    }
}
