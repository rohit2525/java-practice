package com.example.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class removeDuplicateChar {
    public static void main(String[] args) {
        String input = "eeessmmmskaaakkbd";
        System.out.println(removeDuplicates(input));
    }

    public static String removeDuplicates(String string) {
        /*int chunkSize = 3;
        final int numberOfChunks = (string.length() + chunkSize - 1) / chunkSize;
        List<String> collect = IntStream.range(0, numberOfChunks)
                .mapToObj(index -> string.substring(index * chunkSize, Math.min((index + 1) * chunkSize, string.length())))
                .collect(Collectors.toList());*/

        while(string.length() > 3) {
        //    System.out.println(string.substring(0, 3));
            string = string.substring(3);
        }
        System.out.println(string);
        
        return null;
    }

}
