package HackerRank;

public class Breaking_the_Records {

    public static void main(String[] args) {

//        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int max = scores[0];
        int min = scores[0];

        int countMax = 0;
        int countMin = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                countMax++;
            } else if (scores[i] < min) {
                min = scores[i];
                countMin++;

            }
        }

        System.out.println(countMax +" " + countMin);


    }
}
