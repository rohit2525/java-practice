package com.example.extra;

public class PassByValueOrRef {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("gupta");
        int i=5;
        changePrimitve(i);
        System.out.println(i);
    }

    static void anotherRef(Person anothherRef) {
        anothherRef.setName("rohit");
      //  System.out.println(anothherRef.hashCode());
    }

    static void otherRef(Person otherRef) {
    //    System.out.println(otherRef.hashCode());
    }

    static void changePrimitve(int i)
    {
        i=20;
        System.out.println(i);
    }
}


class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
