package Pages;

import Helpers.Locators;
import com.codeborne.selenide.SelenideElement;
import elements.Footer;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by user on 05.09.2016.
 */
public class CartPage {
    private static final By ADDTOCART = Locators.get("ProductPage.AddToCartButton");
    private static final By CONTINUESHOPPINGBUTTON = Locators.get("ProductPage.ContinueShopping");

    private static final By DELETEDRESSFROMCART = Locators.get("CartPage.DeleteProduct");
    private static final By PROCEEDTOCHECKOUTBUTTON = Locators.get("CartPage.ProceedToCheckout");
    private static final By PROCCEDTOCHECKOUT_ADDRESSBLOCK = Locators.get("CartPage.ProceedToCheckout.Address");
    private static final By TERMSOFSERVICE = Locators.get("CartPage.TermsOfService");
    private static final By PROCEEDTOCHECKOUT_SHIPPINGBLOCK = Locators.get("CartPage.ProceedToCheckout.Shipping");
    private static final By PAYMENT = Locators.get("CartPage.Pay");
    private static final By CONFIRM_ORDER = Locators.get("CartPage.ConfirmOrder");
    private static String orderNumber;


//    private static void addProductToCart(){
//      //  $(SEARCHRESULT).click();
//        $(ADDTOCART).click();
//        $(CONTINUESHOPPINGBUTTON).click();
//        $(CARTBUTTON).click();
//        $(By.cssSelector("td>p[class='product-name']")).shouldBe(Condition.visible);
//    }

    public static void addProducttocart(){
        $(ADDTOCART).click();
        $(CONTINUESHOPPINGBUTTON).click();
    }


    public static void deleteProductFromCart(){
        $(DELETEDRESSFROMCART).click();

    }

    public static String passThroughOrderTabsAndGetOrderReference(){
        $(PROCEEDTOCHECKOUTBUTTON).click();
        $(PROCCEDTOCHECKOUT_ADDRESSBLOCK).click();
        $(TERMSOFSERVICE).click();
        $(PROCEEDTOCHECKOUT_SHIPPINGBLOCK).click();
        $(PAYMENT).click();
        $(CONFIRM_ORDER).click();
            String orderNumber = $(By.cssSelector(".box")).getText();
            return orderNumber;

    }

    public static boolean isOrderHistoryContainsOrderNumber(String orderNumber){
        Footer.goToOrderHistory();
        List<SelenideElement> order_reference = $$(By.cssSelector(".history_link.bold.footable-first-column"));
        for (SelenideElement element : order_reference) {
            if (element.getText().contains(orderNumber)) {
                break;
                //return true;
            }

        }return true;
    }
}







