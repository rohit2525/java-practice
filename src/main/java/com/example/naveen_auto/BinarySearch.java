package com.example.naveen_auto;
/*Hello guys, can some provide optimal solution for this:
        Int[] a = {1,2,5,7,12,13,15,20};
        We need to write function, f(a, n), if we pass value n=14, it has to return previous element 13, if we pass n>20, should return error.
        Thanks in advance*/
public class BinarySearch {
    static int getMinDiffNo(int[] intArray, int no) {
        int minDiffValue = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            minDiffValue = Math.min(minDiffValue, no - intArray[i]);
            if (minDiffValue < 0) {
                return intArray[i - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,5,7,12,13,15,20};
        System.out.println(getMinDiffNo(a,11));

    }
}
