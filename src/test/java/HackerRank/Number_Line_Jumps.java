package HackerRank;

public class Number_Line_Jumps {

    public static void main(String[] args) {

//
//        int x= 5;
//        int y = x++/6%++x - x--;
//        System.out.println(y);
//        System.out.println(x);
//
//        System.out.println(6%7);
//        System.out.println(7%6);
//        System.out.println(6%6);
//        System.out.println(5/6);

//        0 3   4 2
        int kangaroos1 = 0;
        int kangaroosJump1 = 3;

        int kangaroos2 = 4;
        int kangaroosJump2 = 2;

        int position1 = 0;
        int position2 = 0;

        boolean sameLocationSameTime = false;
        for (int i = 0; i <= 10000; i++) {
            position1 +=  kangaroosJump1;
            position2 +=  kangaroosJump2;
            if ( position1+kangaroos1 == position2+kangaroos2) {
                sameLocationSameTime = true;
                break;
            }
        }

        if (sameLocationSameTime){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
