package com.example.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Immutability {
    public static void main(String[] args) {
        String a = "Hello";
        String b = a;
        a = a + " World";

        String s = new String("Rohit");
        s.concat("Gupta");
        s = "Mr. " + s;
        System.out.println(s);

        System.out.println(a);
        System.out.println(b);

        final List<String> l = new ArrayList(); //you cant write final here
        ///l=new LinkedList<>(); this will not work

        String ex = "Hello";
        ex="world";

        


    }

}
