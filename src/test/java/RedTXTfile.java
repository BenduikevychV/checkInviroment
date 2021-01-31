import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RedTXTfile {

    public static void main(String[] args) {

            List<String> text = new ArrayList();
        try {

            FileReader file = new FileReader("src/test/resources/text.txt");
            BufferedReader bufferedReader = new BufferedReader(file);

            String line = "";

            int i =0;
            while ((line = bufferedReader.readLine())!=null){
                line = bufferedReader.readLine();
                text.add(line);
//                System.out.println(line);
                System.out.println(text.get(i));
                i++;
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

//        System.out.println(text);

        System.out.println("<================>");
        for (String str : text){
            System.out.println(str);
        }

    }
}
