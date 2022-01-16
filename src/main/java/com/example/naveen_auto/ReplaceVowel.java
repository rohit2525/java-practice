package com.example.naveen_auto;

import java.util.Arrays;
import java.util.List;

public class ReplaceVowel {
    public static void main(String[] args) {
        System.out.println(replaceVowel("precious"));
        System.out.println(replaceVowel("cyst"));
    }

    static String replaceVowel(String input) {
        boolean isVowelPresent = false;
        StringBuilder op = new StringBuilder();
        List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (Character c : input.toCharArray()) {
            if (vowel.contains(c)) {
                op.append('#');
                isVowelPresent = true;
            } else {
                op.append(c);
            }
        }
        return isVowelPresent ? op.toString() : input + " has no vowels";
    }
}
