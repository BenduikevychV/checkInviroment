import org.testng.Assert;

public class Appel {

   /*

    select max(salery) as maxSalery
    from employee
    where maxSalery < (select max(salery) from employee);

    */
   public static void main(String[] args) {

       String str = "How are you ";
       String expected = "woh era uoy ";

       String arr [] =str.split(" ");
       String newValue ="";

       for (int i = 0; i<arr.length;i++){
           String str1 = arr[i];

           for (int y=str1.length()-1; y>=0; y--){
               newValue += str1.charAt(y);
           }
           newValue+=" ";
       }

       System.out.println(newValue);

       Assert.assertEquals(newValue.trim().toLowerCase(),expected.trim().toLowerCase());
   }
}
