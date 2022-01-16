package com.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Separate Odd And Even Numbers in An Array
public class SeparateOddEven {

    static void sepOddEven(Integer arr[]) {

        Map<Boolean, List<Integer>> partitions = Arrays.stream(arr)
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        List<Integer> evens = partitions.get(true);
        List<Integer> odds = partitions.get(false);
     //   System.out.println(evens);
     //   System.out.println(odds);

        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for (Integer i : arr) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
   //     System.out.println(evenList);
   //     System.out.println(oddList);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sepOddEven(arr);

        Map<Boolean, List<Integer>> map = Arrays.stream(arr)
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(map.get(true));
        System.out.println(map.get(false));
    }
}
