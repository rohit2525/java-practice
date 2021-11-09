package com.example.list;

import com.google.common.collect.Lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Random2 {
    public static void main(String[] args) {
        String[] a1 = new String[]{"a", "b", ""};
        List<String> b1 = Arrays.asList(a1);
        System.out.println(b1);
        a1[2] = "c";
        System.out.println(b1);
        a1[1] = "x";
        System.out.println(b1);

        String[] a = new String[] { "a", "b", "" };
        List<String> b = Arrays.asList(a);
        System.out.println(Arrays.toString(a));
        b.set(1, "t");
        System.out.println(Arrays.toString(a));


    }
}
