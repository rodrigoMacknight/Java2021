import java.util.Arrays;

public class Anagrams {


    static boolean solution(String s, String t) {

        String[] sWords = s.split(" ");
        String[] tWords = t.split(" ");
        if (sWords.length != tWords.length) return false;
        for (int i = 0; i < sWords.length ; i++) {
            char[] sChars = sWords[i].toCharArray();
            Arrays.sort(sChars);
            sWords[i] = Arrays.toString(sChars);

            char[] tChars = tWords[i].toCharArray();
            Arrays.sort(tChars);
            tWords[i] = Arrays.toString(tChars);
        }
        Arrays.sort(tWords);
        Arrays.sort(sWords);

        for (int i = 0; i < sWords.length ; i++) {
            if(!sWords[i].equals(tWords[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aa bb";
        String t = "ab ab";
        System.out.println(solution(s, t));
    }

}
