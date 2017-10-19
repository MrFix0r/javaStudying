package com.bivgroup.day4;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        A tmpA = new A();
        tmpA.bivMethodPrint("Hello");

        ClassLoader loader1 = new CustomClassLoader();
        ClassLoader loader2 = new CustomClassLoader();

        Class clazz1= Class.forName("com.bivgroup.day4.A",true,loader1);
        Object object1= clazz1.newInstance();

        Class clazz2= Class.forName("com.bivgroup.day4.A",true,loader2);
        Object object2= clazz2.newInstance();

        System.out.println("Первый объект - " + object1.getClass().getClassLoader());
        System.out.println("Второй объект - " + object2.getClass().getClassLoader());

    }
}
