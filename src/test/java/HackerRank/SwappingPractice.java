package HackerRank;


import org.testng.Assert;

public class SwappingPractice {

    public static void main(String[] args) {
        String actualOne = "1Hello2 -3World4,5 yes6";
        String expectedOne = "2hELLO1 -4wORLD3,5 YES6";

        String actualTwo = "Hello 1lol52";
        String expectedTwo = "hELLO 5LOL12";

        String actualThree = "2S 5 du41Rg57E";
        String expectedThree = "2s 5 DU51rG47e";

        SwappingPractice sw = new SwappingPractice();

        Assert.assertEquals(sw.swapNumbers(actualOne), expectedOne);
        Assert.assertEquals(sw.swapNumbers(actualTwo), expectedTwo);
        Assert.assertEquals(sw.swapNumbers(actualThree), expectedThree);


    }

    public String swapNumbers(String str) {

        String arr[] = str.split(" ");

        String newResult = "";

        for (int i = 0; i < arr.length; i++) {
            String element = arr[i];
            String result = "";
            String firstNum = "";
            String secondNum = "";
            int indexOfFirst = -1;
            int indexOfSecond = -1;

            for (int k = 0; k < element.length(); k++) {

                if (element.charAt(k) >= 48 && element.charAt(k) <= 57) {
                    if (firstNum.equals("")) {

                        firstNum = element.charAt(k) + "";
                        indexOfFirst = element.indexOf(firstNum);

                        result += firstNum;
                    } else if (secondNum.equals("") &&
                            ((element.charAt(k - 1) >= 65 && element.charAt(k - 1) <= 90) ||
                                    (element.charAt(k - 1) >= 97 && element.charAt(k - 1) <= 122))) {
                        secondNum = element.charAt(k) + "";
                        indexOfSecond = element.indexOf(secondNum);

                        result += secondNum;
                    } else {
                        result += element.charAt(k);
                    }

                } else if (element.charAt(k) >= 65 && element.charAt(k) <= 90) {
                    result += (element.charAt(k) + "").toLowerCase();
                } else if (element.charAt(k) >= 97 && element.charAt(k) <= 122) {
                    result += (element.charAt(k) + "").toUpperCase();
                } else {
                    result += element.charAt(k);
                }

            }

            if (indexOfSecond > -1) {

                char[] arrRes = result.toCharArray();
                char temp = arrRes[indexOfFirst];

                        arrRes[indexOfFirst] = arrRes[indexOfSecond];
                        arrRes[indexOfSecond] = temp;
                result =  String.valueOf(arrRes);
            }

            arr[i] = result;
            newResult += arr[i] + " ";
        }

        return newResult.trim();
    }
}
