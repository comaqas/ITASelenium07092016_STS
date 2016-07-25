package Static;

import Core.TestBase;
import Pages.Static.EmailsPage;
import Pages.Static.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 24.07.2016.
 */
public class MailRuTest extends TestBase {

    @Test
    public void numberOfEmailsTest (){
        LoginPage.Autorization(driver);
        assertTrue(EmailsPage.isAuthorizationSuccessful(driver));
        EmailsPage.CountOfEmails(driver);
    }
}
