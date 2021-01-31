package HackerRank;

public class Angry_Professor {

    public static void main(String[] args) {

        int k = 4;
        int a[] = {-93, -86, 49, -62, -90, -63, 40, 72, 11, 67};

        int count =0;
        for (int i = 0; i<a.length; i++){
            if (a[i] <= 0){
                count++;
            }
        }
        String decision = "";
        if (count>=k){
            System.out.println("NO");
            decision = "NO";
        }else {
            System.out.println("YES");
            decision = "YES";
        }

        System.out.println(decision);
    }
}
