import java.util.Arrays;

public class IntervieDemo {

    public static void main(String[] args) {

//        input : {3,4,5,6,7} Output: {5,6,7,3,4}
        int[] a = {3, 4, 5, 6, 7};
//        int[] b = {5, 6, 7, 3, 4};
        int d = 2;

        int x = a.length - d;
        int[] c = new int[a.length];

        for (int i = 0; i < x; i++) {
            c[i] = a[d++];
        }

        int r = 0;
        for (int i = x; i < a.length; i++) {
            c[i] = a[r++];
        }

        System.out.println(Arrays.toString(c));
    }
}
