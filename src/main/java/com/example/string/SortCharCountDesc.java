package com.example.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*Input: tomorrow
Output: ooorrtmw*/
public class SortCharCountDesc {
    public static Map<Character, Integer> stringManipulation(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : input.toCharArray())
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        return map;
    }

    public static void main(String[] args) {
        String input = "tomorrow";
        Map<Character, Integer> map = stringManipulation(input);
        //sort and print
        List<Map.Entry<Character, Integer>> toSort = new ArrayList<>(map.entrySet());
        toSort.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


/*        for (Map.Entry<Character, Integer> x : toSort) {
            int count = x.getValue();
            while (count > 0) {
                System.out.print(x.getKey());
                count--;
            }
        }
        System.out.println("\n----------------------");
        useStreamToSortNPrint(map);*/
    }

    static void useStreamToSortNPrint(Map<Character, Integer> map) {
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(m -> {
                    int count = m.getValue();
                    while (count > 0) {
                        System.out.print(m.getKey());
                        count--;
                    }
                });
    }
}
