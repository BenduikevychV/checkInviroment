package HackerRank;

import org.junit.Assert;

import java.util.Arrays;

public class Arrays_Left_Rotation {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        int d = 2;

        int[] c = new int[a.length];

        int x = Math.abs(a.length - d);
        int y = d;

        for (int i = 0; i < x; i++) {
            c[i] = a[d++];
        }
        for (int i = 0; i < y; i++) {
            c[x++] = a[i];
        }


        System.out.println(Arrays.toString(c));

        Assert.assertArrayEquals("Arrays are not matching ", expected, c);
    }
}
