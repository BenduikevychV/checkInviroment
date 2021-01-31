package checkingSeleniumPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHome {


    public PageHome(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
    public WebElement nextButton;
}
