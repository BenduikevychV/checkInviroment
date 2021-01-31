import java.util.Arrays;

public class DemoFirst {

    public static void main(String[] args) {

        int[] arr = {23, 66, 3, 0, 5, 8};

//        int max = 0;
//        for (int i =0; i<arr.length;i++){
//            if (arr[1]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);

        for (int i = 0; i < arr.length; i++) {

            for (int y = i; y < arr.length; y++) {

                if (arr[y] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[y];
                    arr[y] = temp;
                }
            }
                    System.out.println(Arrays.toString(arr));

        }
        System.out.println(arr[arr.length - 2]);
    }
}


