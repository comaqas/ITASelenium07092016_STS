import block.HeaderMenuBlock;
import core.TestBase;
import org.testng.annotations.Test;
import pages.CompaniesPO;
import pages.LentaPO;
import pages.SalaryPO;
import pages.VacanciesPO;

import static org.testng.Assert.assertTrue;

/**
 * Created by user on 02.08.2016.
 */
public class NavigationTest extends TestBase{
    private SalaryPO salaryPO = new SalaryPO(driver);
    private CompaniesPO companiesPO = new CompaniesPO(driver);
    private LentaPO lentaPO = new LentaPO(driver);
    private VacanciesPO vacanciesPO = new VacanciesPO(driver);


    @Test
    public void devByNavigate(){
        lentaPO.clickOnLentaLink();
        assertTrue(lentaPO.isLogotypeDisplayed(driver));
        lentaPO.clickOnCompaniesLink();
        assertTrue(companiesPO.isISSoftDisplayed(driver));
        companiesPO.clickOnSalaryLink();
        assertTrue(salaryPO.isTextDisplayed(driver));
        salaryPO.clickOnVacanciesLink();
        assertTrue(vacanciesPO.isVacanciesSearchTextDisplayed(driver));


    }

}
