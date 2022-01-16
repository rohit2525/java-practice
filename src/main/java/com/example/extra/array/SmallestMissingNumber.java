package com.example.array;

/*
 * Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n.
 *  Find the smallest number that is missing from the array.
 * Input: {0, 1, 2, 6, 9}, n = 5, m = 10
Output: 3

Input: {4, 5, 10, 11}, n = 4, m = 12
Output: 0

Input: {0, 1, 2, 3}, n = 4, m = 5
Output: 4

Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
Output: 8
* */
public class SmallestMissingNumber {

    static int findMinNumber(Integer[] arr, int length, int max) {
        int iteration = max - arr[0];
        int count = arr[0];

        for (int i = 0; i < iteration; i++) {
            if (arr[i] == count)
                count++;
            else
                return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        Integer[] i1 = {0, 1, 2, 6, 9};
        int length1 = 5;
        int max1 = 10;
        System.out.println(findMinNumber(i1, length1, max1));
        Integer[] i2 = {4, 5, 10, 11};
        int length2 = 4;
        int max2 = 12;
        System.out.println(findMinNumber(i2, length2, max2));
        Integer i3[] = {0, 1, 2, 3, 4, 5, 7};
        int max3=8;
        System.out.println(findMinNumber(i3, 7, max3));
    }
}
