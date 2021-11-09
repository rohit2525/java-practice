package com.example.extra;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordNumberReverse {
    public static void main(String[] args) {
        String input = "Vinay123Binod456";
        System.out.println(numberReverse(input));
    }

    public static String numberReverse(String input) {
        String[] splitArr = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        StringBuilder opString = new StringBuilder();
//        return opString.append(splitArr[0]).append(reversDigits(splitArr[1])).toString();
        /*for(String s: splitArr)
        {
            if(StringUtils.isNumeric(s))
            opString.append(reversDigits(s));
            else
                opString.append(s);
        }*/
        return opString.toString();
    }

    static int reversDigits(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    static String[] splitArr(String input)
    {
        List<String> arrlist  = new ArrayList<String>();
        /*for (char s: input.toCharArray())
        {
            if(Character.isDigit(s))
                arrlist.add(reversDigits(Character.getNumericValue(s)));
            else
                arrlist.add(String.valueOf(s));
        }*/
        return null;
    }
}
