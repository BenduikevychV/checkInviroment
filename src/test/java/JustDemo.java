import java.util.Arrays;

public class JustDemo {

    public static void main(String[] args) {

        int [] a = {-1,3,8,2,9,3};
        int [] b = {4,1,2,10,5,20};
        int target = 24;

        Employe [] employes = new Employe[4];
        employes[0] = new Employe(5,"John");
        System.out.println(Arrays.toString(employes));
        int ab = 0;
        int ba = 0;
        int closes = 24;
        for (int i = 0; i<a.length;i++){
            for (int k = 0 ; k<b.length;k++){
                if (target- (a[i]+b[k]) <=closes){
                    closes= (a[i]+b[k]);
                    ab = a[i];
                    ba =b[k];
//                    System.out.println(a[i]+" first number rom first array and second "+b[k]);
                }
            }
        }

        System.out.println(closes + " and first array "+ab + " second is "+ ba);
    }
}
