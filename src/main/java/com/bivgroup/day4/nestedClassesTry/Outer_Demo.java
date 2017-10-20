package com.bivgroup.day4.nestedClassesTry;

public class Outer_Demo {
    int num;

    public Outer_Demo(int num) {
        this.num = num;
    }

    //inner class
    private  class Inner_Demo {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    public class Inner_Public_Demo {
        public int getNum() {
            System.out.println("This is the getNum method of the inner class");
            return num;
        }
    }

    void displayInner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}
