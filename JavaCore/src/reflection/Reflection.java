package reflection;

import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) {
        String hello = "hello";

        printClassNameWithObj(hello);

        printKlassFromClass(String.class);

        System.out.println((String.class).getSuperclass());

        System.out.println(Arrays.toString(String.class.getInterfaces()));

        try {
            printKlassFromClass(Class.forName("java.lang.String"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        printClassMethods(hello);


    }

    private static void printKlassFromClass(final Class<?> stringClass) {
        System.out.println(stringClass);
    }

    private static void printClassMethods(final String hello) {
        Class<?> helloClass = hello.getClass();
        System.out.println(Arrays.toString(helloClass.getMethods()));
    }

    private static void printClassNameWithObj(final String hello) {
        System.out.println(hello.getClass());
    }

}
