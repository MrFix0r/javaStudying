package com.bivgroup.day3;


public class Main {
    public static void main (String argc[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Child newChild = new Child();
//        newChild.getClass().getClassLoader();

        System.out.println();

        Class class_ = Class.forName("com.bivgroup.day3.DynamicClass");
        Object obj = class_.newInstance();
        DynamicClass dynamicChild = (DynamicClass) obj;
        dynamicChild.print();

    }
}
