package com.example.leetcode;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] eval = eval(nums, target);
        System.out.println(Arrays.toString(eval));
    }

    public static int[] eval(int[] input, int target) {
        int[] op = new int[2];
        for (int k : input) {
            for (int j = 1; j < input.length; j++) {
                if (target - k == input[j]) {
                    op[0] = k;
                    op[1] = input[j];
                }
            }
        }
        return op;
    }
}
