import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 47;
        long start = System.nanoTime();
        System.out.println(getFib(number));
        long finish = System.nanoTime();
        System.out.println("time for non recursive:" + (finish - start)/1000000);
        start = System.nanoTime();
        System.out.println(recuFib(number));
        finish = System.nanoTime();
        System.out.println("time for recursive:" + (finish - start)/1000000);

        start = System.nanoTime();
        System.out.println(niceFib(number, new HashMap<>()));
        finish = System.nanoTime();
        System.out.println("time for niceFib:" + (finish - start)/1000000);

    }

    private static Integer getFib( int i) {
        List<Integer> fibList = new ArrayList<>();
        fibList.add(1);
        fibList.add(1);
        i=i-2;

        while (i>0) {
            fibList.add(fibList.get(fibList.size()- 2) + fibList.get(fibList.size() - 1));
            i--;
        }
        return fibList.get(fibList.size() - 1);
    }


    private static Integer recuFib( int i) {
        if (i <= 2) return 1;
        return (recuFib(i - 2) + recuFib(i - 1));
    }

    private static BigInteger niceFib(int n, HashMap<Integer, BigInteger> memo) {
        if (n <= 2) return BigInteger.valueOf(1);
        if (n <= memo.size()) {
            return memo.get(n);
        }
        memo.put(n, niceFib(n - 1, memo).add( niceFib(n -2, memo)));
        return memo.get(n);
    }

}
