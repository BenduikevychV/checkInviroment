package LambdaPractice;

public class LambdaExamp {

    public static void main(String[] args) {


        MyFunction myFunction = (text,text1) -> {

                System.out.println(text+ " + "+ text1);
                return  text + " + " + text1;
        };

        String returnValue = myFunction.apply("Hello Function Body","Test");

        System.out.println(returnValue);


        MyFunction myFunction1 = myFunction;

        String returnValue2 = myFunction1.apply("Text 1", "Text 2");
        System.out.println(returnValue2);

    }
}
