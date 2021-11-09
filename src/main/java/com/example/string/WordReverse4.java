package com.example.string;


import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class WordReverse4 {
    public static void main(String[] args) {
        //output: Java Love I
        String input = "My name is Nishant";

        Arrays.asList(input.split(" ")).stream()
                .map(s -> StringUtils.capitalize(s))
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(s->System.out.print(s+" "));

    }
}
