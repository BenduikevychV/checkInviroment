package HackerRank;

import java.util.Arrays;

public class New_Yea_Chaos {

    public static void main(String[] args) {

        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
        int[] f = {1, 2, 3, 4, 5, 6, 7, 8};

        int swap = 0;

        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] != i + 1) {
                if ((i - 1) >= 0 && q[i - 1] == i + 1) {
                    int temp = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp;
                    swap++;
                } else if ((i - 2) >= 0 && q[i - 2] == i + 1) {
                    int temp = q[i-2];
                    q[i - 2] = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp;
//                    q[i] = q[i - 2];
                    swap += 2;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }

        }
        System.out.println(swap);


        System.out.println(Arrays.toString(q));
    }
}
