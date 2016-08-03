package block;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Link;

/**
 * Created by user on 02.08.2016.
 */

@Name("Menu Bock")
@Block(@FindBy(css = ".dev-container.header-nav"))
public class HeaderMenuBlock extends HtmlElement{

    @Name("Lenta Link")
    @FindBy(css = "a[href='https://dev.by/lenta']")
    public Link lentaLink;

    public void clickOnLentaLink(){
        lentaLink.click();
    }


    @Name("Companies Link")
    @FindBy(css = "ul>li>a[href='https://companies.dev.by/']")
    public Link companiesLink;

    public  void clickOnCompaniesLink(){
        companiesLink.click();
    }

    @Name("Salary Link")
    @FindBy(css = "ul>li>a[href='https://salaries.dev.by/']")
    public Link salaryLink;

    public void clickOnSalaryLink(){
        salaryLink.click();
    }

    @Name("Vacancies Link")
    @FindBy(css = "ul>li>a[href='https://jobs.dev.by/']")
    public Link vacanciesLink;

    public void ClickOnVacanciesLink(){
        vacanciesLink.click();
    }




    public Rectangle getRect() {
        return null;
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }
}
