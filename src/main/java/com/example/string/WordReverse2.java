package com.example.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReverse2 {
    public static void main(String[] args) {
        String input = "I love java. Java is very easy to learn. 'Java' syntax is based on c++";
        //String[] inputArr = replaceDirectly(input);

        System.out.println(replaceDirectly(input));
    }

    private static String replaceDirectly(String input) {


        Pattern pattern = Pattern.compile(Pattern.quote("java"), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer(input.length());
        while (matcher.find()) {
            String text = matcher.group(1);
            matcher.appendReplacement(sb, Matcher.quoteReplacement("avaj"));
        }
        matcher.appendTail(sb);
        System.out.println(sb.toString());

        return sb.toString();
    }
}
