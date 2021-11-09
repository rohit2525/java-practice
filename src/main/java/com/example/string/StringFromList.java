package com.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringFromList {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Naveen", "Automation","Labs"));
        Pattern pattern = Pattern.compile("^(?!.*\").*$");
        List<String> op = list
                .stream()
                .filter(e -> pattern.matcher(e).matches())
                .collect(Collectors.toList());
        System.out.println(op);
    }
}
