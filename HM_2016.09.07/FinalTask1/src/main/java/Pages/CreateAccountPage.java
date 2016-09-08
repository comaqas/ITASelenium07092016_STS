package Pages;

import Helpers.Locators;
import Helpers.RandomClass;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by stelmak on 8/30/2016.
 */
public class CreateAccountPage {

    public static final By GENDER = Locators.get("CreateAccountPage.Gender");
    public static final By FIRSTNAME = Locators.get("CreateAccount.Personal.FirstName");
    public static final By LASTNAME = Locators.get("CreateAccount.Personal.LastName");
    public static final By PASSWORD = Locators.get("CreateAccount.Personal.Password");
    public static final By DATEOFBIRTH = Locators.get("CreateAccount.Personal.DateOfBirth");
    public static final By MONTHOFBIRTH = Locators.get("CreateAccount.Personal.MonthOfBirth");
    public static final By YEAROFBIRTH = Locators.get("CreateAccount.Personal.YearOfBirth");
    public static final By FIRSTNAMEADDRESS = Locators.get("CreateAccount.Address.FirstName");
    public static final By LASTNAMEADDRESS = Locators.get("CreateAccount.Address.LastName");
    public static final By ADDRESS = Locators.get("CreateAccount.Address.Address");
    public static final By CITY = Locators.get("CreateAccount.Address.City");
    public static final By STATE = Locators.get("CreateAccount.Address.State");
    public static final By ZIPCODE = Locators.get("CreateAccount.Address.ZipCode");
    public static final By COUNTRY = Locators.get("CreateAccount.Address.Country");
    public static final By MOBILEPHONE = Locators.get("CreateAccount.Address.MobilePhone");
    public static final By ADDRESSALIAS = Locators.get("CreateAccount.Address.AddressAlias");
    public static final By REGISTERBUTTON = Locators.get("CreateAccount.Address.RegisterButton");


    private static String password = "qwerty";

    public static void fillingFieldToCreateAnAccount(){
       // String password = "qwerty";
        $(GENDER).click();
        $(FIRSTNAME).sendKeys(RandomClass.getFirstName());
        $(LASTNAME).sendKeys(RandomClass.getLastName());
        $(PASSWORD).sendKeys(password);
        $(DATEOFBIRTH).selectOptionByValue("25");
        $(MONTHOFBIRTH).selectOptionByValue("3");
        $(YEAROFBIRTH).selectOptionByValue("1995");
        $(FIRSTNAMEADDRESS).sendKeys(RandomClass.getFirstName());
        $(LASTNAMEADDRESS).sendKeys(RandomClass.getLastName());
        $(ADDRESS).sendKeys(RandomClass.getAddress());
        $(CITY).sendKeys(RandomClass.getCity());
        $(STATE).selectOptionByValue("1");
        //$(COUNTRY).selectOptionByValue("");
        $(ZIPCODE).sendKeys(RandomClass.getZip());
        $(MOBILEPHONE).sendKeys(RandomClass.getMobilePhone());
        $(ADDRESSALIAS).sendKeys(RandomClass.getAddressAlias());
        $(REGISTERBUTTON).click();

    }

}
