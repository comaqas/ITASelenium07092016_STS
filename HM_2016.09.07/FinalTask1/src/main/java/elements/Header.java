package elements;

import Helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by stelmak on 9/5/2016.
 */
public class Header {
    private static final By SIGNIN = Locators.get("Header.SignIn");
    private static final By CONTACTUS = Locators.get("Header.ContactUsButton");
    private static final By SEARCHFIELD = Locators.get("Header.SearchField");
    private static final By SEARCHBUTTON = Locators.get("Header.SearchButton");
    private static final By WOMENBUTTON = Locators.get("Header.WomenButton");
    private static final By TSHIRTLINK = Locators.get("Header.Menu");
    private static final By LISTVIEW = Locators.get("SearchPageResult.ListView");
    private static final By CARTBUTTON = Locators.get("CartPage.Cart");
    private static final By LOGOUT = Locators.get("Header.Logout");
    private static final By MAINPAGE = Locators.get("Header.MainPage");

    public static void goToAuthenticationPage(){
        $(SIGNIN).click();
    }

    public static void goToContactUsPage(){
        $(CONTACTUS).click();
    }

    public static void searchProductBlouse(){
        $(SEARCHFIELD).sendKeys("Blouse");
        $(SEARCHBUTTON).click();
    }

    public static void goToTShirtsPage(){
        $(WOMENBUTTON).hover();
        $(TSHIRTLINK).click();
    }

    public static void searchProductDress() {
        $(SEARCHFIELD).sendKeys("Dress");
        $(SEARCHBUTTON).click();
        $(LISTVIEW).click();
    }
    public static void goToCart(){
        $(CARTBUTTON).click();
    }

    public static void logOut(){
       $(LOGOUT).click();
    }

    public static void goToMainPage(){
        $(MAINPAGE).click();
    }


}
