package javaeight;

public class Lambda {

    public static void main(String[] args) {

        SumAndPrint sp = (x,y) -> System.out.println(x + y);
        sp.sumAndPrint(5, 5);
    }

}
