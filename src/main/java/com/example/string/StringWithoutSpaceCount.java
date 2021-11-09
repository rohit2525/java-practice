package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class StringWithoutSpaceCount {

    static Map<String, Integer> getCount(String input){
        String[] splitInput = input.split("(?=\\p{Upper})");
        Map<String, Integer> map = new HashMap<>();

        for (String charInput: splitInput)
            if (map.containsKey(charInput)) {
                int temp = map.get(charInput) + 1;
                map.put(charInput, temp);
            } else {
                map.put(charInput, 1);
            }
        return map;
    }

    public static void main(String[] args) {
        String input ="MyNameIsNishantMyNameIsNishant";
        Map<String, Integer> count = getCount(input);
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue()+", ");
        }
    }
}
