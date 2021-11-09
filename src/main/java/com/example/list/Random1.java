package com.example.list;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Random1 {


    /*public static void main(String[] args) {
        List<String> list = Arrays.asList("sunil-56-88-23", "bindul-88-70-10", "john-70-49-65");

        Map<String, Integer> kvs =
                list
                   .stream()
                    .map(elem -> elem.split("-"))
                    .collect(Collectors.toMap(e -> e[0], e -> Integer.parseInt(e[1]) + Integer.parseInt(e[2]) + Integer.parseInt(e[3])));

        for (Map.Entry<String, Integer> entry : kvs.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

            Map<String,Integer> opMap= new HashMap<>();
            for (String s : list) {
              String [] op=  s.split("-");
                for(int i=0;i<op.length;i++)
                {
                    opMap.put(op[i], )
                }
            }
        }
    }*/
}
