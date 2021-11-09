package com.example.extra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {/*
    Input={2,1,1,4,5,5,6,7}
    Output={2,4,6,7}...remove duplicate numbers from list*/

    public static void main(String[] args) {
        Integer [] intArr={2,1,1,4,5,5,6,7};
        Set<Integer> set = new HashSet<>(Arrays.asList(intArr));
        System.out.println(Arrays.toString(set.toArray()));
    }
}
