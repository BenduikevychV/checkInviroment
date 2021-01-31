package HackerRank;

public class AfterEach_F_Inseart_K {

    public static void main(String[] args) {

        String str = "aiiiiofpppppFffftttf";
        String result = "";
        for (int i=0; i<str.length(); i++){
            String str1 = str.charAt(i)+"";
            if (str1.equalsIgnoreCase("F")){

                result+= "K"+str1;
            }else {
                result+= str1;
            }
        }

        System.out.println(result);
    }
}
