package Pages.Static;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by user on 24.07.2016.
 */
public class LoginPage {

    private static By LOGIN = By.id("mailbox__login");
    private static By PASSWORD = By.id("mailbox__password");
    private static By AUTBUTTON = By.id("mailbox__auth__button");

    public static void Autorization (WebDriver driver){
        WebElement login = driver.findElement(LOGIN);
        login.click();
        login.sendKeys("strong.zubovich@bk.ru");

        WebElement password = driver.findElement(PASSWORD);
        password.click();
        password.sendKeys("ZXCvbn123!");
        driver.findElement(AUTBUTTON).click();

        }






}
