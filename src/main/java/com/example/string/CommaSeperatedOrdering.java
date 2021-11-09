package com.example.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CommaSeperatedOrdering {
    public static void main(String[] args) {
        String input = "1010;2;313;44;05;161;701";

        String input2 = "A;B;C;D;E";

        //filter non numeric values
        String[] strArr = input.split(";");

        Arrays.sort(strArr);

        for (String s : strArr) {
            if (!s.matches("[0-9]+")) {
                System.out.println("Non numeric value found : " + s);
            }
        }
    }


      /*  //give error on non-numeric value
        List<String> toSort = new ArrayList<>();
        for (String s : input2.split(";")) {
            if (!s.matches("[0-9]+")) {
                System.out.println("Non numeric value found : " + s);
            }
        }
        toSort.sort(null);
        for (String s : toSort) {
            System.out.println(s);
        }
    }*/
}
