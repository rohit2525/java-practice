package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class LongestCommonPrefix {


    public static Map<Character, Integer> getCommonPrefixUsingMap(String[] inputArr) {
        Map<Character, Integer> map = new HashMap<>();
        for (String input : inputArr)
            for (char ch : input.toCharArray())
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
        return map;
    }


    public static void main(String[] args) {
        String[] nums = {"flower", "flow", "flight"};
        String[] obj = {"dog", "racecar", "car"};
        Map<Character, Integer> map = getCommonPrefixUsingMap(obj);
        map.forEach((key, value) -> {
            if (value >= nums.length)
                System.out.print(key);
        });
    }
}

