package HackerRank;

public class Drawing_Book {

    public static void main(String[] args) {

//        5
//        4
        int n = 6;
        int p = 4;
        int min = 0;

        int firstPage = 0;
        int lastPage =0;
        if (n%2==0){
            for (int i=1; i<p;i+=2){
                ++firstPage;
            }
            for (int i=n;i>p;i-=2){
                ++lastPage;
            }
            if (firstPage<lastPage){
                min = firstPage;
            }else if (firstPage>lastPage){
                min = lastPage;
            }else {
                min = firstPage;
            }
        }
        if (n%2==1){
            for (int i=1; i<p;i+=2){
                ++firstPage;
            }
            for (int i=n-1;i>p;i-=2){
                ++lastPage;
            }
            if (firstPage<lastPage){
                min = firstPage;
            }else if (firstPage>lastPage){
                min = lastPage;
            }else {
                min = firstPage;
            }
        }

        System.out.println(min);

    }
}
