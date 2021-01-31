package checkingSeleniumPageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class NavidetePage {

  private static WebDriver driver;

    public void navigatePage(String str) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to(str);
    }

    public WebDriver setUpDriver(){
        return driver;
    }
}
