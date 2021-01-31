package HackerRank;

import java.util.Arrays;

public class Designer_PDF_Viewer {

    public static void main(String[] args) {

        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

        String word = "abc";

        String alphabet = "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";

        String[] alphabetArr = alphabet.split(",");

        int tallest = 0;

        for (int i = 0; i < word.length(); i++) {
            String letter = word.charAt(i) + "";

            InnerLoop:
            for (int y = 0; y < alphabetArr.length; y++) {

                if (letter.equals(alphabetArr[y].trim())) {
                    if (tallest < h[y]) {

                        tallest = h[y];
                    }
                    break InnerLoop;
                }
            }
        }

        tallest = tallest * word.length();
        System.out.println(tallest);


    }
}
