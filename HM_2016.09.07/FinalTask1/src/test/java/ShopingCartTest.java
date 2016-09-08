import Core.TestBase;
import Pages.AuthenticationPage;
import Pages.CartPage;
import com.codeborne.selenide.Condition;
import elements.Header;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 05.09.2016.
 */
public class ShopingCartTest extends TestBase {


    @Test
    public void deleteDressFromCartTest() {
        Header.goToMainPage();
        Header.searchProductDress();
        CartPage.addProducttocart();
        Header.goToCart();
        $(By.cssSelector("td>p[class='product-name']")).shouldBe(Condition.visible);
        CartPage.deleteProductFromCart();
        $(By.cssSelector(".alert.alert-warning")).shouldBe(Condition.visible);

    }

    @Test
    public void purchaseOfProductTest() {
        Header.goToMainPage();
        Header.goToAuthenticationPage();
        AuthenticationPage.authentication();
        Header.searchProductDress();
        CartPage.addProducttocart();
        Header.goToCart();
        String orderNumber = CartPage.passThroughOrderTabsAndGetOrderReference();
        //System.out.println(orderNumber.substring(180,189));
//        Footer.goToOrderHistory();
//        List<SelenideElement> order_reference = $$(By.cssSelector(".history_link.bold.footable-first-column"));
//        for (SelenideElement element : order_reference) {
//            if (element.getText().contains(orderNumber)) {
//                return;
//
//            }
//
//            ///Assert.assertTrue(element.getText().contains(orderNumber));
//
//        }
        Assert.assertTrue(CartPage.isOrderHistoryContainsOrderNumber(orderNumber), "Assert is failed");

        Header.logOut();
    }
}
