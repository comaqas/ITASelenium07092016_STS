package Core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by user on 24.07.2016.
 */
public class TestBase {
    protected WebDriver driver;

    @BeforeTest
    public  void setup(){
        driver = new FirefoxDriver();
        driver.get("https://mail.ru/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterTest
    public void teardown(){
        driver.quit();

    }
}
