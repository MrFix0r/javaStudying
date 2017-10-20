package com.bivgroup.day4;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        CustomClassLoader loader1 = new CustomClassLoader();
        CustomClassLoader loader2 = new CustomClassLoader();

        Class<?> clazz1= Class.forName("com.bivgroup.day4.A",true,loader1);

        //        A object1= (A) clazz1.newInstance();

        Class<?> clazz2= Class.forName("com.bivgroup.day4.A",true,loader2);

        //        A object2= (A) clazz2.newInstance();

        System.out.println("Первый объект - " + clazz1.getClassLoader());
        System.out.println("Второй объект - " + clazz2.getClassLoader());

        if (clazz1.equals(clazz2))
        {
            System.out.println("Это одни и те же классы");
        }
        else
            System.out.println("Классы разные - я проверил :)");
    }
}
