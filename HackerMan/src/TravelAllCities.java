class TravelAllCities {
    public static int solution(int[] A) {

        if (A.length<=1) {
            return A.length;
        }

        int sIndex = 0;
        int fIndex = 0;
        int[] visited = new int[A.length];
        visited[A[0] - 1] = 1;

        for (int i = 1; i <A.length ; i++) {
            int current = A[i] -1;

            visited[current]++;

            if (A[i] != A[i - 1]) {
                fIndex = i ;

                while(visited[A[sIndex] -1] >1) {
                    visited[A[sIndex] - 1]--;
                    sIndex++;
                }
            }



        }
        return fIndex - sIndex ;
        // write your code in Java SE 8
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 2, 7, 2, 7, 4, 7};
        System.out.println( TravelAllCities.solution(array));
    }
}