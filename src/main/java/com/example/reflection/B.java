package com.example.reflection;

import java.lang.reflect.Field;

public class B {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        A obj = new A("Some value");

        Field privateStringField = A.class.getDeclaredField("str");

//Turn off access check for this field
        privateStringField.setAccessible(true);

        String fieldValue = (String) privateStringField.get(obj);
        System.out.println("fieldValue = " + fieldValue);
        //System.out.println(obj.getClass().);
    }
}
