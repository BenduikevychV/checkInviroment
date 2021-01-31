package HackerRank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Migratory_Birds {

    public static void main(String[] args) {

//        11
//        1 2 3 4 5 4 3 2 1 3 4
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);

        Map<Integer, Integer> birds = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int quantity = 1;
            if (birds.containsKey(arr.get(i))) {
                quantity = birds.get(arr.get(i));
                birds.put(arr.get(i), ++quantity);
            } else {
                birds.put(arr.get(i), quantity);
            }

        }

        int bird_id = 1;
        int max = 0;

        for (Map.Entry<Integer, Integer> m : birds.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                bird_id = m.getKey();
            } else if (m.getValue() == max && bird_id < m.getKey()) {
                max = m.getValue();

            }
        }

        System.out.println(birds);
        System.out.println(max);
        System.out.println(bird_id);


    }


}
