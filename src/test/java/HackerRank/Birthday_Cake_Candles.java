package HackerRank;

import java.util.Arrays;
import java.util.List;

public class Birthday_Cake_Candles {

    public static void main(String[] args) {

        List<Integer> candles= Arrays.asList(3, 2, 1, 3);

        int max=0;
        int count = 0;
        for(int a : candles){
            if(a>max){
                max=a;
            }
        }
        for(int a : candles){
            if(a==max){
                count++;
            }
        }

        System.out.println(count);
    }
}
