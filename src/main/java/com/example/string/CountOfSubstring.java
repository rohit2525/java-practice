package com.example.string;

import java.util.ArrayList;

public class CountOfSubstring {

    public static void main(String[] args) {
        String input1 = "abcabc";
        String subString1 = "abc";
        System.out.println(findMultiplier(input1, subString1));


        String input2 = "abcdabcdabcd";
        String subString2 = "abcd";
        System.out.println(findMultiplier(input2, subString2));

        String input3 = "abcdabc";
        String subString3 = "abc";
        System.out.println(findMultiplier(input3, subString3));


        String input4 = "abcabc";
        String subString4 = "ab";
        System.out.println(findMultiplier(input4, subString4));

        String input5 = "abc abc abc";
        String subString5 = "abc";
        System.out.println(findMultiplier(input5, subString5));

        String input6 = "345";
        String subString6 = "tcs";
        System.out.println(findMultiplier(input6, subString6));
    }

    private static int findMultiplier(String inputString, String subString) {
        System.out.print("Main String: " + inputString + ", SubString: " + subString + ", RepeatCount: ");
        ArrayList<String> op = new ArrayList<String>();
        int inc = 0;
        int endIndex = subString.length();

        for (int i = 0; i < inputString.length(); i = i + subString.length()) {
            if (endIndex > inputString.length())
                return -1;

            op.add(inputString.substring(i, endIndex));
            endIndex = endIndex + subString.length();
            inc++;
        }
        if (op.stream().allMatch(s -> s.equals(subString)))
            return op.size();
        else
            return -1;
    }
}
