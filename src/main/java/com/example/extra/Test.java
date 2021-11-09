package com.example.extra;

import java.io.IOException;

class A
{
    void m1() throws IOException
    {
        System.out.println("In m1 A");
    }
}
class B extends A
{
    //Below we cannot throw Exception, Since child class cannot throw higher exception then parent class
    void m1()
    {
        System.out.println("In m1 B");
    }
}
public class Test {

    public static void main(String[] args) {
        A a=new B();
        try {
            a.m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}