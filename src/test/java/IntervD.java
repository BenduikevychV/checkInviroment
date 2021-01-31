import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IntervD {

    public static void main(String[] args) {

//        WebDriver driver = new ChromeDriver();
//        driver.get("");
//
//        WebElement el = driver.findElement(By.xpath(""));
//        el.click();
//        Select select = new Select(el);
//        select.deselectByVisibleText("");
//        el.sendKeys("");
//
        int numb = 10251;
        String str = "" + numb;
        String str1 ="";
        for (int i = str.length()-1; i>=0;i--){
            str1 += "" +str.charAt(i);
        }
        int newNumb = Integer.parseInt(str1);

        System.out.println(newNumb);

        String new1 = "";
        while (numb>0){
            new1 += numb%10;
            numb/=10;
        }
        int newMumb1 = Integer.parseInt(new1);
        System.out.println(newMumb1);
    }
}
