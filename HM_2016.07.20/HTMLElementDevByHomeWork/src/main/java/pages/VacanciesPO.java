package pages;

import block.HeaderMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by user on 02.08.2016.
 */
public class VacanciesPO {
    public HeaderMenuBlock headerMenuBlock;

    public VacanciesPO(WebDriver driver) {
        HtmlElementLoader.populatePageObject(this, driver);
    }

    public boolean isVacanciesSearchTextDisplayed(WebDriver driver){
        WebElement text = driver.findElement(By.cssSelector(".column-left>h3"));
        if(!text.isDisplayed()){
            return false;
        }return true;
    }
}

