package HackerRank;

import io.cucumber.java.it.Ma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Manipulation {

    public static void main(String[] args) {


//        a b k
//        1 5 3
//        4 8 7
//        6 9 1

//          1 2 3  4  5 6 7 8 9 10
//         [0,0,0, 0, 0,0,0,0,0, 0]
//	       [3,3,3, 3, 3,0,0,0,0, 0]
//	       [3,3,3,10,10,7,7,7,0, 0]
//	       [3,3,3,10,10,8,8,8,1, 0]

        int[] q[] = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};
//        2 3 603
//        1 1 286
//        4 4 882;
//        int[] q[] = {{2, 3, 603}, {1, 1, 286}, {4, 4, 882}};
        int n = 10;

        long[] newArr = new long[n];


        long maxValue = q[1][1];


        for (int i = 0; i < q.length; i++) {
            int k = q[i][2];
            int firstEl = (int) q[i][0]-1;
            int secondEl = q[i][1];

//            INNERLOOP:
//            for (int elNewArr = 0; elNewArr < n; elNewArr++) {
//                long elArr = newArr[elNewArr];
//
//                if (firstEl == elNewArr+1) {
//                    newArr[elNewArr] = elArr + k;
//                    firstEl++;
//                }
//
//                if (maxValue < newArr[elNewArr]) {
//                    maxValue = newArr[elNewArr];
//                }
//
//                if (secondEl == elNewArr+1) {
//                    break INNERLOOP;
//                }
//
//            }

//            int numbEl = (int) firstEl - 1;
//            do {
//                newArr[numbEl] += k;
//
//                if (maxValue < newArr[numbEl]) {
//                    maxValue = newArr[numbEl];
//                }
//                numbEl++;
//            } while (numbEl < secondEl);

            for (; firstEl < secondEl; ) {
                newArr[firstEl] += k;


                if (maxValue < newArr[firstEl]) {
                    maxValue = newArr[firstEl];
                }
                firstEl++;
            }
            System.out.println(Arrays.toString(newArr));
        }

        System.out.println(Arrays.toString(newArr));

        System.out.println(maxValue);
    }
}
