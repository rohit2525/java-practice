package com.example.string;

public class StringRevFirstWord {
    public static void main(String[] args) {
        String input = "This is awesome";
        System.out.println(revFirstWord(input));

    }

    public static String revFirstWord(String input) {
        StringBuilder output = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        String[] array = input.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0)
                output.append(sb.append(array[i]).reverse());
            else
                output.append(array[i]).append(" ");
        }
        return output.toString();
    }
}
