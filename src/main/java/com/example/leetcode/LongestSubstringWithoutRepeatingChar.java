package com.example.leetcode;

/*Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Input: s = ""
Output: 0*/

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class LongestSubstringWithoutRepeatingChar {

    static String longestSubString(String input) {
        if (StringUtils.isBlank(input)) {
            return StringUtils.EMPTY;
        }

        List<String> list = new ArrayList<>();
        //generate all perm n comp
        for (int i = 0; i < input.length(); i++) {
            //
            for (int j = i; j < input.length(); j++) {
                //avoid multiple occurrence
                if (i != j) {
                    String subString = input.substring(i, j);
                    if (!list.contains(subString))
                        list.add(subString);
                }
            }
        }
        HashMap<Character, Integer> map = new HashMap<>();
        List<String> uniqueList = new ArrayList<>();
        for (String s : list) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int value = Optional.ofNullable(map.get(c)).orElse(1) + 1;
                if (map.containsKey(c))
                    map.put(c, value);
                else
                    map.put(c, 1);
            }
        }

        System.out.println(list);
        return StringUtils.EMPTY;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
     //   longestSubString(input);
        //System.out.println(input.substring(0, 0));
        System.out.println(checkRepetition("aba",0,2));

    }
    private static boolean checkRepetition(String s, int start, int end) {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            chars[c]++;
            if (chars[c] > 1) {
                return false;
            }
        }

        return true;
    }
}
