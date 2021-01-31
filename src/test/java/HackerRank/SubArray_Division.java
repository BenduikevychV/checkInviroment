package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray_Division {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> s = new ArrayList<>();
        s.add(4);
        s.add(5);
        s.add(4);
        s.add(2);
        s.add(4);
        s.add(5);
        s.add(2);
        s.add(3);
        s.add(2);
        s.add(1);
        s.add(1);
        s.add(5);
        s.add(4);
//  4 5 4 2 4 5 2 3 2 1 1 5 4
//        15 4
        int d = 15;
        int m = 4;

        int[] a = {1, 2, 1, 3, 2};
        int count = 0;

        for (int y = 0; y < s.size(); y++) {

            int count1 = 0;
            int piece = 0;

            for (int i = y; i < s.size(); i++) {
                piece += s.get(i);
                count1++;
                if (count1 == m) {
                    if (piece == d) {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);

    }
}
