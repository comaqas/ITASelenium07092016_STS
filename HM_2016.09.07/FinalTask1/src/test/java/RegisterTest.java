import Core.TestBase;
import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import com.codeborne.selenide.Condition;
import elements.Header;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 29.08.2016.
 */
public class RegisterTest extends TestBase{

    @Test
    public void autorisationTest()  {
        Header.goToAuthenticationPage();
        AuthenticationPage.createEmail();
        CreateAccountPage.fillingFieldToCreateAnAccount();
        $(By.cssSelector("h1[class='page-heading']")).shouldBe(Condition.visible);
        Header.logOut();

    }


}
