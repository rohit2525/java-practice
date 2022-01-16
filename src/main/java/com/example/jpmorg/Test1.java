package com.example.jpmorg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        line = in.readLine();*/

     //   System.out.println(squareNum(Integer.parseInt(line)));
        String input = "I want to buy a onesie… :o) but know >;-( it won’t suit me :'{";


        System.out.println(returnCount(input));
    }


    static int squareNum(int x) {
        return x * x;
    }

    static int returnCount(String input) {
        int count = 0;
        for (String s : input.split(" ")) {
            if (isPatternMatching(s))
                count++;
        }
        return count;
    }

    static boolean isPatternMatching(String s) {
        Pattern pattern = Pattern.compile("^>[\\:|\\;|8]?\\'?[- |o|\\~]" +
                "[\\(|C|\\<|\\[|\\{|\\@|\\)|\\]|\\}|D|3]$");

        Matcher matcher = pattern.matcher(s);
        boolean matches = matcher.matches();
        if (matches)
            return true;

        return false;
    }
}
