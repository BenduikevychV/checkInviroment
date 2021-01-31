import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;
import java.util.concurrent.TimeUnit;

public class TestNGPractice {

    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=MfFR-vo1iXc");


        WebElement settings = driver.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button']"));

        Actions actions = new Actions(driver);
        actions.click(settings).perform();
        Thread.sleep(2000);
        WebElement playBackSpeeds = driver.findElement(By.xpath("//div[@class='ytp-menuitem-label']"));
        Thread.sleep(2000);
        playBackSpeeds.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).release().perform();
        Thread.sleep(2000);


    }
}
