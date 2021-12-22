package stringbuilder;

public class StringBuilding {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("this is  ");
        sb.append("an example of stringBuilder");
        sb.append("\n");
        sb.append("\n");
        sb.append("it should be used over string concatenation");

        System.out.println(sb);
    }

}
  