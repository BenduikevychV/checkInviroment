package HackerRank;

import java.util.Arrays;
import java.util.List;

public class Bill_Division {
    public static void main(String[] args) {

//        4 1
//        3 10 2 9
//        12

        List<Integer> bill = Arrays.asList(3, 10, 2, 9);
        int k = 1;
        int b = 12;

        int billAnn = 0;
        for (int i=0;i<bill.size();i++){
            if (i==k){
                continue;
            }
            billAnn+= bill.get(i);
        }
        billAnn = b -billAnn/2;
        if (billAnn > 0) {
        System.out.println(billAnn);
        }else {
            System.out.println("Bon Appetit");
        }

    }
}
