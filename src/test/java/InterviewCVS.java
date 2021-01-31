import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class InterviewCVS {

    public static void main(String[] args) {

        List<Integer> numb = new ArrayList<>();
//numb.add(-8);
        numb.add(null);
//        System.out.println(getSmollestNumb(numb));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.close();
        String title = driver.getTitle();

        System.out.println(title);
    }

    public static int getSmollestNumb(List<Integer> list){


//        if (list.isEmpty()){
//          throw new IllegalArgumentException("your List is empty!!!");
//        } else if (list.contains(null)){
//            throw new IllegalArgumentException("your list have null value!!!");
//        }

        int min = 0;
        for (int i=0; i<list.size(); i++){

            if (list.get(i)< min){
                min = list.get(i);
            }
        }
        return min;
    }
}
