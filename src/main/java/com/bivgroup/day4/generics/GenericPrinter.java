package com.bivgroup.day4.generics;

import com.sun.xml.internal.bind.v2.TODO;

public class GenericPrinter<T> {
    private T val;

    GenericPrinter(T val) {
        this.val = val;
    }

    public T getValue(){
        return val;
    }

    public String toString() {
        return "{ " + val + " }";
    }

//    public T getType() {
//        return T;
//    }
    // TODO: 19.10.17   попробовать вернуть тип у Generic;
}
