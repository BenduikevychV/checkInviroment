package HackerRank;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Between_Two_Sets {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);


        Collections.sort(a);
        Collections.sort(b);
        int c;

        if (a.size() > 1) {
            c = Math.abs(a.get(0) - a.get(1));
        } else {
            c = a.get(0);
        }

        int x = c;
        int count = 0;

        for (int i = a.get(a.size() - 1); i <= b.get(0); i += c) {
            int numb = i;
            boolean isEvenNum = true;
            boolean isEvenSecondArr = true;
//                System.out.println(numb);
            for (int y = 0; y < a.size(); y++) {
                if (numb % a.get(y) != 0) {
                    isEvenNum = false;
                }

            }

            if (isEvenNum) {

                for (int t = 0; t < b.size(); t++) {
                    if (b.get(t) % numb != 0) {
                        isEvenSecondArr = false;
                    }
                }
                if (isEvenSecondArr) {
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
