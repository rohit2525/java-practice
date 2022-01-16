package com.example.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Input: August@2021SEVeN*08$#Year
    Output: ASEVNY , @*$#, 202108, ugusteear*/
public class RegexTest1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String input = "August@2021SEVeN*08$#Year";
        String regEx1 = "[A-Z]+";
        String regEx2 = "[@*#$]+";
        String regEx3 = "[0-9]+";
        String regEx4 = "[a-z]+";
        List<String> regEx = new ArrayList<>(Arrays.asList(regEx1, regEx2, regEx3, regEx4));

        for (String reg : regEx) {
            Matcher matcher = Pattern.compile(reg).matcher(input);
            while (matcher.find()) {
                sb.append(matcher.group());
            }
        }
        System.out.println(sb);
    }
}
