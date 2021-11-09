package com.example.pattern;

import java.nio.charset.StandardCharsets;

public class Palindrome {
    public static void main(String[] args) {
        String input ="rohit";
        String palindromeString="madam";
        isPaindrome(input);

    }

    static void isPaindrome(String input)
    {
        boolean palindrome=false;
        char[] inputArr= input.toCharArray();
        for(int i=0;i<input.length()/2;i++)
        {
            if(inputArr[i] == inputArr[input.length()-(i+1)])
            {
                palindrome=true;
            }
            else
            {
                palindrome=false;
                break;
            }
        }
        if(palindrome)
        {
            System.out.println(input +" is palindrome");
        }
        else
        {
            System.out.println(input +" is not palindrome");
        }
    }
}
