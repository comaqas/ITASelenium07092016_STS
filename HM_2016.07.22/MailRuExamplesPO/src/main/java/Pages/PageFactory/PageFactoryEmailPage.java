package Pages.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by user on 24.07.2016.
 */
public class PageFactoryEmailPage {

    @FindBy(css = ".b-nav__item__text")
    private WebElement navBar;

    @FindBy(css = "div.b-datalist__item__panel")
    private List<WebElement> emailList;

    @FindBy(css = "div[data-name='next']")
    private WebElement nextButton;

    @FindBy(css = "i.ico_toolbar_arrow_right")
    private WebElement rightButton;


    public boolean isAuthorizationSuccessful() {

        if (navBar.isDisplayed()) {
            return true;
        }
        return false;
    }

    public void CountOfEmails() {
        int letters = 0;
        while (true) {

            letters = letters + emailList.size();


            if (!nextButton.getAttribute("class").contains("b-toolbar__btn_disabled")) {
                rightButton.click();
            } else
                break;
        }
        System.out.println(letters);
    }
}
