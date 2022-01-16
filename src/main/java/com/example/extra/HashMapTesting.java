package com.example.extra;

import java.util.HashMap;

public class HashMapTesting {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(1,2);

        System.out.println(map);

    }
}
