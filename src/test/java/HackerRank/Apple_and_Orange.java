package HackerRank;

import java.util.Arrays;

public class Apple_and_Orange {

    public static void main(String[] args) {

//        7 11
//        5 15
//        3 2
//                -2 2 1
//        5 -6


        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;

        for (int i = 0; i < apples.length; i++) {
            apples[i] = apples[i] + a;
        }
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = oranges[i] + b;
        }
        int countApples = 0;
        int countOranges = 0;
        System.out.println(Arrays.toString(apples));
        System.out.println(Arrays.toString(oranges));
        for (int i = 0; i < apples.length; i++) {
            if (apples[i] >= s && apples[i] <= t) {
                countApples++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] >= s && oranges[i] <= t) {
                countOranges++;
            }
        }
        System.out.println(countApples);
        System.out.println(countOranges);
    }
}
