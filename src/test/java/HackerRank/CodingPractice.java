package HackerRank;

public class CodingPractice {

    public static void main(String[] args) {

//        String str = "xyyzyzyx";
//        char [] arr = {'x','y','z'};

//        for(int i=0;i>str.length()-2; i++){
//            for (int k=0; k< arr.length;k++){
//                if (str.charAt(i)==arr[k] && str.charAt(i)!=arr[k+] )
//            }
//        }

        String str = "Write a code to find the number of time a word appears in a String";

        String[] arr = str.split(" ");
        String word = "a";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
