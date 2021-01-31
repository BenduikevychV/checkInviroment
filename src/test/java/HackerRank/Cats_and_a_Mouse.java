package HackerRank;

public class Cats_and_a_Mouse {

    public static void main(String[] args) {

//        1 2 3
//        1 3 2

        int x = 1;
        int y = 3;
        int z = 2;

        if (Math.abs(z-x)> Math.abs(z-y)){
            System.out.println(y);
        } else if (Math.abs(z-x)< Math.abs(z-y)){
            System.out.println(x);
        }else {
            System.out.println(z);
        }

    }
}
