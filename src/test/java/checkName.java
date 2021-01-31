import org.junit.Assert;
import org.junit.Test;

public class checkName {

    public String convertName(String name) {
        String str = "";
        String [] str1= name.split(" ");
        for(int i=0; i<str1.length; i++){
            str+= str1[i].substring(0,1)+".";

        }
        return   str;
    }


    @Test
    public void testName(){
//        “Bruno Mars” →  “B.M.”
//            “Dave M Jones” → “D.M.J.”
//            “MichaelSmith” → “M.”

        System.out.println(convertName("Bruno Mars"));
        System.out.println(convertName("Dave M Jones"));
        System.out.println(convertName("MichaelSmith"));
        Assert.assertEquals("B.M.",convertName("Bruno Mars"));
        Assert.assertFalse("B.M.".equals(convertName("Bruno Mars")));
    }
}
