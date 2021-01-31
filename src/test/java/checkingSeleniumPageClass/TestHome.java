package checkingSeleniumPageClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHome {

    NavidetePage navidetePage = new NavidetePage();
    PageHome pageHome = new PageHome(navidetePage.setUpDriver());
    @Test
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        navidetePage.navigatePage("https://mail.google.com/");

        pageHome.emailBox.sendKeys("bendiukevych07@gmail.com");
        pageHome.nextButton.click();
    }
}
