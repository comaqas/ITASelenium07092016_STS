package pages;

import block.HeaderMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 02.08.2016.
 */
public class LentaPO {

    public HeaderMenuBlock headerMenuBlock;

    public LentaPO(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }

    public void clickOnLentaLink(){
        headerMenuBlock.clickOnLentaLink();
    }

    public void clickOnCompaniesLink(){
        headerMenuBlock.clickOnCompaniesLink();
    }

    public boolean isLogotypeDisplayed(WebDriver driver){
        WebElement logo = driver.findElement(By.className("header-logo"));
        if(!logo.isDisplayed()){
            return false;
        }return true;
    }

}
