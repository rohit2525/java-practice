package com.example.string;

public class Fillzeros {
    public static void main(String[] args) {
        String input1 = "ABCDEFGHIJKL";
        String input2 = "ABCDEFGHI";
        String input3 = "ABCDE";
        String input4 = "ABCDEF";
        String input5 = "ABCDEFGHIJ";
        System.out.println(appendZero(input1));
        System.out.println(appendZero(input2));
        System.out.println(appendZero(input3));
        System.out.println(appendZero(input4));
        System.out.println(appendZero(input5));
    }

    static String appendZero(String input) {
        StringBuilder op = new StringBuilder(input);
        if (input.length() > 12) {
            return "Invalid input";
        }
        if (input.length() == 12) {
            return input;
        }
        if (input.length() >= 9) {
            for (int i = input.length(); i < 12; i++) {
                op.append("0");
            }
            return op.toString();
        }

        if (input.length() < 9) {
            int j = 0;
            while (j < 3) {
                op.append("0");
                j++;
            }
            for (int i = op.length(); i < 12; i++) {
                op.insert(0, '0');
            }
            return op.toString();
        }
        return input;
    }
}
