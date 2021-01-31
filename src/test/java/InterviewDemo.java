import streamsDemo1.ChekingTTT;

public class InterviewDemo extends ChekingTTT {

    public void printName(){

        String fullName = getNameOf(" Bendiukevych"+" ooo");
        System.out.println(fullName);
    }

    public static void main(String[] args) {

        InterviewDemo i = new InterviewDemo();
        i.printName();

    }
}
