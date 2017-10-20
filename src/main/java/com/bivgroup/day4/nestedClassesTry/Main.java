package com.bivgroup.day4.nestedClassesTry;

public class Main {
    public static void main(String[] args) {
        Outer_Demo outer = new Outer_Demo(15);
        outer.displayInner();

        Outer_Demo.Inner_Public_Demo inner = outer.new Inner_Public_Demo();
        System.out.println(inner.getNum());
    }
}
