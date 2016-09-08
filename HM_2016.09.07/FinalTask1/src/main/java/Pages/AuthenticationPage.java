package Pages;

import Helpers.Locators;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 29.08.2016.
 */
public class AuthenticationPage {


    private static final By EMAILADRESS = Locators.get("RegistrationPage.CreateEmailAdress");
    private static final By CREATEACCOUNT = Locators.get("RegistrationPage.CreateAccount");
    private static final By EMAIL = Locators.get("RegistrationPage.EmailAdress");
    private static final By PASSWORD = Locators.get("RegistrationPage.Password");
    private static final By SIGNIN = Locators.get("RegistrationPage.SignIn");

    private static String eMail = "test" + RandomStringUtils.randomNumeric(3) + "@tut.com";
    private static String password = "qwerty";



    public static void createEmail()  {

        $(EMAILADRESS).sendKeys(eMail);
        // Thread.sleep(5000);
        $(CREATEACCOUNT).click();

    }

    public static void authentication(){
        $(EMAIL).sendKeys("test3@tut.com");
        $(PASSWORD).sendKeys(password);
        $(SIGNIN).click();

    }

    public static void wrongAuthentication(){
        $(EMAIL).sendKeys("ererer@rtr.com");
        $(PASSWORD).sendKeys(password);
        $(SIGNIN).click();
    }

    public static void clickOnCreateAccountButton(){
        $(CREATEACCOUNT).click();
    }



}
