package reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

//methods have the same logic. getmethods and getdeclaredmethods
public class ReflectionFields {

    public static void main(String[] args) {
        Class<?> klass = String.class;

        try {
            Field field = klass.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        printAllStringFields(klass);
    }

    private static void printAllStringFields(final Class<?> klass) {
        //declared == all private, public and protected fields
        Field[] allfields = klass.getDeclaredFields();

        System.out.println(Arrays.toString(allfields));
    }

}
