package HackerRank;

public class Beautiful_Days_at_the_Movies {

    public static void main(String[] args) {

//        20 23 6
        int i = 20;
        int j = 23;
        int k = 6;

        int count = 0;
        for (int x = i; x <= j; x++) {
            String reverse = "";
            for (int y = x; y > 0; y /= 10) {
                reverse += y % 10;
            }
            int rev = Integer.parseInt(reverse);
            if ((x - rev)%k == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
