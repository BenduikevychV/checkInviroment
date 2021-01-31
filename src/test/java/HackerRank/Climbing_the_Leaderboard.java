package HackerRank;

import org.apache.poi.ss.usermodel.IgnoredErrorType;

import java.util.*;

public class Climbing_the_Leaderboard {

    public static void main(String[] args) {

        List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);
        List<Integer> player = Arrays.asList(50, 65, 77, 90, 102);

        Set<Integer> newRanked = new HashSet<>(ranked);

        List<Integer> sortedList = new ArrayList<Integer>(newRanked);

        Collections.sort(sortedList,Collections.reverseOrder());

        System.out.println(sortedList +" sortedList");
        System.out.println(player+ " player list");

        List<Integer> rank = new ArrayList<>();
        int ind;
        for (int i = 0; i < player.size(); i++) {
            ind = Collections.binarySearch(sortedList, player.get(i),Collections.reverseOrder());
            System.out.println(ind);
            if(ind < 0){
                ind = Math.abs(ind);
            }else{
                ind++;
            }
            rank.add(ind);
        }

        System.out.println(rank);

//        List al = new ArrayList();
//        al.add(100);
//        al.add(50);
//        al.add(30);
//        al.add(10);
//        al.add(2);
//
//        // The last parameter specifies the comparator method
//        // used for sorting.
//        int index = Collections.binarySearch(al, 50,
//                Collections.reverseOrder());
//
//        System.out.println("Found at index " + index);
    }
}
