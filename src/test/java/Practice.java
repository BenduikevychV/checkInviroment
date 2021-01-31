import org.junit.Assert;

public class Practice {

    public static void main(String[] args) {

        String str = "Civic";

        str = str.toLowerCase();

        String reverse = "";

        for (int i=str.length()-1; i>=0; i--){
            reverse += str.toLowerCase().charAt(i);
        }

        System.out.println(reverse+" -> reverse word");
        System.out.println(str + " -> extual word");
        Assert.assertEquals(reverse,str);
    }
}
