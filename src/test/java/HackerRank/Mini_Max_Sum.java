package HackerRank;

public class Mini_Max_Sum {


    public static void main(String[] args) {

        int arr [] = {256741038 ,623958417 ,467905213 ,714532089 ,938071625};
//        int arr[] = {5, 5, 5, 5, 5};

        int min = 2147483647;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
        long sumMax = 0;
        long sumMin = 0;
        for (int a : arr) {
            if (a != max) {
                sumMin += a;
            }
            if (a != min) {
                sumMax += a;
            }

        }

        if(min==max){
            for (int i = 0; i < arr.length-1; i++) {
                sumMax += arr[i];
                sumMin += arr[i];
            }
        }

        System.out.println(sumMin + " " + sumMax);

        System.out.println("---------------");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
