import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class JumpingClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int jumpCount = 0;
        int position = 0;
        boolean ended = false;
        while (!ended) {
            if (position + 1 > c.size()-1) {
               ended = true;
               continue;
            }

            if (position + 2 > c.size()-1) {
                if (c.get(position+1)==0) {
                    jumpCount++;
                    ended=true;
                }
            }

            if (c.get(position + 2) == 0) {
                position +=2;
            }  else {
                position +=1;
            }
            jumpCount++;
        }
        return jumpCount;
    }

}

class JC_Solution {

    //example entry:
    //6
    //0 0 0 0 1 0
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = JumpingClouds.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }



}