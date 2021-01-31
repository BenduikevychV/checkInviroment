package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class Sales_by_Match {

    public static void main(String[] args) {

        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        int n = 9;

        Map<Integer, Integer> pairForSale = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int quantity = 1;
            if (pairForSale.containsKey(ar[i])) {
                quantity = pairForSale.get(ar[i]);
                pairForSale.put(ar[i], ++quantity);
            } else {
                pairForSale.put(ar[i], quantity);
            }

        }

        System.out.println(pairForSale);
        int count = 0;
        for (Integer key : pairForSale.keySet()) {
            if (pairForSale.get(key) % 2 == 0) {
                count += pairForSale.get(key) / 2;
            } else {
                if (pairForSale.get(key) - 1 > 0) {
                    count += (pairForSale.get(key) - 1) / 2;
                }
            }
        }

        System.out.println(count);


    }
}
