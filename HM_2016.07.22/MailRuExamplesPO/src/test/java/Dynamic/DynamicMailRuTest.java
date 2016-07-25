package Dynamic;

import Core.TestBase;
import Pages.Dynamic.DynamicEmailPage;
import Pages.Dynamic.DynamicLoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 24.07.2016.
 */
public class DynamicMailRuTest extends TestBase{

    @Test
    public void numberOfEmailsTest (){
        DynamicLoginPage loginPage = new DynamicLoginPage(driver);
        DynamicEmailPage emailPage = new DynamicEmailPage(driver);

        loginPage.Autorization();
        assertTrue(emailPage.isAuthorizationSuccessful());
        emailPage.CountOfEmails();
    }

}
