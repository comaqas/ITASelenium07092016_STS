package Pages.Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 24.07.2016.
 */
public class DynamicLoginPage {
    private final By LOGIN = By.id("mailbox__login");
    private final By PASSWORD = By.id("mailbox__password");
    private final By AUTBUTTON = By.id("mailbox__auth__button");

    private WebDriver driver;

    public DynamicLoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void Autorization (){
        WebElement login = driver.findElement(LOGIN);
        login.click();
        login.sendKeys("strong.zubovich@bk.ru");

        WebElement password = driver.findElement(PASSWORD);
        password.click();
        password.sendKeys("ZXCvbn123!");
        driver.findElement(AUTBUTTON).click();

    }
}
