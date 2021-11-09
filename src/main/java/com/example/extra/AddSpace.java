package com.example.extra;

public class AddSpace {
    public static void main(String[] args) {
        //1234567891234567891234567891345679
        //12 3456 789123 45678912
        //  2    6      12       20
        String input = "mytestcase";
        String input2 = "mytestcasemytestcasemytestcase";
        StringBuilder output = new StringBuilder();
        float modCount = 2;
        float addBit = 4;
        for (int i = 0; i < input2.length(); i++) {
            if (i == 0) {
                output.append(input2.charAt(i));
            } else {
                if (i % modCount == 0) {
                    output.append(" ");
                    output.append(input2.charAt(i));
                    modCount = modCount + addBit;
                    addBit = addBit+2;
                } else {
                    output.append(input2.charAt(i));

                }
            }
        }
        System.out.println(output);
       
    }
}
