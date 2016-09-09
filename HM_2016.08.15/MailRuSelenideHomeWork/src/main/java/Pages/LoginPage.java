package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 25.08.2016.
 */
public class LoginPage {
    private static By LOGIN = By.id("mailbox__login");
    private static By PASSWORD = By.id("mailbox__password");
    private static By AUTBUTTON = By.id("mailbox__auth__button");

    public static void Autorization (){
        $(LOGIN).sendKeys("strong.zubovich@bk.ru");
        $(PASSWORD).setValue("ZXCvbn123!");
        $(AUTBUTTON).click();
    }
}
