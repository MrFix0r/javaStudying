package com.bivgroup.day4;

public class genericTry<T> {
    private T val;

    public genericTry(T val) {
        this.val = val;
    }

    public T getValue(){
        return val;
    }

    public String toString() {
        return "{ " + val + "}";
    }

}
