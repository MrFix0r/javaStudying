package com.bivgroup.day4;

import com.bivgroup.day4.bivInterface;

public class A implements bivInterface {

    @Override
    public void bivMethodPrint(String message) {
        System.out.println("Implementation bivMethodPrint");
        System.out.println(message);
    }
}
