package HackerRank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileTXT {

    static public List<List<Integer>> getList(String name) throws IOException {

        BufferedReader bufferedReader = null;
        List<List<Integer>> value = new ArrayList<>();
        try {
            FileReader file = new FileReader("src/test/java/HackerRank/valueOf" + name + ".txt");
            bufferedReader = new BufferedReader(file);

            String line = "";
            while (bufferedReader.readLine() != null) {
                line = bufferedReader.readLine();
                String[] arrLine = line.split(" ");

                List<Integer> intList = new ArrayList<>();

                for (int i = 0; i < arrLine.length; i++) {
                  intList.add(Integer.parseInt(arrLine[i].trim()));
                }
                value.add(intList);
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            bufferedReader.close();
        }
        return value;
    }


}
