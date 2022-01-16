package com.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElementArray {
    public static void main(String[] args) {
        int[] input = {1, 10, 3, 4, 4, 5, 10, 10, 3};
        System.out.println(findDuplicate(input));
    }

    static int findDuplicate(int[] input) {
        // create an empty set
/*      Arrays.stream(input).collect(Collectors.toSet());
        // do for every array element
        for (int e : input) {
            // return true if a duplicate is found
            if (set.contains(e)) {
                return e;
            }
            set.add(e);
        }
        return 0;*/
    }
}
