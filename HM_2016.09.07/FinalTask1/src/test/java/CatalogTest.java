import Core.TestBase;
import com.codeborne.selenide.Condition;
import elements.Header;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 05.09.2016.
 */
public class CatalogTest extends TestBase {

    @Test
    public void tShirtsTest(){
        Header.goToTShirtsPage();
        $(".product-container .product-name").shouldHave(Condition.hasText("T-shirts"));
    }

    @Test
    public void selectEveningDressesPageTest(){
        Header.goToDressesPage();
        $(By.cssSelector(".cat-name")).shouldHave(Condition.exactText("Evening Dresses "));
    }
}
