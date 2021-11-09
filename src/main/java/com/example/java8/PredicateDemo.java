package com.example.java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        System.out.println(testLength(("rohitgupta")));

        Predicate<String> checkLength = s -> s.length() > 5;

        System.out.println(checkLength.test("rohitgupta"));
    }

  static  boolean testLength(String input)
    {
        if(input.length()>5)
        {
            return true;
        }
        return false;
    }

}
