package javaeight;

import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> marijuanaStrains  =  List.of("Purple haze", "Pineapple express", "AK-47");
        marijuanaStrains.forEach(strain -> System.out.println(strain));
        //we could also use method reference like this:
        // marijuanaStrains.forEach(System.out::println);
    }

}
