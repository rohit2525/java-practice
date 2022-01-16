package com.example.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RemoveDuplicatesString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\rohit.gupta\\Desktop\\missing\\double_spend_entry.txt"));
        List<String> data = new ArrayList<String>();
        String s;
        while ((s = reader.readLine()) != null)
            data.add(s);

        reader.close();
        Set<String> strings = removeDuplicates(data);
        System.out.println(strings);
    }

    static Set<String> removeDuplicates(List<String> inputList) {
        Set<String> set = new HashSet<>();
        for (String input : inputList) {
            set.add(input);
        }
        return set;
    }
}
