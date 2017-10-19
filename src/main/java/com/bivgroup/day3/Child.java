package com.bivgroup.day3;

public class Child extends Parent {

    testObject field1 = new testObject("Child");
    static testStaticObject field2 = new testStaticObject("Child");

    static {
        System.out.println("Вызван static block у Child");
    }
    {
        System.out.println("Вызван non-static block у Child");
    }


    public Child() {
        System.out.println("Вызван конструктор Child");
    }
}
