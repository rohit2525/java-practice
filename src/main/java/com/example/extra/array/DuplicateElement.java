package com.example.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Find duplicate elements in a given array
public class DuplicateElement {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "b", "c", "a"};
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            if (map.containsKey(s)) {
                int value = Optional.ofNullable(map.get(s)).orElse(0) + 1;
                map.put(s, value);
            } else {
                map.put(s, 1);
            }
        }
            Map<String, Integer> collect = map.entrySet().stream()
                    .filter(e -> e.getValue() > 1)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            System.out.println(collect);


        }
    }

