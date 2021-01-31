package HackerRank;

public class Strange_Counter {

    public static void main(String[] args) throws InterruptedException {

        long t = 1000;

        long rem = 3;

        while (t > rem) {
            t = t - rem;
            rem *= 2;
        }
        System.out.println(rem - t + 1);
    }
}
