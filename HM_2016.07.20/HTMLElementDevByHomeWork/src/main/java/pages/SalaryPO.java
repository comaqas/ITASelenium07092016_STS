package pages;

import block.HeaderMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 02.08.2016.
 */
public class SalaryPO {
    public HeaderMenuBlock headerMenuBlock;


    public SalaryPO(WebDriver driver){
        HtmlElementLoader.populatePageObject(this,driver);
    }

    public boolean isTextDisplayed(WebDriver driver){
        WebElement text = driver.findElement(By.cssSelector(".input.info-count>h3"));
        if(!text.isDisplayed()){
            return false;
        }return true;
    }

    public void clickOnVacanciesLink(){
        headerMenuBlock.ClickOnVacanciesLink();
    }
}
