package com.example.string;

import java.util.regex.Pattern;

public class WordReverse {
    public static void main(String[] args) {
        String input = "I love java. Java is very easy to learn. 'Java' syntax is based on c++";
        String[] inputArr = replaceDirectly(input);

        for (String element : inputArr) {
            System.out.print(element + " ");
        }
    }

    static String[] replaceDirectly(String input) {


        //String[] inputArr = input.split(" |\\.|'");

    /*    for (int i = 0; i < inputArr.length; i++) {
            if( containsIgnoreCase(inputArr[i], "java"))
            {
                inputArr[i] ="avaj";
            }
        }*/
        String[] inputArr = input.split(" ");
        return inputArr;
    }

    public static boolean containsIgnoreCase(String src, String what) {


        final int length = what.length();
        if (length == 0)
            return true; // Empty string is contained

        final char firstLo = Character.toLowerCase(what.charAt(0));
        final char firstUp = Character.toUpperCase(what.charAt(0));

        for (int i = src.length() - length; i >= 0; i--) {
            // Quick check before calling the more expensive regionMatches() method:
            final char ch = src.charAt(i);
            if (ch != firstLo && ch != firstUp)
                continue;

            if (src.regionMatches(true, i, what, 0, length))
                return true;
        }

        return false;
    }
}
