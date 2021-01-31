package HackerRank;

import java.util.*;

public class Picking_Numbers {

    public static void main(String[] args) {

//        List<Integer> a = Arrays.asList(4, 6, 5, 3, 3, 1);

        List<Integer> a = Arrays.asList(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3,
                9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99,
                9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4);

//        List<Integer> a = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5);
//        List<Integer> a = Arrays.asList(1, 2, 2, 3, 1, 2);
        Collections.sort(a);

        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if (Math.abs(a.get(j) - a.get(i)) <= 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
