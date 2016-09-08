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
    public void autorisationTest() throws InterruptedException {
        Header.goToAuthenticationPage();
        AuthenticationPage.createEmail();
        CreateAccountPage.fillingFieldToCreateAnAccount();
        $(By.cssSelector("h1[class='page-heading']")).shouldBe(Condition.visible);
        Header.logOut();
        //Thread.sleep(5000);

    }

    @Test
    public void viewUserNameAfterLoginTest() throws InterruptedException {
        Header.goToMainPage();
        Header.goToAuthenticationPage();
        AuthenticationPage.authentication();
        $(By.cssSelector(".account")).shouldBe(Condition.visible);
        Header.logOut();
        //Thread.sleep(5000);
    }

    @Test
    public void displaysErrorWhenLoginWithWrongEmailTest(){
        Header.goToMainPage();
        Header.goToAuthenticationPage();
        AuthenticationPage.wrongAuthentication();
        $(By.cssSelector(".alert.alert-danger>p")).shouldBe(Condition.visible);

    }

    @Test
    public void displaysErrorWhenCreateAccountWithoutEmailTest(){
        Header.goToMainPage();
        Header.goToAuthenticationPage();
        AuthenticationPage.clickOnCreateAccountButton();
        $(By.id("create_account_error")).shouldBe(Condition.visible);
    }



}
