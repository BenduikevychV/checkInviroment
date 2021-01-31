package HackerRank;

public class Utopian_Tree {

    public static void main(String[] args) {

//        0          1
//        1          2
//        2          3
//        3          6
//        4          7
//        5          14

        int n = 5;

        int height = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2==0){
                height += 1;
            }else {

            height *= 2;
            }
            System.out.println(height);
        }
    }
}
