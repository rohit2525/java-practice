package com.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class IdentifyDataType {
    public static void main(String[] args) {
        String input = "can you give me 10 bucks puff in 7.5 or 7";
        identifyDataType(input);

    }

    public static void identifyDataType(String input) {
        int tempCount = 0;
        Map<String, Integer> dataType = new HashMap<>();
        String[] inputChar = input.split(" ");
        for (String inputStr : inputChar) {
            if (input.matches("^[a-zA-Z]*$")) ;
            {
                tempCount = dataType.get("String") + 1;
                dataType.put("String", tempCount);
            }
            /*else if (input.matches("\\d+"))
            {
                tempCount = dataType.get("Integer") + 1;
                dataType.put("Integer", tempCount);
            }*/
        }

    }
}
