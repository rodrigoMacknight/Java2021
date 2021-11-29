package javaeight;

import java.util.Arrays;

public class ArraysReview {


    public static void main(String[] args) {
//        String[] musicians = new String[5];
//        musicians[0] = "zappa";
//        musicians[1] = "beatles";
//        musicians[2] = "jimmi";
//        musicians[3] = "alonso";

        String[] musicians = new String[]{"zappa",
            "beatles",
            "jimmi",
            "alonso"};

        for (int i = 0; i <musicians.length-1; i++) {
            System.out.println(musicians[i]);
        }

        System.out.println("\n\nreversed array:");
        for (int i = musicians.length-1; i >= 0 ; i--) {
            System.out.println(musicians[i]);
        }
        System.out.println("\n\n");
        for (String s: musicians) {
            System.out.println(s);
        }
        System.out.println("\n\n");
        Arrays.stream(musicians).forEach(System.out::println);
    }

}
