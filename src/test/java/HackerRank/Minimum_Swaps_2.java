package HackerRank;

import java.util.Arrays;

public class Minimum_Swaps_2 {

    public static void main(String[] args) {

//        int arr[] = {7, 1, 3, 2, 4, 5, 6};

        int arr[] = {8, 45, 35, 84, 79, 12, 74, 92, 81, 82, 61, 32, 36, 1, 65, 44, 89, 40, 28, 20, 97, 90, 22, 87, 48, 26,
                56, 18, 49, 71, 23, 34, 59, 54, 14, 16, 19, 76, 83, 95, 31, 30, 69, 7, 9, 60, 66, 25, 52, 5, 37, 27, 63,
                80, 24, 42, 3, 50, 6, 11, 64, 10, 96, 47, 38, 57, 2, 88, 100, 4, 78, 85, 21, 29, 75, 94, 43, 77, 33, 86,
                98, 68, 73, 72, 13, 91, 70, 41, 17, 15, 67, 93, 62, 39, 53, 51, 55, 58, 99, 46};

        int count = 0;
        int min = arr[0];
        int indexMin = 0;

//        for (int y=0;y<arr.length; y++){
//            for (int i=0;i<arr.length-1;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]= arr[i+1];
//                    arr[i+1] = temp;
//                    count++;
//                }
//            }
//        }

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < min) {
                min = arr[k];
                indexMin = k;
            }
        }

        if (indexMin != 0) {
            int temp = arr[0];
            arr[0] = min;
            arr[indexMin] = temp;
            count++;
        }

        for (int current = 1; current < arr.length - 1; current++) {
            int position = arr[current] - arr[0];
            while (arr[position] != arr[current]) {
                int temp = arr[position];
                arr[position] = arr[current];
                arr[current] = temp;
                count++;
                position = arr[current] - arr[0];
            }
            current = position;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);


    }
}
