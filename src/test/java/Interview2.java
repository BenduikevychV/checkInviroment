import java.util.ArrayList;
import java.util.List;

public class Interview2 {

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
//        for (int i=0; i<=10;i++) {
//            integerList.add(i);
//        }
//        for (Integer a : integerList){
//            System.out.println(a);
//        }

        integerList.forEach(integer -> {System.out.println(integer);});


        String s = "It will give you expected sum of this squance";
        String ar [] = s.split("");
        System.out.println(ar.length);
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
