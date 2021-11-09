package com.example.string;

//i/p = A1 B2 C3 #S // op: A1 3C 2B #S
public class Reversecentrechars {
    public static void main(String[] args) {
        String input = "A1 B2 C3 #S";
        System.out.println(reverseCentre(input));
        String input1="Z5 Y4 X3 W2 #&";
        System.out.println(reverseCentre(input1));
    }

    static String reverseCentre(String input) {
        StringBuilder reverseString = new StringBuilder();
        String[] inputArray = input.split(" ");
        int j = inputArray.length-1;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0 || i == inputArray.length-1) {
                reverseString.append(inputArray[i] + " ");
            } else {
                reverseString.append(new StringBuilder(inputArray[j]).reverse() + " ");
            }
            j--;
        }
        return reverseString.toString();
    }
}

