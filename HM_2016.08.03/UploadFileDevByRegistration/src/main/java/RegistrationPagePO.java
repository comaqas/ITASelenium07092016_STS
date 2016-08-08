import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 07.08.2016.
 */
public class RegistrationPagePO {
    public static final By USER_NAME = Locators.get("RegistrationPage.UserName");
    public static final By USER_EMAIL = Locators.get("RegistrationPage.UserEmail");
    public static final By USER_PASSWORD = Locators.get("RegistrationPage.UserPassword");
    public static final By USER_PASSWORD_CONFIRMATION = Locators.get("RegistrationPage.UserPasswordConfirmation");
    public static final By USER_FIRST_NAME = Locators.get("RegistrationPage.UserFirstName");
    public static final By USER_LAST_NAME = Locators.get("RegistrationPage.UserLastName");
    public static final By USER_POSITION = Locators.get("RegistrationPage.UserPosition");
    public static final By USER_AGREEMENT = Locators.get("RegistrationPage.Agreement");
    public static final By USER_SUBMIT = Locators.get("RegistrationPage.Submit");
    public static final By UPLOAD_FILE = Locators.get("RegistrationPage.UploadFile");
    public static final By COMPANY_DROPDOWN_RESULT_ITEM = Locators.get("UserCompanyDropDownResult");



    public static void fillRegistrationField(WebDriver driver){
        driver.findElement(MainPO.REGISTRATIONLINK).click();

        driver.findElement(RegistrationPagePO.USER_NAME).sendKeys(HelperRandomClass.getUserName());
        driver.findElement(RegistrationPagePO.USER_EMAIL).sendKeys(HelperRandomClass.getRandomEmail());
        String password1 = HelperRandomClass.getPassword();
        driver.findElement(RegistrationPagePO.USER_PASSWORD).sendKeys(password1);
        driver.findElement(RegistrationPagePO.USER_PASSWORD_CONFIRMATION).sendKeys(password1);
        driver.findElement(RegistrationPagePO.USER_FIRST_NAME).sendKeys(HelperRandomClass.getFirstName());
        driver.findElement(RegistrationPagePO.USER_LAST_NAME).sendKeys(HelperRandomClass.getLastName());
        driver.findElement(RegistrationPagePO.USER_POSITION).sendKeys(HelperRandomClass.getPosition());
        RegistrationPagePO.selectCompany(driver);
        driver.findElement((RegistrationPagePO.USER_AGREEMENT)).click();

        driver.findElement(RegistrationPagePO.UPLOAD_FILE).sendKeys("E:\\UploadFileDevByRegistration\\picture.jpeg");
        driver.findElement(RegistrationPagePO.USER_SUBMIT).click();

    }




    public static String getRandomCompany(List<String> list){
        Random randomizer = new Random();
        return list.get(randomizer.nextInt(list.size()));
    }

    public static void selectCompany(WebDriver driver){
        List<String> itCompanies = Arrays.asList("itransition", "ISsoft", "epam", "viber", "belhard");

        WebElement dropdownSelect = driver.findElement(By.cssSelector(".select2-choice.select2-default"));
        dropdownSelect.sendKeys(getRandomCompany(itCompanies));
        driver.findElement(COMPANY_DROPDOWN_RESULT_ITEM).click();
//
    }


}
