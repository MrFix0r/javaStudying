package com.bivgroup.day4.generics;

public class Main {
    public static void main(String[] args) {
        GenericPrinter<Integer> printer = new GenericPrinter<>(10);
        System.out.println(printer.toString());

        GenericPrinter<String> printer2 = new GenericPrinter<>("10");
        System.out.println(printer2.toString());

    }
}
