package com.bivgroup.day2;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

public class Reflection {

    private static int COUNT = 5;
    private static int NUMBER = 5;

    public static void main (String argc[]) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, InstantiationException, ClassNotFoundException, NoSuchMethodException {

        Reflection tmpRef = new Reflection();
        classInfo(tmpRef.getClass());


        testA tmpTest = new testA();
        classInfo(tmpTest.getClass());

//        Reflection tmpRef = new Reflection();               //второй пункт
//        invoke(tmpRef,"print","Hi");

//        dynamicCreation();                                  //третий пункт

    }
    private void print (final String s) {
        System.out.println(s);
    }

    public static void classInfo(Class clazz) throws NoSuchFieldException {

        System.out.println("package " + clazz.getPackage().getName() + ";");
        createSecondHeaderString(clazz);

        fieldInfo(clazz);
        constructorInfo(clazz);
        methodInfo(clazz);

//        System.out.println("Аннотации: ");
//        Annotation[] annotations = clazz.getDeclaredAnnotations();
//        for (Annotation annotation : annotations)
//            System.out.println(annotation.toString());

        System.out.println("}");
        System.out.println();
    }

    public static void createSecondHeaderString(Class clazz) {

        if (clazz.isInterface())
            System.out.print(createModString(clazz) + "interface " + clazz.getSimpleName());
        else
            System.out.print(createModString(clazz) + "class " + clazz.getSimpleName());
        if (clazz.getSuperclass() != null)
            System.out.print(" extends " + clazz.getSuperclass().getSimpleName() + " ");

        List<Class> interfaces = Arrays.asList(clazz.getInterfaces());
        if (!interfaces.isEmpty())
            System.out.print("implements ");
        for(Class cInterface : interfaces) {
            System.out.print( cInterface.getSimpleName() + " " );
            List<Method> iMethods = Arrays.asList(cInterface.getDeclaredMethods());

        }

        System.out.println("{ ");
    }

    public static void constructorInfo (Class clazz) {
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.print("\t" + clazz.getSimpleName() + " ( ");
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getSimpleName() + " ");
            }
            System.out.println(" ) { */compiled code / }");
        }
    }

    public static void fieldInfo(Class clazz) throws NoSuchFieldException {
        System.out.println();
        Field[] allFields = clazz.getDeclaredFields();
        for (Field field : allFields) {
            Class fieldType = field.getType();
            System.out.println("\t" + createModString(field.getType()) + fieldType.getSimpleName() + " " + field.getName() + ";");
        }
        System.out.println();
    }

    public static void methodInfo(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print("\t" + createModString(method.getClass()) + method.getReturnType().getName() + " " + method.getName() + " ( ");
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                    System.out.print(createModString(paramType) + paramType.getSimpleName() + " ");
            }
            System.out.println(") { /*compiled code / };");
        }
    }

    public static String createModString(Class clazz) {
        int mods = clazz.getModifiers();
        String modsString = "";
        if (Modifier.isPublic(mods)) {
            modsString+="public ";
        }
        if (Modifier.isPrivate(mods)) {
            modsString+="private ";
        }
        if (Modifier.isProtected(mods)) {
            modsString+="protected ";
        }
        if (Modifier.isStatic(mods)) {
            modsString+="static ";
        }
        if (Modifier.isAbstract(mods)) {
            modsString+="abstract ";
        }
        if (Modifier.isFinal(mods)) {
            modsString+="final ";
        }
        return modsString;
    }

    static void invoke(Object o, String methodName, String... arg) throws InvocationTargetException, IllegalAccessException {
        Class c = o.getClass();
        Method[] allMethods = c.getDeclaredMethods();
        for (Method method : allMethods) {
            if (method.getName().equals(methodName)) {
//                Object[] args = new Object[] { new String(arg)};
                method.invoke(o, arg);
            }
        }
    }

    static void dynamicCreation () throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("сom.bivgroup.testA");
        Object obj = c.getConstructor().newInstance();
        testA test = (testA) obj;
        test.eat("pizza");
    }

}


