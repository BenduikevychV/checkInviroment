import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=wtZ8006OaYg&t=1141s");

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for (int i = 0; i < links.size(); i++) {
            String link = links.get(i).getAttribute("href");

            if (link != null) {
                try {

                    URL url = new URL(link);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    int code = connection.getResponseCode();

                    if (code == 200) {
                        System.out.println(url + " url is valid");
                    } else {
                        System.out.println(url + " -> Broken");
                    }
                } catch (Exception e) {
                    e.getStackTrace();
                }
            } else {
                System.out.println(link + " is Broken");
            }

        }


    }

}
