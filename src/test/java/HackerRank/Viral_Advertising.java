package HackerRank;

public class Viral_Advertising {

    public static void main(String[] args) {


//        Day Shared Liked Cumulative
//        1      5     2       2
//        2      6     3       5
//        3      9     4       9
//        4     12     6      15
//        5     18     9      24

        int n = 5;
        int people = 5;
        int Cumulative = 2;
        int Shared = people;

        for (int i = 2; i <= n; i++) {
            Shared = Shared / 2 * 3;
            Cumulative += Shared / 2;
            System.out.println(Shared);
        System.out.println(Cumulative);
        }


    }
}
