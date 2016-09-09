import Core.TestBase;
import Pages.EMailPage;
import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by user on 25.08.2016.
 */
public class MailRuTest extends TestBase{
    @Test
    public void numberOfEmailsTest (){
       // open("https://mail.ru");
        Configuration.holdBrowserOpen = true;

        //LoginPage loginPage = open("https://mail.ru", LoginPage.class);

        LoginPage.Autorization();
       // $(By.cssSelector(".b-nav__item__text")).shouldBe(Condition.visible);
        EMailPage.countOfEmails();
    }

    @Test
    public void uploadAvatar() {

        Configuration.holdBrowserOpen = true;
        LoginPage.Autorization();
        EMailPage.addPhotoToPrifile();

    }

    @Test
    public void sentNewEmail(){
        Configuration.holdBrowserOpen = true;
        LoginPage.Autorization();
        EMailPage.writeNewEmail();

    }


}
