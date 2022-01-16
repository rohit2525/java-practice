package com.example.extra.array;
/*Find first and last positions of an element in a sorted array
* Input : arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
        x = 5
Output : First Occurrence = 2
         Last Occurrence = 5

Input : arr[] = {1, 3, 5, 5, 5, 5, 7, 123, 125 }
        x = 7
Output : First Occurrence = 6
         Last Occurrence = 6*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstAndLastPositionsOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int element = 5;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                al.add(i);
        }

        List<Integer> collect = Arrays.stream(arr).boxed().filter(e -> e == 5).collect(Collectors.toList());
      //  IntStream.range(0,arr.length).

      //  System.out.println(al);
       //System.out.println("First Occurence: " + al.get(0) + "  Last Occurence: " + al.get(al.lastIndexOf(element)));
    }
}
