import Core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 07.08.2016.
 */
public class UploadFileRegistrationPageDevByTest extends TestBase {

    @Test
    public void UploadFileTest(){
        RegistrationPagePO.fillRegistrationField(driver);
        Assert.assertTrue(driver.findElement(MainPO.CONFIRMATION_REGISTRATION_POPUP_MESSAGE).isDisplayed(), "Popup message is not displayed");
//
}

}
