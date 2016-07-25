package Flow;

import Core.TestBase;
import Pages.Flow.FlowEmailPage;
import Pages.Flow.FlowLoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 24.07.2016.
 */
public class FlowMailRuTest extends TestBase {

    @Test
    public void numberOfEmailsTest () {
        FlowLoginPage loginPage = new FlowLoginPage(driver);
        FlowEmailPage emailPage = new FlowEmailPage(driver);

        loginPage
                .Autorization();

        assertTrue(emailPage.isAuthorizationSuccessful());

        emailPage
                .CountOfEmails();






    }

}
