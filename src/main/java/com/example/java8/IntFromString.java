package com.example.java8;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntFromString {
    public static void main(String[] args) {
        //String input = "a3b4c6";
        /*System.out.print(Stream.of(input.split(""))
                .filter(i-> StringUtils.isNumeric(i))
                .mapToInt(i->Integer.valueOf(i))
                .sum());*/
       /* int sum = 0;
        for (char i : input.toCharArray()) {
            if (Character.isDigit(i))
                sum = sum + (Character.getNumericValue(i));
        }
        System.out.print(sum);*/

          /*Input: assns48z6dn8
            Output: 48+6+8*/
        Pattern p = Pattern.compile("\\d+");
        String input = "assns48z6dn8";
        Matcher m = p.matcher(input);
        StringBuilder op = new StringBuilder();
        while (m.find()) {
            op.append(m.group() + "+");
        }
       // System.out.println(op);

/*        Input: 1234565
        Output : 1234060*/
        StringBuilder op1 = new StringBuilder();
        for (char i : "1234565".toCharArray()) {
            if (i == (char) '5')
                op1.append((char) '0');
            else
                op1.append(i);
        }
        System.out.println(op1);
    }
}

