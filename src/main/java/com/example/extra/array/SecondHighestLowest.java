package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestLowest {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(secondHighestNumInList(al));
        System.out.println(secondLowestNumInList(al));
    }

    static int secondHighestNumInList(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                secondMax = max;
                max = list.get(i);
            } else if (list.get(i) > secondMax) {
                secondMax = list.get(i);
            }
        }
        return secondMax;
    }

    static int secondLowestNumInList(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                secondMin = min;
                min = list.get(i);
            } else if (list.get(i) < secondMin) {
                secondMin = list.get(i);
            }
        }
        return secondMin;
    }
}
