package com.example.extra.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class smallestElement {
    public static void main(String[] args) {
        int arr[]={100,30,111,999,1000,250,3333,45,500000};
        int smallNumber=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(smallNumber>arr[i])
            {
                smallNumber=arr[i];
            }
        }
        System.out.println(smallNumber);

        System.out.println(IntStream.of(arr).min().getAsInt());
    }

}
