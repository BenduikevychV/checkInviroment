package HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountBetweenTwoChar {

    public static void main(String[] args) {
        String str = "my name is granjjjjjjjjjjjjjjarggggggggddddydjkkkkkkdjdjdjdjkkkaiiihhhooooooooooooohhhakklklkakkkka";
        String str1 = "a";
//        str = str.replaceAll(" ", "");

        List<Integer> list = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(0)) {

                list.add(i);

            }
        }

        System.out.println(list);
        int max=-1;
        for(int i=0;i<list.size()-1;i++){
           if((list.get(i+1)-list.get(i))>max){
               max = list.get(i+1)-list.get(i);
           }
        }

        System.out.println(str);
        System.out.println(max);
    }


}
