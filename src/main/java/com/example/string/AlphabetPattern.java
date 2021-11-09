package com.example.string;

/*Print albhabet pattern
        A
        AB
        ABC
        ABCD
        ABCDE
        ABCDEF*/
public class AlphabetPattern {

    public static void main(String[] args) {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {

           System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
