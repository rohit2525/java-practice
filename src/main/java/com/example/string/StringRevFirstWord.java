package com.example.string;

public class StringRevFirstWord {
    public static void main(String[] args) {
        String input = "This is awesome";
        System.out.println(revFirstWord(input));
    }

    public static String revFirstWord(String input) {
        String output="";
        String array[] = input.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                StringBuilder sb = new StringBuilder(array[i]);
                output = output+(sb.reverse());
            } else {
                output = output+(array[i] +" ");
            }
        }
        return output;
    }
}
