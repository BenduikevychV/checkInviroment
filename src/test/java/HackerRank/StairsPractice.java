package HackerRank;

public class StairsPractice {

    public static void main(String[] args) {

        int n = 6;

        String a = "";
        String s = "";
        for (int i = 0; i < n; i++) {
            s += " ";
        }
//        char [] b = s.toCharArray();
        for(int i = n-1; i >= 0; i--){
//            b[i] = '#';
            a+= "#";
            s = s.substring(0,i)+a;
            System.out.println(s);
        }
    }
}
