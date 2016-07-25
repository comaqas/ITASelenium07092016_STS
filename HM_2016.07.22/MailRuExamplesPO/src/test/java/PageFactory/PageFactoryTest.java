package PageFactory;

import Core.TestBase;
import Pages.PageFactory.PageFactoryEmailPage;
import Pages.PageFactory.PageFactoryLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 25.07.2016.
 */
public class PageFactoryTest extends TestBase {

    @Test
    public void numberOfEmailsTest (){
        PageFactoryLoginPage loginPage = PageFactory.initElements(driver, PageFactoryLoginPage.class);
        PageFactoryEmailPage emailPage = PageFactory.initElements(driver, PageFactoryEmailPage.class);

        loginPage.Autorization();
        assertTrue(emailPage.isAuthorizationSuccessful());
        emailPage.CountOfEmails();
    }
}
