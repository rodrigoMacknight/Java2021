package stringformatting;

public class StringFormatting {

    public static void main(String[] args) {
        String formatedString = String.format("this is a %s string ", "formated");

        String anotherFormatedString = String.format("%d - it should be used over %s", 1, "concatenation");

        String yetAnotherFormatedString = String.format("pi is %.2f", 3.143f);
        System.out.println(formatedString);
        System.out.println(anotherFormatedString);
        System.out.println("\n");
        System.out.println(yetAnotherFormatedString);

    }
}
