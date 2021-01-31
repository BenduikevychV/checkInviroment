package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading_Students {

    public static void main(String[] args) {


        List<Integer> grade = Arrays.asList(4, 73, 67, 38, 33);

        List<Integer> newNumb = new ArrayList<>();
        for (int i = 0; i < grade.size(); i++) {
            if (grade.get(i) % 10 != 5 && grade.get(i) % 10 != 0 && grade.get(i) > 37) {

                for (int y = 1; y < 3; y++) {

                    if ((grade.get(i) + y) % 10 == 5 || (grade.get(i) + y) % 10 == 0) {
                        int graded = grade.get(i) + y;
                        grade.set(i, graded);
                    }
                }

            }

            newNumb.add(grade.get(i));
        }


        System.out.println(newNumb);
    }
}
