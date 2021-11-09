package com.example.string;


public class OddEven {
    public static void main(String[] args) {

        String input = "4572856";
        StringBuilder even = new StringBuilder() ;
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                even.append(input.charAt(i));
            } else {
                odd.append(input.charAt(i));
            }
        }
        System.out.println("Even positions " + even);
        System.out.println("Odd positions " + odd);
    }
}
