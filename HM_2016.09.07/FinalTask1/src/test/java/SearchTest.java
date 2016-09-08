import Core.TestBase;
import com.codeborne.selenide.Condition;
import elements.Header;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by stelmak on 9/5/2016.
 */
public class SearchTest extends TestBase {

    @Test
    public void searchBlouseTest(){
        Header.searchProductBlouse();
        $(".right-block>h5>a").shouldHave(Condition.text("Blouse"));
    }
}
