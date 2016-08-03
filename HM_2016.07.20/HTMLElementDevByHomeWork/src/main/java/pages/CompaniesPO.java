package pages;

import block.HeaderMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 02.08.2016.
 */
public class CompaniesPO {
    public HeaderMenuBlock headerMenuBlock;

    public CompaniesPO(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }
    public boolean isISSoftDisplayed(WebDriver driver){
        WebElement iSSoft = driver.findElement(By.cssSelector("td>a[href='/issoft']"));
        if(!iSSoft.isDisplayed()){
            return false;
        }return true;
    }

    public void clickOnSalaryLink(){
        headerMenuBlock.clickOnSalaryLink();
    }

}
