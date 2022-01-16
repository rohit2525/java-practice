package com.example.extra;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Can anybody write program for below logic
How to find the smallest element from 3 different Array E.g
int a[]={2,3,4}
int b[]={4,5,6}
int c[]={1,2,9}

Here the in the 3rd array 1 is the smallest element from this 3 array
* */
public class ArrayToArrayList {
    public static void main(String[] args) {
        int a[] = {2, 3, 4};
        int b[] = {4, 5, 6};
        int c[] = {1, 2, 9};

        int[] intermediateArr = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        Integer integer = IntStream.concat(Arrays.stream(intermediateArr), Arrays.stream(c))
                .boxed()
                .reduce(Math::min).get();

        System.out.println(integer);

    }
}
