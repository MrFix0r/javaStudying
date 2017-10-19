package com.bivgroup.day3;

public class Parent {

    testObject field1 = new testObject("Parent");
    static testStaticObject field2 = new testStaticObject("Parent");

    static {
        System.out.println("Вызван static block у Parent");
    }
    {
        System.out.println("Вызван non-static block у Parent");
    }

    Parent(){
        System.out.println("Вызван конструктор Parent");
    }
}
