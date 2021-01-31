package HackerRank;

import org.testng.Assert;

import java.util.Arrays;

public class SwappingPracticeImprove {

    public static void main(String[] args) {
        String actualOne = "1Hello2 -3World4,5 yes6";
        String expectedOne = "2hELLO1 -4wORLD3,5 YES6";

        String actualTwo = "Hello 1lol52";
        String expectedTwo = "hELLO 5LOL12";

        String actualThree = "2S 5 du41Rg57E";

        String expectedThree = "2s 5 DU51rG47e";

        SwappingPracticeImprove sw = new SwappingPracticeImprove();

        Assert.assertEquals(sw.swapNumbers(actualOne), expectedOne);
        Assert.assertEquals(sw.swapNumbers(actualTwo), expectedTwo);
        Assert.assertEquals(sw.swapNumbers(actualThree), expectedThree);

        int a = 8;
        double b = 9;
        a=(int)b;
        System.out.println("Well done!!!");
    }

    public String swapNumbers(String str) {

        String arr[] = str.split(" ");
        String newValue = "";

        for (int i = 0; i < arr.length; i++) {
            String result = arr[i];
            char arChar[] = result.toCharArray();
            int first = -1;
            int second = -1;

            for (int y = 0; y < arChar.length; y++) {
                String letter = arChar[y] + "";
                if (arChar[y] >= 48 && arChar[y] <= 57) {
                    if (first == -1) {
                        first = y;
                    } else if (second == -1 && arChar[y - 1] >= 65 && (arChar[y - 1] <= 90
                            || arChar[y - 1] >= 97 && arChar[y - 1] <= 122)) {
                        second = y;
                    }


                } else if (arChar[y] >= 65 && arChar[y] <= 90) {
                    arChar[y] = letter.toLowerCase().charAt(0);
                } else if (arChar[y] >= 97 && arChar[y] <= 122) {
                    arChar[y] = letter.toUpperCase().charAt(0);
                }
            }
            if (second > -1) {
                char temp = arChar[first];
                arChar[first] = arChar[second];
                arChar[second] = temp;
            }
            newValue += String.valueOf(arChar) + " ";
        }

        newValue = newValue.trim();

        return newValue;
    }

}
