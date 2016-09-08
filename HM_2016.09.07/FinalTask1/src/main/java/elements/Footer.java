package elements;

import Helpers.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 08.09.2016.
 */
public class Footer {
    private static final By MYORDER = Locators.get("Footer.MyOrder");

    public static void goToOrderHistory(){
        $(MYORDER).click();
    }
}
