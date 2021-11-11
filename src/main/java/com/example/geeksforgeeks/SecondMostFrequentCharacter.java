package com.example.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Input: str = "aabababa";
 * Output: Second most frequent character is 'b'
 * <p>
 * Input: str = "geeksforgeek";
 * Output: Second most frequent character is 'g'
 * <p>
 * Input: str = "geeksquiz";
 * Output: Second most frequent character is 'g'
 * The output can also be any other character with
 * count 1 like 'z', 'i'.
 * <p>
 * Input: str = "abcd";
 * Output: No Second most frequent character
 **/

public class SecondMostFrequentCharacter {

    static Character getSecondMostChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : input.toCharArray()) {
            if (map.containsKey(c)) {
                int value = Optional.ofNullable(map.get(c)).orElse(1) + 1;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }

        return Objects.requireNonNull(map.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(2)
                .reduce((first, second) -> second).orElse(null)).getKey();

    }

    public static void main(String[] args) {
        System.out.println(getSecondMostChar("aabababa"));
        System.out.println(getSecondMostChar("geeksforgeek"));
        System.out.println(getSecondMostChar("geeksquiz"));
        System.out.println(getSecondMostChar("abcd"));
    }
}
