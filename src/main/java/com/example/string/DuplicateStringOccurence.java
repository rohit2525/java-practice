package com.example.string;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class DuplicateStringOccurence {

    public static void main(String[] args) {
        String input = "PGIM India Midcap Opp Dir;Parag Parikh Flexi Cap Dir;Kotak Small Cap Dir;IIFL Focused Equity Dir;PGIM India Flexi Cap Dir;PGIM India Midcap Opp Dir;Axis Small Cap Dir;PGIM India Flexi Cap Dir;Nippon India Small Cap Dir;Axis Small Cap Dir;PGIM India Midcap Opp Dir;Mirae Asset Emerging Bluechip Dir;Kotak Small Cap Dir;SBI Small Cap Dir;SBI Small Cap Dir;Nippon India Small Cap Dir;Axis Small Cap Dir;IIFL Focused Equity Dir;Parag Parikh Flexi Cap Dir;Kotak Small Cap Dir;Kotak Small Cap Dir;Nippon India Small Cap Dir;PGIM India Midcap Opp Dir;Kotak Emerging Equity Dir;SBI Small Cap Dir;Kotak Small Cap Dir;PGIM India Midcap Opp Dir;Nippon India Small Cap Dir;Kotak Emerging Equity Dir;PGIM India Flexi Cap Dir";

        String[] inputArr = input.split(";");
       /* Map<String, Long> dataMap = Arrays.stream(inputArr)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        sortByValue(dataMap, false).forEach((key, value) -> System.out.println(key + "  : " + value));*/

        Map<String, Long> dataMap = Arrays.stream(inputArr)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Map<String, Long> sortedMap = new LinkedHashMap<>();
        dataMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        sortedMap.forEach((key, value) -> System.out.println(key + "  : " + value));


       /* Map<String, Integer> result = dataMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));*/



        //   sortByValue(dataMap, false).forEach((key, value) -> System.out.println(key + "  : " + value));


    }


    private static Map<String, Long> sortByValue(Map<String, Long> unsortMap, final boolean order) {
        List<Map.Entry<String, Long>> list = new LinkedList<>(unsortMap.entrySet());

        // Sorting the list based on values
        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

    }
}
