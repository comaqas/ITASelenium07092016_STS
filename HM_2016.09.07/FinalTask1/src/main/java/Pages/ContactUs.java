package Pages;

import Helpers.Locators;
import Helpers.RandomClass;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by stelmak on 9/5/2016.
 */
public class ContactUs {

    public static final By SUBJECTHEADING = Locators.get("ContactUs.SubjectHeading");
    public static final By EMAILADDRESS = Locators.get("ContactUs.EmailAddress");
    public static final By ORDERREFERENCE = Locators.get("ContactUs.OrderReference");
    public static final By ATTACHFILE = Locators.get("ContactUs.AttachFile");
    public static final By MESSAGE = Locators.get("ContactUs.Message");
    public static final By SENDBUTTON = Locators.get("ContactUs.SendButton");

    public static void contactUsPageFilling(){

        $(SUBJECTHEADING).selectOptionByValue("2");
        $(EMAILADDRESS).sendKeys("test3@tut.com");
        $(ORDERREFERENCE).sendKeys(RandomClass.getOrderReference());
        $(ATTACHFILE).uploadFile(new File("Text.txt"));
        $(MESSAGE).sendKeys(RandomClass.getMessage());
        $(SENDBUTTON).click();
    }

    public static void contactUsDisplaysErrorMessage () {

        $(SUBJECTHEADING).selectOptionByValue("2");
        $(EMAILADDRESS).sendKeys("test3@tut.com");
        $(ORDERREFERENCE).sendKeys(RandomClass.getOrderReference());
        $(SENDBUTTON).click();
    }

}
