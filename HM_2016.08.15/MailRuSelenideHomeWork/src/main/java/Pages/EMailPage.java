package Pages;

import Helpers.RandomClass;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selenide.$;
import java.util.Set;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by stelmak on 8/26/2016.
 */
public class EMailPage {
    private static final By NAVBAR = By.cssSelector(".b-nav__item__text");
    private static final By EMAILLIST = By.cssSelector("div.b-datalist__item__panel");
    private static final By NEXTBUTTON = By.cssSelector("div[data-name='next']");
    private static final By RIGHTBUTTON = By.cssSelector("i.ico_toolbar_arrow_right");
    private static final By PROFILE = By.cssSelector("#PH_user-email");
    private static final By UPLOAD = By.cssSelector(".js-upload.form__button_upload");
    private static final By SAVEBUTTON = By.cssSelector("div[data-fire='save']");
    private static final By SUBMIT = By.cssSelector(".form__actions__inner>button");
    //private static final By NEWEMAIL =By.cssSelector(".ico.ico_toolbar.ico_toolbar_compose");
    //private static final By NEWEMAIL =By.cssSelector("a[data-shortcut='n']");
   // private static final By NEWEMAIL =By.cssSelector("a.b-toolbar__btn js-shortcut");
    private static final By NEWEMAIL =By.cssSelector("[data-name='compose']");
    //private static final By TO = By.cssSelector(".js-input.compose__labels__input");
    private static final By TO = By.cssSelector("textarea[class='js-input compose__labels__input'][tabindex='4']");
    //private static final By SUBJECT = By.id("#compose_936_ab_compose_subj");
    private static final By SUBJECT = By.cssSelector("input[name='Subject']");
    //private static final By MAILBODY = By.id("#tinymce");
    private static final By MAILBODY = By.cssSelector("body[class='mceContentBody increase-font']");



//
//  }
    public static void countOfEmails(WebDriver driver){
        int letters=0;
        while (true){
            letters = letters+$$(EMAILLIST).size();
            // System.out.println("letters " + letters);

            if (!$(NEXTBUTTON).getAttribute("class").contains("b-toolbar__btn_disabled")) {
                $(RIGHTBUTTON).click();
            } else
                break;
        }
        System.out.println("Count of emails " + letters);
    }

    public static void addPhotoToPrifile(WebDriver driver){
       // $(PROFILE).click();

        open("https://e.mail.ru/settings/userinfo");
      //  String initialWindowHandle = driver.getWindowHandle();
        $(UPLOAD).sendKeys("I:\\MailRuSelenideHomeWork\\desert.jpg");
       // driver.switchTo().activeElement();
//        Set<String> windowHandles = driver.getWindowHandles();
//        String secondWindowHandle;
////
//        for (String windowHandle : windowHandles) {
//            if (!windowHandle.equals(initialWindowHandle)){
//                driver.switchTo().window(windowHandle);
//                secondWindowHandle = windowHandle;
//                break;
//            }
//        }
        $(SAVEBUTTON).click();
        $(SUBMIT).click();

    }

    public static void writeNewEmail (WebDriver driver){

        $(NEWEMAIL).waitUntil(Condition.visible, 10000).click();
        $(TO).sendKeys("Telkiza@tut.by");
        $(SUBJECT).sendKeys(RandomClass.getSubject());
        $(SUBJECT).pressTab().sendKeys(RandomClass.getMailText());
        //$(MAILBODY).sendKeys(RandomClass.getMailText());
        //RandomClass.getMailText();

    }


}
