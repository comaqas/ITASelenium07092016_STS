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

        Assert.assertTrue(CartPage.isOrderHistoryContainsOrderNumber(orderNumber), "Assert is failed");

        Header.logOut();
    }
}
