package com.example.array;

public class ArrayFrequency {
 /*   Write a function called same, which accepts 2 arrays. The function should return true if every value in the array has it's corresponding value squared in the 2nd array. The frequency of the values must be same and order doesn't matter.

    Eg : same([1, 2, 3], [4, 1, 9] // true
              same([1, 2, 3], [1, 9] // false
              same([1, 2, 1], [4, 4, 1] //false(must be same frequency)
 Integer[] arr1 = {1, 2, 3};
    Integer[] arr2 = {4, 1, 9};
    Integer[] arr3 = {1, 9};
    Integer[] arr4 = {4, 1, 4};
    Integer[] arr5 = {2, 2, 2};
    Integer[] arr6 = {4, 4, 4};
      System.out.println(isFrequencyMatching(arr1, arr2));
        System.out.println(isFrequencyMatching(arr1, arr3));
        System.out.println(isFrequencyMatching(arr1, arr4));
        System.out.println(isFrequencyMatching(arr5, arr6));*/

    public static void main(String[] args) {

        Integer[] arr7 = {2, 2, 2, 2, 1};
        Integer[] arr8 = {4, 4, 1, 4, 4};
        System.out.println(isFrequencyMatching(arr7, arr8));
    }

    private static boolean isFrequencyMatching(Integer[] a, Integer[] b) {
        if (a.length != b.length)
            return false;

        int matchCount = 0;
        boolean matchFrequency = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ((a[i] * a[i]) == (b[j])) {
                    matchCount++;
                    break;
                }
            }
        }
        if (matchCount == a.length)
            matchFrequency = true;
        return matchFrequency;
    }
}
