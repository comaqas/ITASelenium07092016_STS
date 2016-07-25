package Pages.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 24.07.2016.
 */
public class PageFactoryLoginPage {

    @FindBy(id = "mailbox__login")
    private WebElement login;

    @FindBy(id = "mailbox__password")
    private WebElement password;

    @FindBy (id = "mailbox__auth__button")
    private WebElement autButton;

    public void Autorization (){
        login.click();
        login.sendKeys("strong.zubovich@bk.ru");


        password.click();
        password.sendKeys("ZXCvbn123!");
        autButton.click();

    }
}
