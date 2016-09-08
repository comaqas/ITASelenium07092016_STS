import Core.TestBase;
import Pages.ContactUs;
import com.codeborne.selenide.Condition;
import elements.Header;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by stelmak on 9/5/2016.
 */
public class ContactUsTest extends TestBase {
    @Test
    public void pageFillingWithAttachFileTest(){
        Header.goToContactUsPage();
        ContactUs.contactUsPageFilling();
        $(".alert.alert-success").shouldBe(Condition.visible);

    }

    @Test
    public void checkErrorMessageIsDysplayedTest (){
        Header.goToContactUsPage();
        ContactUs.contactUsDisplaysErrorMessage();
        $(".alert.alert-danger>ol>li").shouldBe(Condition.visible).shouldHave(Condition.exactText("The message cannot be blank."));
    }
}
