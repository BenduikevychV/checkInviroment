import java.util.HashMap;
import java.util.Map;

public class DomeVersoin {

    public static void main(String[] args) {

        /*
        String str = "Apple";
        1. Declaring the the local variable
        2. Declaring the emptyMap
        3. Create forLoop
        4. Create the condition
        5. Print result
         */

        String str = "Apple";

        Map<String,Integer> countLetters = new HashMap<>();

        if (str.equals(null)){
            throw new IllegalArgumentException("");
        }

        for (int i = 0; i<str.length(); i++){
           String letter = str.charAt(i)+"";
           int numb = 1;
            if (countLetters.containsKey(letter)){
                numb = countLetters.get(letter);
                countLetters.put(letter,++numb);
            } else {
                countLetters.put(letter,numb);
            }
        }

        System.out.println(countLetters);


    }
}
