package HackerRank;

public class Counting_Valleys {

    public static void main(String[] args) {

        int steps = 8;
        String path = "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD";
        int valley = 0;

        int upQuantity = 0;
        int downQuantity = 0;
        boolean isValley = false;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                ++upQuantity;
            } else if (path.charAt(i) == 'D') {
                ++downQuantity;
            }

            if (downQuantity > upQuantity) {
                isValley = true;
            }
            if (downQuantity == upQuantity && isValley) {
                isValley = false;
                ++valley;
            }

        }

        System.out.println(valley);

    }
}
