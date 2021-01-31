package HackerRank;

public class Divisible_Sum_Pairs {

    public static void main(String[] args) {

//        5 2
//        5 9 10 7 4

        int[] ar = {5, 9, 10, 7, 4};
        int k = 2;
        int count = 0;

        for (int y = 0; y < ar.length; y++) {

            int sum = ar[y];
            for (int i = y; i < ar.length - 1; i++) {
                if ((sum + ar[i + 1] )% k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
