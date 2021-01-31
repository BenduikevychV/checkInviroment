package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListPractice {

    public static void main(String[] args) {

        List<List<Integer>> numbers = new ArrayList<>();
        List numbA = new ArrayList();
        List numbB = new ArrayList();
        List numbC = new ArrayList();
        List numbD = new ArrayList();

        numbA.add(3);
        numbB.add(11);
        numbB.add(2);
        numbB.add(4);
        numbC.add(4);
        numbC.add(5);
        numbC.add(6);
        numbD.add(10);
        numbD.add(8);
        numbD.add(-12);

        numbers.add(numbA);
        numbers.add(numbB);
        numbers.add(numbC);
        numbers.add(numbD);

        System.out.println(numbers);
        int leftToRight = 0;
        int rightToLeft = 0;


        List<List<Integer>> intN = new ArrayList();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).size() > 1) {
                intN.add(numbers.get(i));
            }
        }
        System.out.println(intN);
        int t = intN.size() - 1;
        for (int i = 0; i < intN.size(); i++) {

            leftToRight += intN.get(i).get(i);
        }
        for (int i = 0; i < intN.size(); i++) {
            rightToLeft += intN.get(t).get(i);
            t--;

        }
        int c1 = Math.abs(rightToLeft - leftToRight);

        System.out.println(c1);

        int arr [] = {-4, 3, -9, 0, 4, 1};

        double a=0;
        double b=0;
        double c=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
                a++;
            } else if(arr[i]<0){
                b++;
            } else {
                c++;
            }
        }
        a= a/arr.length;
        System.out.println("--------");
        System.out.println(a);
        System.out.println(arr.length);
        System.out.println(a/arr.length);
        System.out.println(b/arr.length);
        System.out.println(c/arr.length);

    }


}

