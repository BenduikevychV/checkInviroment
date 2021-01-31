package HackerRank;

public class Electronics_Shop {

    public static void main(String[] args) {

        int b = 60;
        int keyboards[] = {40, 50, 60};
        int drives[] = {5, 8, 12};

        int max = 0;
        boolean isLessThanBudget = true;

        for (int i = 0; i < keyboards.length; i++) {
            for (int k = 0; k < drives.length; k++) {
                int fullPrice = keyboards[i] + drives[k];
                if (fullPrice <= b && fullPrice > max) {
                    max = fullPrice;
                    isLessThanBudget = false;
                } else if (fullPrice > b && isLessThanBudget) {
                    max = -1;
                }
            }
        }


        System.out.println(max);
    }
}
