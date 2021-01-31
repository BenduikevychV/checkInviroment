package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Circular_Array_Rotation {

    public static void main(String[] args) {

//        3 2 3
//        1 2 3
//        0
//        1
//        2

        int[] a = {1, 2, 3};
        int k = 2;
        int[] queries = {0, 1, 2};

        int arr[] = new int[a.length];

        for(int i=0 ; i<a.length ; i++)
            arr[(i+k)%a.length] = a[i];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < queries.length; i++) {
            queries[i] = arr[queries[i]];
        }

        System.out.println(Arrays.toString(queries));

    }
}
