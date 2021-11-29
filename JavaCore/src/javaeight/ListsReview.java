package javaeight;

import java.util.ArrayList;
import java.util.List;

public class ListsReview {

    public static void main(String[] args) {
        List<String> strains = new ArrayList<>();
        strains.add("purple haze");
        strains.add("pinaple express");
        strains.forEach(System.out::println);
    }

}
