package com.example.pattern;

public class zeroToHash {
    public static void main(String[] args) {
        String input = "tomorrow";
        StringBuilder finalOutput = new StringBuilder();
        int count = 0;
        for (char i : input.toCharArray()) {
            if (i == 'o') {
                count++;
                for(int j=0;j<count;j++)
                finalOutput.append('#');
            } else
                finalOutput.append(i);
        }
        System.out.println(finalOutput);
    }
}
