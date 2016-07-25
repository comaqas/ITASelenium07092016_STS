package Pages.Flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 24.07.2016.
 */
public class FlowEmailPage {
    private final By NAVBAR = By.cssSelector(".b-nav__item__text");
    private final By EMAILLIST = By.cssSelector("div.b-datalist__item__panel");
    private final By NEXTBUTTON = By.cssSelector("div[data-name='next']");
    private final By RIGHTBUTTON = By.cssSelector("i.ico_toolbar_arrow_right");

    private WebDriver driver;

    public FlowEmailPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean isAuthorizationSuccessful (){
        WebElement userEmail = driver.findElement(NAVBAR);
        if(userEmail.isDisplayed()){
            return true;
        }
        return false;
    }

    public FlowEmailPage CountOfEmails (){
        int letters=0;
        while (true){
            letters = letters+driver.findElements(EMAILLIST).size();
            // System.out.println("letters " + letters);

            if (!driver.findElement(NEXTBUTTON).getAttribute("class").contains("b-toolbar__btn_disabled")) {
                driver.findElement(RIGHTBUTTON).click();
            } else
                break;
        }
        System.out.println(letters);
        return this;
    }
}
