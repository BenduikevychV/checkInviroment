package HackerRank;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Save_the_Prisoner {

    public static void main(String[] args) throws IOException {

//        SoftAssert softAssert = new SoftAssert();
//
//        String expectedResult = "ExpectedResult";
//        String numbersFor = "Numbers";
//        List<List<Integer>> listPutValue = ReadFileTXT.getList(numbersFor);
//        List<List<Integer>> listResult = ReadFileTXT.getList(expectedResult);
//
//        for (int i = 0; i < listPutValue.size(); i++) {
//
//            int n = listPutValue.get(i).get(0);
//            int m = listPutValue.get(i).get(1);
//            int s = listPutValue.get(i).get(2);
//            int actualBadCandy = 0;
//            int left = m % n;
//            if (left > 1) {
//                actualBadCandy = (left + s) - 1;
//            }else if (left == 1){
//                actualBadCandy = s;
//            }else if(left == 0){
//                actualBadCandy = n;
//            }
//
//            if (actualBadCandy > n) {
//                actualBadCandy = Math.abs(n - actualBadCandy);
//            }
//            int expectedBadCandy = listResult.get(i).get(0);
//            Assert.assertEquals(actualBadCandy, expectedBadCandy);
//
//            System.out.println(actualBadCandy);
//            System.out.println(expectedBadCandy);
//
//        softAssert.assertAll();
//        }

        int n = 7;
        int m = 19;
        int s = 2;

        int poisonedPrisoner = (s + m - 1) % n;
        if(poisonedPrisoner == 0){
            poisonedPrisoner=n;}

        System.out.println(poisonedPrisoner);

    }
}
